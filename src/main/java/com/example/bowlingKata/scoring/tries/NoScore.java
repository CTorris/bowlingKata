package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class NoScore implements Tries {
    @Override
    public String symbol() {
        return SpecialSymbols.NO_PINS.symbol();
    }
}
