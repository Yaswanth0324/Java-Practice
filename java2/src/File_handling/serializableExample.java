package File_handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializableExample {

	public static void main(String[] args) {
		 Student s = new Student(101, "Alice");

	        try {
	            FileOutputStream fos = new FileOutputStream("student.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(s);  // Serialization
	            oos.close();
	            fos.close();
	            System.out.println("Object serialized to student.ser");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
