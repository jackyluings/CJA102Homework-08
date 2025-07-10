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
		int getYear = sc.nextInt();
		System.out.println("輸入查詢月份?");
		int getMonth = sc.nextInt();
		System.out.println("輸入查詢日?");
		int getDay = sc.nextInt();
		int month = 0;
		int day = 0;
		int year = 0;
		int days1[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days2[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (getMonth != 2) {
			if (getDay > days1[getMonth - 1] || getDay < 0) {
				System.out.print("輸入的日期錯誤");
			} else {
				day = getDay;
				month = getMonth;
				year = getYear;
			}
		}
		if (getMonth == 2) {
			if (getDay > 29) {
				System.out.print("輸入的日期錯誤");
			} else {
				month = getMonth;
				day = getDay;
				year = getYear;
			}

		}

		// year%4=0 and year%100!=0, year%400=0
		int sum1 = 0;
		int sum2 = 0;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && day > 0) {
			for (int i = 0; i < month - 1; i++) {
				sum1 = sum1 + days2[i];
			}
			System.out.print("輸入的日期為該年第");
			System.out.print(sum1 + day);
			System.out.print(" 天。");
		} else if (day > 28 && month==2) {
			System.out.print("此年二月只有28天");
		} else if (day > 0) { 
			for (int j = 0; j < month - 1; j++) {
				sum2 = sum2 + days1[j];
			}
			System.out.print("輸入的日期為該年第");
			System.out.print(sum2 + day);
			System.out.print("天。");
		}

	}

}
