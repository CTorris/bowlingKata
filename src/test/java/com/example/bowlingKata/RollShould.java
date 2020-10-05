package com.example.bowlingKata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RollShould {
	//Tirada == ROLL
	//Turno == FRAME

	@Test
	public void score_0_points_when_no_pins_knocked() {
		Game game = new Game().roll(0);
		assertEquals(0, game.score());
	}

	@Test
	public void score_1_point_when_one_pin_knocked() {
		Game game = new Game().roll(1);
		assertEquals(1, game.score());
	}

	@Test
	public void score_2_point_when_one_pin_and_one_pin_knocked() {
		Game game = new Game().roll(1).roll(1);
		assertEquals(2, game.score());
	}

	@Test
	public void score_12_points_when_5_and_spare_and_1_pin_knocked() {
		Game game = new Game().roll(5).roll(5).roll(1);
		assertEquals(12, game.score());
	}
}
