package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework7_3 {

	static void copyFile(String str1, String str2) throws IOException {
		try {
			File inputFile = new File(str1);
			File outputFile = new File(str2);

			FileReader fr = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(outputFile);
			BufferedWriter bw = new BufferedWriter(fw);
			int i;
			while ((i = br.read()) != -1) {
				bw.write(i);
				bw.flush();
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();

		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public static void main(String[] args) throws Exception {
		copyFile("dataIn.txt", "dataOut.txt");

	}

}
