package hw2;

public class Homework_2 {

	public static void main(String[] args) {

//1.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int b = 0, c = 0;
		for (int a = 1; a <= 5; a++) {
			b = b + 2;
			c = c + b;
		}
		System.out.println(c);
		System.out.println("===============================");
		// END

//2. 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
		System.out.println("===============================");
		// END

//3.請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int i1 = 1, sum1 = 1;
		while (i1 <= 10) {
			sum1 = sum1 * i1;
			i1++;
		}
		System.out.println(sum1);
		System.out.println("===============================");
		// END

//4.請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100	
		int i2 = 1, num1 = 1;
		while (i2 <= 10) {
			num1 = i2 * i2;
			System.out.print(num1 + " ");
			i2++;
		}
		System.out.println();
		System.out.println("===============================");
		// END

//5. 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count = 0;
		for (int big = 1; big <= 49; big++) {

			if (!(big / 10 == 4 || big % 10 == 4)) { //相除整數是4 ||或 相除餘數是4 !反轉(逆轉)你要的值
				System.out.print(big + " ");
				count++;//將有運算成功的迴圈計數
			}

		}
		System.out.println();
		System.out.println("有" + count + "個可以選");

		System.out.println("===============================");
		// END

//6.請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		 1 2 3 4 5 6 7 8 9
//		 1 2 3 4 5 6 7 8
//		 1 2 3 4 5 6 7
//		 1 2 3 4 5 6 
//		1 2 3 4 5
//		 1 2 3 4 
//		1 2 3 
//		1 2 
//		1

		for (int i6 = 0; i6 <= 9; i6++) {
			for (int num6 = (10 - i6); num6 >= 1; num6--) {
				int numt = -(num6 - 11);
				System.out.print(numt + " ");
			}
			System.out.println();
		}

		System.out.println("===============================");
		// END
//7.請設計一隻Java程式，輸出結果為以下：
//		  A
//		  BB
//		  CCC
//		  DDDD
//		  EEEEE
//		  FFFFFF
		int L = 'A' - 1;
		for (int i7 = 1; i7 <= 5; i7++) {
			for (int j7 = 1; j7 <= i7; j7++) {
				System.out.print((char) (L + i7) + " ");
			}
			System.out.println();
		}
		System.out.println("===============================");
		System.out.println("===============================");
		// END
	}

}
