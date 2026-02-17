package File_handling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class fileOperations {

	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/yamun/OneDrive/Desktop/yash/cisco netrwork/WEKA/resume.txt");
//		System.out.println(f.createNewFile());
//		System.out.println(f.exists());
//		System.out.println(f.delete());
//		if(f.exists())
//			f.delete();
		System.out.println(f.createNewFile());
		System.out.println(f.isHidden());
		System.out.println(f.canWrite());
		f.setWritable(true);
		System.out.println(f.canWrite());
		File f1 = new File("C:/Users/yamun/OneDrive/Desktop/yash/cisco netrwork/WEKA/project/long/short");
		f1.mkdirs();
		System.out.println(f.getName());
		File f2 = new File("C:/Users/yamun/OneDrive/Desktop/yash/cisco netrwork/WEKA/");
		System.out.println(Arrays.toString(f2.list()));
		for(String file : f2.list()) {
			System.out.println(file);

		}
		System.out.println(f2.getParent());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.lastModified());
		System.out.println(new Date(f1.lastModified()));
		System.out.println(f2.isDirectory());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());









		





			

	}

}
