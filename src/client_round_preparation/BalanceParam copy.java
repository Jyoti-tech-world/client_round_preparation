package client_round_preparation;

public class BalanceParam {

	public static void main(String[] args) {

		String str = "[(])";

		int roundOpen = 0;
		int roundClose = 0;
		int squareOpen = 0;
		int squareClose = 0;

		for (char c : str.toCharArray()) {
			switch (c) {
			case '(' -> roundOpen++;
			case ')' -> roundClose++;
			case '[' -> squareOpen++;
			case ']' -> squareClose++;
			default -> {

			}

			}
		}
		if (roundOpen == roundClose && squareOpen == squareClose) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
