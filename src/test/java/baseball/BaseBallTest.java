package baseball;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BaseBallTest {

	@Test
	void base_ball_play_test() {
		play("425", "123", "1스트라이크");
		play("425", "456", "1볼 1스트라이크");
		play("425", "789", "낫싱");
	}

	private void play(String computer, String player, String result) {
		BaseBall baseBall = new BaseBall(computer);
		baseBall.input(player);
		assertThat(baseBall.result()).isEqualTo(result);
	}

}
