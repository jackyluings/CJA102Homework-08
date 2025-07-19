package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Homework7_4 {
	public static void main(String[] args) throws Exception {
		Animal[] animals = new Animal[2];
		animals[0] = new Dog("snoopy");
		animals[1] = new Cat("kitty");
		// output

		File file = new File("C:\\data");
		file.mkdir();
		FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}

		oos.close();
		fos.close();
	}

}
