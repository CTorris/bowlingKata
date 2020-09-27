package com.example.bowlingKata.scoring;

public enum SpecialSymbols {
    NO_PINS("-"),
    STRIKE("X"),
    SPARE("/");

    private final String symbol;

    SpecialSymbols(String symbol) {
        this.symbol = symbol;
    }

    public String symbol() {
        return this.symbol;
    }
}
