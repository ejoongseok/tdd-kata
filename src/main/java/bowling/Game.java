package bowling;

import java.util.Arrays;

public class Game {
	int[] score = new int[22];
	int scoreCount = 1;
	public void roll(int pinOverCount) {
		if(pinOverCount == 10) {
			score[scoreCount++] = pinOverCount;
			scoreCount++;
		} else {
			score[scoreCount++] = pinOverCount;
		}
	}

	public int score() {
		int result = 0;
		for (int i = 1; i < score.length; i++) {
			result += score[i];
			if (isStrike(i)) {
				i++;
				result += strikeBonus(i);
			} else if (isSpare(i)) {
				result += spareBonus(i);
			}
		}
		return result;
	}

	private int spareBonus(int i) {
		return score[i + 1];
	}

	private boolean isSpare(int i) {
		return i % 2 == 0 && score[i - 1] + score[i] == 10;
	}

	private int strikeBonus(int i) {
		return score[i + 1] + score[i + 2];
	}

	private boolean isStrike(int i) {
		return i % 2 == 1 && score[i] == 10;
	}
}
