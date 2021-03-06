package baseball;

import static java.util.regex.Pattern.*;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class BaseBall {

	private String computer;

	private int strike = 0;
	private int ball = 0;

	public static void main(String[] args) {
		String result = new RandomValue().getResult();
		BaseBall baseball = new BaseBall(result);
		baseball.play();
	}

	public BaseBall(String computer) {
		this.computer = computer;
	}

	public void play() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			strike = 0;
			ball = 0;
			System.out.print("숫자를 입력해주세요 : ");
			input(sc.nextLine());
			System.out.println(result());
			if (strike == 3) {
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
				System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
				int code = sc.nextInt();
				if (code == 2) {
					System.exit(0);
				}
				sc.nextLine();
				System.out.println("게임을 새로 시작합니다.");
				computer = new RandomValue().getResult();
			}
		}

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
		if(!compile("^[0-9]{3}$").matcher(player).matches())
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
