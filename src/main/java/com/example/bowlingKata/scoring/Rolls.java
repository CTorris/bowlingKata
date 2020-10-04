package com.example.bowlingKata.scoring;

import com.example.bowlingKata.scoring.frame.Roll;
import com.example.bowlingKata.scoring.frame.RollFactory;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.example.bowlingKata.scoring.ScoringSymbols.SPARE;
import static com.example.bowlingKata.scoring.ScoringSymbols.STRIKE;

public class Rolls {
    private static final int MIN_ROLLS_PER_GAME = 12;
    private static final int MAX_ROLLS_PER_GAME = 22;
    private static final int PLUS_ROLLS_PER_STRIKE_FRAME = 2;
    private static final int PLUS_ROLLS_PER_SPARE_FRAME = 1;
    private static final int ROLLS_PER_STRIKE_FRAME = 1;
    private static final int ROLLS_PER_FRAME = 2;

    private final List<Roll> rolls;
    private final Integer lastFrame;

    private Rolls(final List<Roll> rolls) {
        this.rolls = rolls;
        this.lastFrame = lastFrameIndex(rolls);
    }

    public static Rolls from(String rolls) {
        Objects.requireNonNull(rolls);
        ensureValidNumberOfRolls(rolls);
        List<Roll> tries = rolls.chars().mapToObj(c -> (char) c).map(RollFactory::create).collect(Collectors.toList());
        return new Rolls(tries);
    }

//    public int rollScore(int rollNumber) {
//        return roll(rollNumber).score();
//    }

    public int strikeScore(int rollNumber) {
        return roll(rollNumber).score() + roll(rollNumber + 1).score() + roll(rollNumber + 2).score();
    }

    public int spareScore(int rollNumber) {
        return roll(rollNumber + 1).score() + roll(rollNumber + 2).score();
    }

    public int pinsScore(int rollNumber) {
        return roll(rollNumber).score() + roll(rollNumber + 1).score();
    }

    public boolean isStrikeFrame(int rollNumber) {
        return roll(rollNumber).is(STRIKE.symbol());
    }

    public boolean isSpareFrame(int rollNumber) {
        return roll(rollNumber + 1).is(SPARE.symbol());
    }

    public Roll roll(int rollNumber) {
        return this.rolls.get(rollNumber);
    }

    public Integer lastFrame() {
        return this.lastFrame;
    }

    public int nextRollIndex(int actualRollIndex) {
        if (isStrikeFrame(actualRollIndex)) return actualRollIndex + ROLLS_PER_STRIKE_FRAME;
        return actualRollIndex + ROLLS_PER_FRAME;
    }

    private int lastFrameIndex(List<Roll> rolls) {
        if (endsWithStrike(rolls)) return rolls.size() - PLUS_ROLLS_PER_STRIKE_FRAME - ROLLS_PER_STRIKE_FRAME;
        if (endsWithStrike(rolls)) return rolls.size() - PLUS_ROLLS_PER_SPARE_FRAME - ROLLS_PER_FRAME;
        //si es spare 5/5 es (size - 1) - 2
        //si es strike XXX es (size - 2) - 1
        //si es normal 5- es size-2
        return rolls.size() - ROLLS_PER_FRAME;
    }

    private boolean endsWithStrike(List<Roll> rolls) {
        return isStrikeFrame(rolls.size() - PLUS_ROLLS_PER_STRIKE_FRAME - ROLLS_PER_STRIKE_FRAME);
    }

    private static void ensureValidNumberOfRolls(String rolls) {
        if (rolls.length() < MIN_ROLLS_PER_GAME || rolls.length() > MAX_ROLLS_PER_GAME) throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return rolls.stream().map(Roll::toString).collect(Collectors.joining());
    }
}
