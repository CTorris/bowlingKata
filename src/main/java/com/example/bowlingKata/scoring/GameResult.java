package com.example.bowlingKata.scoring;

import com.example.bowlingKata.utils.NotImplementedException;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GameResult {
    private final List<Character> rolls;

    public GameResult(List<Character> rolls) {
        this.rolls = rolls;
    }

    public static GameResult from(String rolls) {
        Objects.requireNonNull(rolls);
        return new GameResult(rolls.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
    }

    public int score() throws NotImplementedException {
        throw new NotImplementedException("This method is not implemented yet!");
    }

    @Override
    public String toString() {
        return this.rolls.stream().map(Object::toString).collect(Collectors.joining());
    }
}
