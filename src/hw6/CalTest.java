package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i == 0) {

			try {

				System.out.println("請輸入X的值");
				int x = sc.nextInt();
				System.out.println("請輸入Y的值");
				int y = sc.nextInt();

				Calculator c1 = new Calculator(x, y);
				System.out.println(c1.getX() + "的" + c1.getY() + "次方等於" + c1.powerXY());
				i = 1;
				
			} catch (CalException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
