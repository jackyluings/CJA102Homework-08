package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Homework7_5 {

	// from ser input
	public static void main(String[] args) throws Exception {

		File f1 = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);

		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("===========");
			}
		} catch (EOFException e) {
			System.out.println("Finish");
		}
		
		ois.close();
		fis.close();

	}

}
