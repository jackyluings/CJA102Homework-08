package hw4;

public class Homework4_1 {
//	• 有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)
	public static void main(String[] args) {
		int[] intArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		int avg = sum / intArray.length;
		
		for (int j=0 ; j < intArray.length ; j++) {
			if (intArray[j] > avg) {
				System.out.print(intArray[j] + "\t");
			}
			
		}
		
		
		
	}
}


