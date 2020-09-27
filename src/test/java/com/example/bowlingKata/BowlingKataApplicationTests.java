package com.example.bowlingKata;

import com.example.bowlingKata.scoring.BowlerScore;
import com.example.bowlingKata.stub.ScoringStub;
import com.example.bowlingKata.utils.Printer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BowlingKataApplicationTests {

	@Test
	public void should_score_300_points_when_all_rolls_are_strikes() {
		BowlerScore score = ScoringStub.allStrikes();
		Printer.print(score);
		assertEquals(score.score(), 300);
	}

	@Test
	public void should_score_90_points_when_9_pins_in_each_turn() {
		BowlerScore score = ScoringStub.noStrikesAndNoSparesWithNumberOfKnockedPins(9);
		Printer.print(score);
		assertEquals(score.score(), 90);
	}

	@Test
	public void should_score_150_points_when_10_pairs_of_5_and_spare_with_final_5() {
		BowlerScore score = ScoringStub.allSparesWithNumberOfKnokedPins(5);
		Printer.print(score);
		assertEquals(score.score(), 150);
	}

}
