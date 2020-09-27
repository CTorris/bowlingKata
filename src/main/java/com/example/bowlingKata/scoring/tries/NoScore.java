package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class NoScore implements Tries {
    private static final int NO_POINTS = 0;
    @Override
    public String symbol() {
        return SpecialSymbols.NO_PINS.symbol();
    }

    @Override
    public Integer points() {
        return NO_POINTS;
    }
}
