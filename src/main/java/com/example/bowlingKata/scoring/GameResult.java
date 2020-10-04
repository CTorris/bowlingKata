package com.example.bowlingKata.scoring;

import java.util.Objects;

public class GameResult {
    private final Rolls rolls;

    public GameResult(Rolls rolls) {
        this.rolls = rolls;
    }

    public static GameResult from(String rolls) {
        Objects.requireNonNull(rolls);
        return new GameResult(Rolls.from(rolls));
    }

    public int score() {
        int gameScore = 0;
        int actualRoll = 0;
        while (actualRoll <= rolls.lastFrame()) {
            gameScore += scoreFrame(actualRoll);
            actualRoll = rolls.nextRollIndex(actualRoll);
        }
        return gameScore;
    }

    private Integer scoreFrame(int frameIndex) {
        if (rolls.isStrikeFrame(frameIndex)) return rolls.strikeScore(frameIndex);
        else if (rolls.isSpareFrame(frameIndex)) return rolls.spareScore(frameIndex);
        return rolls.pinsScore(frameIndex);
    }

    @Override
    public String toString() {
        return this.rolls.toString();
    }
}
