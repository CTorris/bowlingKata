package com.example.bowlingKata;

import com.example.bowlingKata.scoring.GameResult;
import com.example.bowlingKata.stub.GameResultStub;
import com.example.bowlingKata.utils.Printer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BowlingKataApplicationTests {

	@Test
	public void should_score_90_points_when_9_pins_in_each_turn() {
		GameResult gameResult = GameResultStub.noStrikesAndNoSparesWithNumberOfKnockedPins(9);
		Printer.print(gameResult);
		assertEquals(90, gameResult.score());
	}

	@Test
	public void should_score_150_points_when_10_pairs_of_5_and_spare_with_final_5() {
		GameResult gameResult = GameResultStub.allSparesWithNumberOfKnokedPins(5);
		Printer.print(gameResult);
		assertEquals(150, gameResult.score());
	}

	@Test
	public void should_score_300_points_when_all_strikes() {
		GameResult gameResult = GameResultStub.allStrikes();
		Printer.print(gameResult);
		assertEquals(300, gameResult.score());
	}

}
