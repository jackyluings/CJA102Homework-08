package hw4;

public class Homework4_1 {

	public static void main(String[] args) {

//		• 有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//--------------------------------------------------------------------		

		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		int avg = sum / intArray.length;
		System.out.println("平均值 = " + avg);

		for (int j = 0; j < intArray.length; j++) {
			if (intArray[j] > avg) {
				System.out.print(intArray[j] + "\t");
			}
		}

		System.out.println();
		System.out.println("====================================");

		// ------------------------------------------------------------------
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH

		String s = "Hello World";
		for (int i2 = s.length() - 1; i2 >= 0; i2--) {
			System.out.print(s.charAt(i2));
		}

		System.out.println();
		System.out.println("====================================");

		// -----------------------------------------------------------------

//		• 有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 

		String[] sArray = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		String[] ss = { "a", "e", "i", "o", "u" };
//		char s1 = 'a';
//		char s2 = 'e';
//		char s3 = 'i';
//		char s4 = 'o';
//		char s5 = 'u';
//		System.out.println(s5);
//		System.out.println(sArray[0]);
//		System.out.println(sArray[0].charAt(4));
//		if (s5==sArray[0].charAt(4)) {
//			System.out.println("OK");
//		}
//		

		int count = 0;

		for (int i3 = 0; i3 < sArray.length; i3++) {
			for (int j3 = 0; j3 < sArray[i3].length(); j3++) {
				for (int k3 = 0; k3 < 5; k3++) {
					if (ss[k3].charAt(0) == sArray[i3].charAt(j3)) {
						count++;
					}
				}

			}
		}

		System.out.println("共有" + count + "個");

	}

}
