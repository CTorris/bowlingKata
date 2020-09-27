package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class Spare implements Tries {
    private static final int SPARE_POINTS = 10;

    @Override
    public String symbol() {
        return SpecialSymbols.SPARE.symbol();
    }

    @Override
    public Integer points() {
        return SPARE_POINTS;
    }
}
