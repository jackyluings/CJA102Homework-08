package hw3;


import java.util.Scanner;
import java.util.Arrays;
public class Homework_3 {
	
	
	static public void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int [] numArray  = {num1 , num2, num3};
		Arrays.sort(numArray);
		System.out.println("The numbers are :"+ numArray[0]+","+numArray[1]+","+numArray[2]);
		if(numArray[0] == 0 || numArray[1] == 0 || numArray[2] == 0) {
			System.out.println("0 is not triangle .");
		}else if (numArray[0]+numArray[1]<numArray[2] ) {
			System.out.println("Not  a triangle .");
		}else if ((numArray[0]+numArray[1])/2==numArray[2]){
			System.out.println("正三角形.");		
		}else if ((numArray[0]-numArray[1])==0 || (numArray[1]-numArray[2])==0) {
			System.out.println("等腰三角形.");	
		}else {
			System.out.println("其他三角形.");
		}
			
			
			
		}
		
		
	}
	
//	請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形，如圖示結果：
	
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息，如圖示結果：

//	阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//	厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//	的號碼與總數
	
//	透過Math類別的靜態方法random()，可以自動產生隨機的數字
	
//	• 可以取得鍵盤輸入的內容，用法參考下圖所示：
//	• Scanner紅底字請移動滑鼠到錯誤處，點選Import ‘Scanner’即可
	
	

