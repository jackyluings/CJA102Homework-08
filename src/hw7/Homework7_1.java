package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7_1 {

	public static void main(String[] args) throws IOException {
		try {
			File f1 = new File("C:\\javawork\\Sample.txt");
			FileReader fr1 = new FileReader(f1);
			FileReader fr2 = new FileReader(f1);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);

			int count = 0;
			while (br1.read() != -1) {
				count++;
			} // 算字元 char
			int count2 = 0;
			while ((br2.readLine()) != null) {
				count2++;
			} // 算行數 str

			p("檔案共有" + f1.length() + "位元");
			p("檔案共有" + count + "字元");
			p("檔案共有" + count2 + "列");
			br1.close();
			fr1.close();
			br2.close();
			fr2.close();
		} catch (IOException e) {
		}

	}

	static void p(String s) {
		System.out.println(s);
	}

}
