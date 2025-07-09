package hw4;

import java.util.Scanner;

public class Homework4_2 {
	public static void main(String[] args) {

		int mm[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		Scanner sc = new Scanner(System.in);
		System.out.println("預借多金額?");
		int input = sc.nextInt();
		int count = 0;
		System.out.print("員工編號:");
		for (int j = 0; j < mm[1].length; j++) {
			if (input < mm[1][j]) {
				System.out.print(mm[0][j] + " ");
				count++;
			}

		}
		System.out.println();

		System.out.println(count + "人");
	}
}
