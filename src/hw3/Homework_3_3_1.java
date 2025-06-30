package hw3;

import java.util.Scanner;

public class Homework_3_3_1 {
//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell me ,What num you don't want from 1~9 ?");
		int num = sc.nextInt();
		int count = 0;

		for (int big = 1; big <= 49; big++) {

			if (!(big / 10 == num || big % 10 == num)) { // 相除整數是num ||或 相除餘數是num !反轉(逆轉)你要的值
				System.out.print(big + " ");
				count++;// 將有運算成功的迴圈計數
			}

		}

		System.out.println();
		System.out.println("有" + count + "個可以選");
		

	}

}
