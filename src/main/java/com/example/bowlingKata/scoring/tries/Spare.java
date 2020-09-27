package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class Spare implements Tries {
    private static final int SPARE_POINTS = 10;
    private static final SpecialSymbols SPARE = SpecialSymbols.SPARE;

    @Override
    public String symbol() {
        return SPARE.symbol();
    }

    @Override
    public Integer points() {
        return SPARE_POINTS;
    }

    @Override
    public boolean is(SpecialSymbols specialSymbol) {
        return SPARE.equals(specialSymbol);
    }
}
