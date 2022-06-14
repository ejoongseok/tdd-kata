package bowling;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BowlingGameTest {

	@Test
	@DisplayName("볼링 게임")
	void game() {
		Game game = new Game();
		game.roll(0);
		int score = game.score();
		assertThat(score).isEqualTo(0);
	}
}
