package hw3;

import java.util.Scanner;

public class Homework_3_2 {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息，如圖示結果：	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please guess a num from 0~9 :");
		
		int num = (int) (Math.random() * 10 + 1);

		int i = 0;
		while (i >= 0) {
			int data = sc.nextInt();
			if (data != num) {
				System.out.println("got wrong number ^^,try again.");
				i++;
			}
			if (data == num) {
				System.out.println("got it ^^.");
				break;
			}
			
		}

	}
}
