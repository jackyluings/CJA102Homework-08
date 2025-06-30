package hw3;

import java.util.Scanner;

public class Homework_3_3_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell me ,What num you don't want from 1~9 ?");
		int num = sc.nextInt();
		
		int j = 0 ;
		
		int [] numArray = new int [49];
		for (int i = 0; i < 49 ; i++) {
			
			if (!( (i+1) / 10 == num || (i+1) % 10 == num)) { // 相除整數是num ||或 相除餘數是num !反轉(逆轉)你要的值
//				System.out.print((i+1) + " ");
				numArray[i] = i+1;
				System.out.print(numArray[i] + " ");
				j++;// 將有運算成功的迴圈計數
			}		
		}
        
		int num1 = (int) (Math.random() * j )+ 1;
		System.out.println();
		System.out.println("有" + j + "個可以選");
		int []numArray2=new int [6];
		int i2=0;
		
			while (i2>0) {
				numArray[0]=num1;
				int num2 = (int) (Math.random() * j )+ 1;
				if (num1==num2) {
				int num2 =  (int) (Math.random() * j )+ 1;	
				}
				
				
				
			}
		
		System.out.print((int) numArray[num1] + " ");

	}

}
