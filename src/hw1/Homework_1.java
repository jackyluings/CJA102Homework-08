package hw1;

public class Homework_1 {
	
	public static void main (String[] args) {
		
//  • 1.請設計一隻Java程式，計算12，6這兩個數值的和與積	
		
		int num1 = 12, num2 = 6;
		System.out.println("1.計算12，6這兩個數值的和與積");
		System.out.println("Ans : ");
		System.out.println("和 = " + (num1 + num2));
		System.out.println("積 = " + (num1 * num2));
		System.out.println("======================================");
		
//	• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		
		int num3 = 200;
		System.out.println("2.計算200顆蛋共是幾打幾顆？ (一打為12顆)");
		System.out.println("Ans : ");
	    System.out.println((num3/num1) + " 打 " + (num3%num1) + " 顆 ");
		System.out.println("======================================");
		
//  • 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		System.out.println("3.算出256559秒為多少天、多少小時、多少分與多少秒");
		System.out.println("Ans : ");
		int num4 = 256559;//total seconds
		int sec = num4 % 60; // 
		int min = num4 / 60; // 
		int hr = min / 60; // 
		int day = hr / 24; // 
		
//		System.out.println( sec + "秒");
//		System.out.println( min  %60 + "分");
//		System.out.println( hr % 24 + "小時");
//		System.out.println(day + "天");
		System.out.println(day + "天" + hr % 24 + "小時" +  min  %60 + "分" + sec + "秒");
		System.out.println("======================================");
		
//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		
		System.out.println("4.定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
		System.out.println("Ans : ");
		
		final double PI=3.1415;
		double r=5;
		double area = PI*r*r;
		double length = 2*PI*r;
		System.out.println("面積 = "+ area);
		System.out.println("周長 = "+ length);
		System.out.println("======================================");
		
//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，
//		本金加利息共有多少錢 (用複利計算，公式請自行google)	
		System.out.println("5.計算10年後，本金加利息共有多少錢");
		System.out.println("Ans : ");
//		本利和 = 本金 × (1 + 年利率)^期間
//		Sum = i * ( 1+ rate )^years
		double i = 150 , rate = 0.02;
		double Sum = i * (1 + rate)* (1 + rate)* (1 + rate)* (1 + rate)* (1 + rate)* (1 + rate)* (1 + rate)* (1 + rate)* (1 + rate)* (1 + rate);
		
		System.out.println(Sum + "萬");
		System.out.println("======================================");
		
//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因	
		System.out.println(5+5); //數值運算5+5=10
		System.out.println(5+'5'); //數值5 + 字元5轉換後的值
		System.out.println(5+"5"); //數值5+字串5
	
		
		
		
		
		
		
		
		
	}







}
