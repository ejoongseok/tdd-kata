package bowling;

public class Game {
	int score = 0;
	public void roll(int pinOverCount) {
		score += pinOverCount;
	}

	public int score() {
		return score;
	}
}
