package com.example.bowlingKata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
	public static final int MAX_KNOCKED_PINS_PER_FRAME = 10;
	private final List<Integer> rolls;

	private Game(final List<Integer> rolls) {
		this.rolls = Collections.unmodifiableList(rolls);
	}

	public Game() {
		this(Collections.emptyList());
	}

	public Game roll(Integer pins) {
		List<Integer> list = new ArrayList(rolls);
		list.add(pins);
		return new Game(list);
	}

	public Integer score() {
		if (this.rolls.size() == 3 && twoPreviousScores() == MAX_KNOCKED_PINS_PER_FRAME) return MAX_KNOCKED_PINS_PER_FRAME + spareBonus() + this.rolls.get(2);
		return rolls.stream().mapToInt(i -> i).sum();
	}

	private Integer spareBonus() {
		return this.rolls.get(2);
	}

	private int twoPreviousScores() {
		return this.rolls.get(0) + this.rolls.get(1);
	}

}
