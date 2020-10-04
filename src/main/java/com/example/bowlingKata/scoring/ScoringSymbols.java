package com.example.bowlingKata.scoring;

public enum ScoringSymbols {
    NO_PINS('-'),
    SPARE('/'),
    STRIKE('X');

    private final Character symbol;

    ScoringSymbols(final Character symbol) {
        this.symbol = symbol;
    }

    public static ScoringSymbols of(Character symbol) {
        return ScoringSymbols.valueOf(symbol.toString());
    }

    public boolean match(Character symbol) {
        return this.symbol.equals(symbol);
    }

    public Character symbol() {
        return this.symbol;
    }
}
