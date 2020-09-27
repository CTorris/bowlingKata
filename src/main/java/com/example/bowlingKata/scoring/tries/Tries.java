package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public interface Tries {
    String symbol();
    Integer points();
    boolean is(SpecialSymbols specialSymbol);
}
