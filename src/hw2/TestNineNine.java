package hw2;

public class TestNineNine {
	public static void main(String[] args) {

//while + do while
		int i3 = 1;
		int j3 = 1;
		while (i3 <= 9) {

			do {
				System.out.print(i3 + "*" + j3 + "=" + i3 * j3 + "\t");
				j3++;
			} while (j3 <= 9);
			System.out.println();
			i3++;
		}
		System.out.println("===============================");

//for + do while	
		
		for (int i2 = 1; i2 <= 9; i2++) {
			int j2 = 1;
			do {
				System.out.print(i2 + "*" + j2 + "=" + i2 * j2 + "\t");
				j2++;
			} while (j2 <= 9);
			System.out.println();

		}
		System.out.println("===============================");

// for + while
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
			}
			System.out.println();

		}
		System.out.println("===============================");
// for + for
//		for (int i1 = 1; i1 <= 9; i1++) {
//			for (int j1 = 1; j1 <= 9; j1++) {
//				System.out.print(i1 * j1 + "\t");
//			}
//			System.out.println();
//		}
//		System.out.println("===============================");

	}
}
