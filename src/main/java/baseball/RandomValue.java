package baseball;

import static java.lang.Math.*;

public class RandomValue {

	private String result = "";

	public RandomValue() {
		while(result.length() < 3) {
			int randomValue = (int)(random() * 9) + 1;
			if (!result.contains(randomValue + "")) {
				result += randomValue;
			}
		}
	}

	public String getResult() {
		return result;
	}
}
