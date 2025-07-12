package hw5;

public class Homework5_2 {

	// 請設計一個方法為randAvg()，從10個 0～ 100(含100)的整數亂數中取平均值並印出這10個亂數與平均值


	public static void main(String[] args) {

		System.out.println("本次亂數結果");
		randAvg();

	}

	public static void randAvg() {

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int randNum = (int) (Math.random() * 100) + 1;
			System.out.print(randNum + " ");
			sum += randNum;
		}
		System.out.println();
		System.out.println(sum / 10);
	}

}
