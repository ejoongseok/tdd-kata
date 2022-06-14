package baseball;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BaseBallTest {

	@Test
	void test() {
		BaseBall baseBall = new BaseBall();
		baseBall.input("123");
		String result = baseBall.result();
		assertThat(result).isEqualTo("1볼 1스트라이크");

	}

}
