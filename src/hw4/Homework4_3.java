package hw4;

import java.util.Scanner;

public class Homework4_3 {
	public static void main(String[] args) {

//		• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		Scanner sc = new Scanner(System.in);
		System.out.println("輸入查詢年份?");
		int year = sc.nextInt();
		System.out.println("輸入查詢月份?");
		int month = sc.nextInt();
		System.out.println("輸入查詢日?");
		int day = sc.nextInt();

		int days1[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days2[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// year%4=0 and year%100!=0, year%400=0
		int sum1 = 0;
		int sum2 = 0;
		System.out.print("總共 ");
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			for (int i = 0; i < month - 1; i++) {
				sum1 = sum1 + days2[i];
			}
			System.out.print(sum1 + day);
		} else {
			for (int j = 0; j < month - 1; j++) {
				sum2 = sum2 + days1[j];
			}
			System.out.print(sum2 + day);
		}
		System.out.print(" 天。");

	}
}
