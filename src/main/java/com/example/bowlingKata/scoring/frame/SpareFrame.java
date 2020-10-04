package com.example.bowlingKata.scoring.frame;

import java.util.Objects;

public class SpareFrame implements Frame {
    private final        Roll firstTry;
    private final Roll secondTry;

    private SpareFrame(final Roll firstTry, final Roll secondTry) {
        this.firstTry = firstTry;
        this.secondTry = secondTry;
    }

    public static SpareFrame from(final Roll firstTry, final Roll secondTry) {
        Objects.requireNonNull(firstTry);
        Objects.requireNonNull(secondTry);
        return new SpareFrame(firstTry, secondTry);
    }

    public Integer score() {
        return secondTry.score();
    }

    @Override
    public String toString() {
        return firstTry.toString() + secondTry.toString();
    }
}
