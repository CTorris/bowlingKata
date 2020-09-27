package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class Strike implements Tries {
    @Override
    public String symbol() {
        return SpecialSymbols.STRIKE.symbol();
    }
}
