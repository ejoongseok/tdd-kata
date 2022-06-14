package baseball;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BaseBallTest {
	@Mock
	RandomValue randomValue;

	@BeforeEach
	void setUp() {
	    when(randomValue.getResult()).thenReturn("425");
	}


	@Test
	void base_ball_play_test() {
		play("123", "1스트라이크");
		play("456", "1볼 1스트라이크");
		play("789", "낫싱");
		play("425", "3스트라이크");
	}

	@Test
	void invalid_input() {
		BaseBall baseBall = new BaseBall(randomValue.getResult());
		assertThatThrownBy(() -> baseBall.input("1234"))
			.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> baseBall.input("123a"))
			.isInstanceOf(IllegalArgumentException.class);
	}


	private void play(String player, String result) {
		BaseBall baseBall = new BaseBall(randomValue.getResult());
		baseBall.input(player);
		assertThat(baseBall.result()).isEqualTo(result);
	}

}
