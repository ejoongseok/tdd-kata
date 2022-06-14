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
		play("425", "425", "3스트라이크");
	}

	@Test
	void invalid_input() {
		BaseBall baseBall = new BaseBall("425");
		assertThatThrownBy(() -> baseBall.input("1234"))
			.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> baseBall.input("123a"))
			.isInstanceOf(IllegalArgumentException.class);
	}


	private void play(String computer, String player, String result) {
		BaseBall baseBall = new BaseBall(computer);
		baseBall.input(player);
		assertThat(baseBall.result()).isEqualTo(result);
	}

}
