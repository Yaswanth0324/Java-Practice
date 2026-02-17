package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class file_readOperations {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yamun\\OneDrive\\Desktop\\yash\\cisco netrwork\\WEKA\\resume.txt");
		if(!f.exists())
			f.createNewFile();
		
//		//fileInputStream
//		FileInputStream fis = new FileInputStream(f);
//		System.out.println(fis.read());
//		int asciicode;
//		while((asciicode = fis.read()) != -1) {
//			System.out.println((char)asciicode);
//
//		}
//		fis.close();

//		//scanner class
//		Scanner sc = new Scanner(f);
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//
//		}
//		sc.close();
		
		//FileReader
		FileReader fr = new FileReader(f);
//		int asciicode;
//		String text="";
//    	while((asciicode = fr.read()) != -1) {
//    		text += String.valueOf((char)asciicode);
//    	}
//    	System.out.println(text);
//		
//		fr.close();
		
		//BufferedReader
		BufferedReader br = new BufferedReader(fr);
		String line="";
		while((line=br.readLine()) != null) {
			System.out.println(line);

		}
		br.close();
		
	}

}
