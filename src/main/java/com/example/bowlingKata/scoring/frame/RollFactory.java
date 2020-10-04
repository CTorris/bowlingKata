package com.example.bowlingKata.scoring.frame;

import com.example.bowlingKata.scoring.ScoringSymbols;
import com.example.bowlingKata.scoring.roll.KnockedPins;
import com.example.bowlingKata.scoring.roll.Spare;
import com.example.bowlingKata.scoring.roll.Strike;

public class RollFactory {
    public static Roll create(Character rollValue) {
        if (ScoringSymbols.STRIKE.match(rollValue)) return strike(rollValue);
        if (ScoringSymbols.SPARE.match(rollValue)) return spare(rollValue);
        if (ScoringSymbols.NO_PINS.match(rollValue)) return noPins(rollValue);
        return knockedPins(rollValue);
    }

    private static Roll knockedPins(Character numberOfKnockedPins) {
        return KnockedPins.with(numberOfKnockedPins);
    }

    private static Roll noPins(Character noPinsSymbol) {
        return KnockedPins.zeroKnockedPins(noPinsSymbol);
    }

    private static Roll spare(Character spareSymbol) {
        return Spare.from(spareSymbol);
    }

    private static Roll strike(Character strikeSymbol) {
        return Strike.from(strikeSymbol);
    }
}
