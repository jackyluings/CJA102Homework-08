package hw5;

public class Homework5_5 {

	void genAuthCode() {
		String[] authCode = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",

				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
				"V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
				"q", "r", "s", "t", "u", "v", "w", "x", "y", "z"

		};

		System.out.println("本次隨機產生的驗證碼為:");

		for (int i = 0; i < 8; i++) {
			int getCode = (int) (Math.random() * 62);
			System.out.print(authCode[getCode]);
		}

	}

}
