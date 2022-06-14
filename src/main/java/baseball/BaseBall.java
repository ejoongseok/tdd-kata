package baseball;

import java.util.StringTokenizer;

public class BaseBall {

	private String computer;

	private int strike = 0;
	private int ball = 0;

	public BaseBall(String computer) {
		this.computer = computer;
	}

	public void input(String player) {
		verifyValidInput(player);
		char[] playerArray = player.toCharArray();
		char[] computerArray = computer.toCharArray();
		for (int i = 0; i < playerArray.length; i++) {
			if (playerArray[i] == computerArray[i]) {
				strike++;
			} else {
				String s = String.valueOf(playerArray[i]);
				if (computer.contains(s)) {
					ball++;
				}
			}
		}
	}

	private void verifyValidInput(String player) {
		if(player.length() != 3)
			throw new IllegalArgumentException();
	}

	public String result() {
		StringBuilder sb = new StringBuilder();
		if (ball > 0) {
			sb.append(ball).append("볼");
		}
		if (strike > 0) {
			if(sb.length() > 0)
				sb.append(" ");
			sb.append(strike).append("스트라이크");
		}
		return sb.length() == 0 ? "낫싱" : sb.toString();
	}
}
