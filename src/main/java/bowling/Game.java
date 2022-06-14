package bowling;

public class Game {
	private int[] score = new int[22];
	private int rollCount = 1;
	public void roll(int knockedDownPins) {
		if (knockedDownPins == 10 && rollCount < 19) {
			rollCount++;
		}
		score[rollCount++] = knockedDownPins;
	}

	public int score() {
		int result = 0;
		for (int i = 1; i < score.length; i++) {
			result += score[i];
			if (isStrike(i)) {
				result += strikeBonus(i);
			} else if (isSpare(i)) {
				result += spareBonus(i);
			}
		}
		return result;
	}

	private boolean isStrike(int i) {
		return score[i] == 10;
	}

	private int strikeBonus(int i) {
		return score[i + 1] + score[i + 2];
	}

	private boolean isSpare(int i) {
		return i % 2 == 0 && score[i - 1] + score[i] == 10;
	}

	private int spareBonus(int i) {
		return score[i + 1];
	}
}
