package com.example.bowlingKata.scoring.roll;

import com.example.bowlingKata.scoring.ScoringSymbols;
import com.example.bowlingKata.scoring.frame.Roll;

public class Strike implements Roll {
    private static final Integer STRIKE_SCORE = 10;

    private Strike() {}

    public static Strike from(Character character) {
        ensureIsStrikeSymbol(character);
        return new Strike();
    }

    @Override
    public boolean is(Character character) {
        return ScoringSymbols.STRIKE.match(character);
    }

    private static void ensureIsStrikeSymbol(Character character) {
        if (! ScoringSymbols.STRIKE.match(character)) throw new IllegalArgumentException();
    }

    @Override
    public int score() {
        return STRIKE_SCORE;
    }

    @Override
    public String toString() {
        return ScoringSymbols.STRIKE.symbol().toString();
    }
}
