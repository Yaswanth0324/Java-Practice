package exceptionhandling;

//import java.io.*;
//
//public class sample6 extends Exception {
//	public static void main(String[] args) throws FileNotFoundException{
//		File file = new File("c:/resume.pdf");
//		FileInputStream sc = new FileInputStream(file);
//		System.out.println(sc);
//	}
//}
/*import java.io.*;

public class sample6 {

    public static void writeFile() throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello, this is written to a file using FileWriter!");
        fw.close();
    }

    public static void main(String[] args) {
        try {
            writeFile();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("File writing failed: " + e.getMessage());
        }
    }
}*/
import java.io.*;
public class sample6{
	void add() throws IOException{
		throw new IOException("device error");
	}
	public static void main(String[] args) {
		try {
			sample6 a = new sample6();
			a.add();
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
	
}

