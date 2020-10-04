package com.example.bowlingKata.scoring.roll;

import com.example.bowlingKata.scoring.ScoringSymbols;
import com.example.bowlingKata.scoring.frame.Roll;

public class Spare implements Roll {
    private static final int SPARE_SCORE = 10;

    private Spare() {}

    public static Spare from(Character character) {
        ensureIsSpareSymbol(character);
        return new Spare();
    }

    @Override
    public boolean is(Character character) {
        return ScoringSymbols.SPARE.match(character);
    }

    private static void ensureIsSpareSymbol(Character character) {
        if (! ScoringSymbols.SPARE.match(character)) throw new IllegalArgumentException();
    }

    @Override
    public int score() {
        return SPARE_SCORE;
    }

    @Override
    public String toString() {
        return ScoringSymbols.SPARE.symbol().toString();
    }
}
