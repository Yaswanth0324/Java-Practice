package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class file_writeOperation {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\yamun\\OneDrive\\Desktop\\yash\\cisco netrwork\\WEKA\\resume.txt");
		if(!f.exists())
			f.createNewFile();
		
//		//FileOutputStream
//		FileOutputStream fos = new FileOutputStream(f);
//		fos.write(72);
//		String s = "Hi, I am T.Yaswanth";
//		for(char ch:s.toCharArray()) {
//			fos.write((int)ch);
//			
//		}
//		fos.flush();
//		fos.close();
		
		
		//FileWriter
//		FileWriter fw = new FileWriter(f);
//		fw.write("I am studying in Mohan babu University");
//		fw.flush();
//		fw.close();
		
		//BufferedWriter
		String s1="I am T.Yaswanth from M.Rayapuram";
	    String s2=  "studying in Mohan Babu university";
	    String s3= "I am studying MCA 2nd year";
	    String s4 = "preparing for campus drive";
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(s1);
		bw.newLine();
		bw.write(s2);
		bw.newLine();
		bw.write(s3);
		bw.newLine();
		bw.write(s4);
		bw.flush();
		bw.close();
		
		

	}

}
