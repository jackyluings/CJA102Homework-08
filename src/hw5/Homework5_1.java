package hw5;

import java.util.Scanner;

public class Homework5_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高");
		int x = sc.nextInt();
		int y = sc.nextInt();
		starSquare(x, y);
	}

	public static void starSquare(int width, int height) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

}
