package com.example.bowlingKata.scoring.roll;

import com.example.bowlingKata.scoring.ScoringSymbols;
import com.example.bowlingKata.scoring.frame.Roll;

import java.util.Objects;

public class KnockedPins implements Roll {
    private static final Integer NO_PINS = 0;
    private final Integer value;

    public KnockedPins(final Integer value) {
        this.value = value;
    }

    public int score() {
        return this.value;
    }

    @Override
    public boolean is(Character character) {
        if (this.value.equals(NO_PINS)) return ScoringSymbols.NO_PINS.match(character);
        return this.value.equals(Character.getNumericValue(character));
    }

    public static KnockedPins with(Character numberOfKnokedPins) {
        Objects.requireNonNull(numberOfKnokedPins);
        ensureIsNumber(numberOfKnokedPins);
        return new KnockedPins(numericValue(numberOfKnokedPins));
    }

    public static KnockedPins zeroKnockedPins(Character character) {
        ensureIsZeroPinsSymbol(character);
        return new KnockedPins(NO_PINS);
    }

    private static void ensureIsNumber(Character character) {
        if (! Character.isDigit(character)) throw new IllegalArgumentException();
    }

    private static void ensureIsZeroPinsSymbol(Character character) {
        if (! ScoringSymbols.NO_PINS.match(character)) throw new IllegalArgumentException();
    }

    private static Integer numericValue(Character number) {
        return Character.getNumericValue(number);
    }

    @Override
    public String toString() {
        return this.value.equals(NO_PINS) ? ScoringSymbols.NO_PINS.symbol().toString() : this.value.toString();
    }
}
