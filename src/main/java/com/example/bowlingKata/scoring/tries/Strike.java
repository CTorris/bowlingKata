package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class Strike implements Tries {
    private static final int STRIKE_POINTS = 10;
    private static final SpecialSymbols STRIKE_SYMBOL = SpecialSymbols.STRIKE;
    @Override
    public String symbol() {
        return STRIKE_SYMBOL.symbol();
    }

    @Override
    public Integer points() {
        return STRIKE_POINTS;
    }

    @Override
    public boolean is(SpecialSymbols specialSymbol) {
        return STRIKE_SYMBOL.equals(specialSymbol);
    }
}
