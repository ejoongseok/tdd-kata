package bowling;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BowlingGameTest {
	Game game;
	@BeforeEach
	void setUp() {
		game = new Game();
	}


	@Test
	@DisplayName("볼링 게임")
	void game() {
		frameFor(5, 3);
		int score = game.score();
		assertThat(score).isEqualTo(8);
	}
	@Test
	@DisplayName("볼링 게임 - 스페어")
	void spare() {
		frameFor(5, 5);
		frameFor(3, 6);
		frameFor(5, 5);
		game.roll(3);
		int score = game.score();
		assertThat(score).isEqualTo(38);
	}

	@Test
	@DisplayName("볼링 게임 - 스트라이크")
	void strike() {
		game.roll(10);
		frameFor(5, 3);
		game.roll(10);
		frameFor(5, 5);
		int score = game.score();
		assertThat(score).isEqualTo(56);
	}

	@Test
	@DisplayName("볼링 게임 - 10번째 프레임 스페어")
	void last_frame_spare_test() {
		for (int i = 0; i < 9; i++) {
			frameFor(0, 0);
		}
		frameFor(5, 5);
		game.roll(3);
		int score = game.score();
		assertThat(score).isEqualTo(16);
	}

	void frameFor(int oneRoll, int twoRoll) {
		game.roll(oneRoll);
		game.roll(twoRoll);
	}
}
