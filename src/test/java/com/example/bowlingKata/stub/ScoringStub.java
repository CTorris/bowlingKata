package com.example.bowlingKata.stub;

import com.example.bowlingKata.scoring.BowlerScore;
import com.example.bowlingKata.scoring.tries.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ScoringStub {
    private static final int MAX_POSIBLE_STRIKES = 12;
    private static final int NUMBER_OF_TRIES_WITHOUT_SPARES_AND_STRIKES = 10;
    public static BowlerScore allStrikes() {
        return new BowlerScore(Collections.nCopies(MAX_POSIBLE_STRIKES, new Strike()));
    }

    public static BowlerScore noStrikesAndNoSparesWithNumberOfKnockedPins(int knockedPinsByTry) {
        List<Tries> onlyPinsTurn = Arrays.asList(new KnockedPins(knockedPinsByTry), new NoScore());
        List<Tries> allTurnOnlyPinsKnocked = Collections.nCopies(NUMBER_OF_TRIES_WITHOUT_SPARES_AND_STRIKES, onlyPinsTurn)
                                                        .stream()
                                                        .flatMap(List::stream)
                                                        .collect(Collectors.toList());
        return new BowlerScore(allTurnOnlyPinsKnocked);
    }

    public static BowlerScore allSparesWithNumberOfKnokedPins(int knockedPinsByTry) {
        List<Tries> onlyPinsTurn = Arrays.asList(new KnockedPins(knockedPinsByTry), new Spare());
        List<Tries> allTurnOnlyPinsKnocked = Collections.nCopies(NUMBER_OF_TRIES_WITHOUT_SPARES_AND_STRIKES, onlyPinsTurn)
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        allTurnOnlyPinsKnocked.add(new KnockedPins(knockedPinsByTry));
        return new BowlerScore(allTurnOnlyPinsKnocked);
    }
}
