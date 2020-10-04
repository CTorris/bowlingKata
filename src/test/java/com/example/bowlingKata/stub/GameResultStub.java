package com.example.bowlingKata.stub;

import com.example.bowlingKata.scoring.GameResult;
import com.example.bowlingKata.scoring.ScoringSymbols;
import org.assertj.core.util.Strings;

public class GameResultStub {
    private static final int MAX_POSIBLE_STRIKES = 12;
    private static final int NUMBER_OF_TRIES_WITHOUT_SPARES_AND_STRIKES = 10;

    public static GameResult allStrikes() {
        return GameResult.from(ScoringSymbols.STRIKE.symbol().toString().repeat(MAX_POSIBLE_STRIKES));
    }

    public static GameResult noStrikesAndNoSparesWithNumberOfKnockedPins(int knockedPinsByTry) {
        return GameResult.from(Strings.concat(knockedPinsByTry, ScoringSymbols.NO_PINS.symbol()).repeat(NUMBER_OF_TRIES_WITHOUT_SPARES_AND_STRIKES));
    }

    public static GameResult allSparesWithNumberOfKnokedPins(int knockedPinsByTry) {
        return GameResult.from(Strings.concat(Strings.concat(knockedPinsByTry, ScoringSymbols.SPARE.symbol()).repeat(NUMBER_OF_TRIES_WITHOUT_SPARES_AND_STRIKES), knockedPinsByTry));
    }
}
