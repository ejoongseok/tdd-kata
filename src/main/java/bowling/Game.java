package bowling;

import java.util.Arrays;

public class Game {
	int[] score = new int[22];
	int scoreCount = 1;
	public void roll(int pinOverCount) {
		score[scoreCount++] = pinOverCount;
	}

	public int score() {
		int result = 0;
		for (int i = 1; i < score.length; i++) {
			result += score[i];
			if (i % 2 == 0 && score[i - 1] + score[i] == 10) {
				result += score[i + 1];
			}
		}
		return result;
	}
}
