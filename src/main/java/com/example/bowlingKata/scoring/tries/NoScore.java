package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class NoScore implements Tries {
    private static final int NO_POINTS = 0;
    private static final SpecialSymbols NO_PINS = SpecialSymbols.NO_PINS;
    @Override
    public String symbol() {
        return NO_PINS.symbol();
    }

    @Override
    public Integer points() {
        return NO_POINTS;
    }

    @Override
    public boolean is(SpecialSymbols specialSymbol) {
        return NO_PINS.equals(specialSymbol);
    }
}
