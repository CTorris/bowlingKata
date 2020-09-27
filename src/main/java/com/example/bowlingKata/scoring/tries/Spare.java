package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class Spare implements Tries {
    @Override
    public String symbol() {
        return SpecialSymbols.SPARE.symbol();
    }
}
