package com.example.bowlingKata.scoring.frame;

import java.util.Objects;

public class StrikeFrame implements Frame {
    private final Roll firstTry;

    public StrikeFrame(final Roll firstTry) {
        this.firstTry = firstTry;
    }

    public static StrikeFrame from(final Roll firstTry) {
        Objects.requireNonNull(firstTry);
        return new StrikeFrame(firstTry);
    }

    public Integer score() {
        return firstTry.score();
    }

    public String toString() {
        return firstTry.toString();
    }
}
