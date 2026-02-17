package File_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deSerializableExample {
	public static void main(String[] args) {
		try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();  // Deserialization
            ois.close();
            fis.close();

            System.out.println("Student ID: " + s.id);
            System.out.println("Student Name: " + s.name);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}

}
