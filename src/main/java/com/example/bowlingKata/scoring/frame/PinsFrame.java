package com.example.bowlingKata.scoring.frame;

import java.util.Objects;

public class PinsFrame implements Frame {
    private final        Roll firsTry;
    private final        Roll secondTry;

    private PinsFrame(final Roll firstTry, final Roll secondTry) {
        this.firsTry = firstTry;
        this.secondTry = secondTry;
    }

    public static PinsFrame from(final Roll firsTry, final Roll secondTry) {
        Objects.requireNonNull(firsTry);
        Objects.requireNonNull(secondTry);
        //TODO Aquí falta ensureFirstTryIsPins y ensureSecondTry...
        return new PinsFrame(firsTry, secondTry);
    }

    public Integer score() {
        return this.firsTry.score() + this.secondTry.score();
    }

    @Override
    public String toString() {
        return firsTry.toString() + secondTry.toString();
    }
}
