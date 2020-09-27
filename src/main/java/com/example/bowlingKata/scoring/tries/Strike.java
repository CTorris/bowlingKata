package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class Strike implements Tries {
    private static final int STRIKE_POINTS = 10;
    @Override
    public String symbol() {
        return SpecialSymbols.STRIKE.symbol();
    }

    @Override
    public Integer points() {
        return STRIKE_POINTS;
    }
}
