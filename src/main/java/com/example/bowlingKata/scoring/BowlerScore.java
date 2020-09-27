package com.example.bowlingKata.scoring;

import com.example.bowlingKata.scoring.tries.Tries;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class BowlerScore {
    private static final int MAX_FRAMES_WITHOUT_SPECIAL_TRIES = 10;
    private final List<Tries> tries;

    public BowlerScore(List<Tries> tries) {
        this.tries = tries;
    }

    public Integer score() {
//        throw new NotImplementedException();
        int totalScore = 0;
        for(int i = 0; i < MAX_FRAMES_WITHOUT_SPECIAL_TRIES; i++) {
            if (SpecialSymbols.STRIKE.symbol().equals(tries.get(i).symbol())) {
                totalScore += tries.get(i).points() + tries.get(i + 1).points() + tries.get(i + 2).points();
            }
        }
        return totalScore;
    }

    public String toString() {
        return tries.stream().map(Tries::symbol).collect(Collectors.joining());
    }
}
