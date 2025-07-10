package hw4;

import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {

//		請算出每位同學考最高分的次數

		int exam[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 }

		};
		
		int count[]= {0,0,0,0,0,0,0,0};
		int max[]= {0,0,0,0,0,0};
		
		for (int m=0; m<max.length;m++) {
			for (int i = 0; i < exam.length; i++) {
//			System.out.println(exam[m][i]);

				if ((exam[m][i]) > max[m]) {
				max[m] = exam[m][i];
				}
			}	
		}
		//System.out.println(max[0]);
		
		
		for (int n=0 ; n < max.length ; n++) {
			for (int j=0 ; j < exam.length; j++ ) {
			
			if (max[n]==exam[n][j]) {
			
				count[j]=count[j]+1;		
			}
			}
		}
		
//		System.out.println(count[3]);
		for (int z=0; z<count.length; z++) {
			System.out.print((z+1)+"號");
			System.out.println(count[z]+"次");
		}
		
		
		


		
		
	}
	}


	

