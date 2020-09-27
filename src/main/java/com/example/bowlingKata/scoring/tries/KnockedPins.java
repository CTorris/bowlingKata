package com.example.bowlingKata.scoring.tries;

public class KnockedPins implements Tries {

    private final int knockedPins;

    public KnockedPins(final int knockedPins) {
        this.knockedPins = knockedPins;
    }

    @Override
    public String symbol() {
        return String.valueOf(this.knockedPins);
    }
}
