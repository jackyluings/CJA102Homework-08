package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Homework_3_1 {

//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形，如圖示結果：
	static public void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter 3 number :");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			int[] numArray = { num1, num2, num3 };
			Arrays.sort(numArray);
			System.out.println("The numbers are :" + numArray[0] + "," + numArray[1] + "," + numArray[2]);
			if (numArray[0] == 0 || numArray[1] == 0 || numArray[2] == 0) {
				System.out.println("0 is not triangle .");
			} else if (numArray[0] + numArray[1] < numArray[2]) {
				System.out.println("Not  a triangle .");
			} else if ((numArray[0] + numArray[1]) / 2 == numArray[2]) {
				System.out.println("正三角形.");
			} else if ((numArray[0] - numArray[1]) == 0 || (numArray[1] - numArray[2]) == 0) {
				System.out.println("等腰三角形.");
			} else {
				System.out.println("其他三角形.");
			}
		}

	
	
}


