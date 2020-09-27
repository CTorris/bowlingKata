package com.example.bowlingKata.scoring.tries;

import com.example.bowlingKata.scoring.SpecialSymbols;

public class KnockedPins implements Tries {

    private final Integer knockedPins;

    public KnockedPins(final int knockedPins) {
        this.knockedPins = knockedPins;
    }

    @Override
    public String symbol() {
        return String.valueOf(this.knockedPins);
    }

    @Override
    public Integer points() {
        return knockedPins;
    }

    @Override
    public boolean is(SpecialSymbols specialSymbol) {
        return false;
    }
}
