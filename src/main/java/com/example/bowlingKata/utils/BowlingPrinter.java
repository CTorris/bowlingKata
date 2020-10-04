package com.example.bowlingKata.utils;

import com.example.bowlingKata.scoring.GameResult;

public class BowlingPrinter {
    private static final String SPACE     = " ";
    public static void print(GameResult gameResult) {
        gameResult.rolls().stream()
                          .map(r -> r.toString().concat(SPACE))
                          .forEach(System.out::print);
    }
}
