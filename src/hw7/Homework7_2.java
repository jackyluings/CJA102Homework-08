package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Homework7_2 {


	public static void main (String[] args) throws IOException {
		try {
		FileWriter fw = new FileWriter("C:\\javawork\\Data.txt",true);
		BufferedWriter bw = new BufferedWriter (fw) ;
		PrintWriter pw = new PrintWriter(bw);
		for (int i = 1; i <= 10; i++) {
			pw.println( (int) (Math.random() * 1000) + 1);
			pw.flush();
		}
		pw.println("==========");
		pw.close();
		bw.close();
		fw.close();
		}catch (IOException e) {
			System.err.println(e);
		}
		
	}
}
