package com.example.bowlingKata.scoring;

import com.example.bowlingKata.scoring.tries.Tries;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class BowlerScore {
    private final List<Tries> tries;

    public BowlerScore(List<Tries> tries) {
        this.tries = tries;
    }

    public Integer score() {
        throw new NotImplementedException();
    }

    public String toString() {
        return tries.stream().map(Tries::symbol).collect(Collectors.joining());
    }
}
