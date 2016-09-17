package docker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DockerMainTest {
	public static void main(String[] args) throws IOException {
		System.out.println("This is a docker test");
		File f = new File("/home/guoheng/Desktop/test.txt");
		if(!f.exists()){
			f.createNewFile();
			System.out.println("success");
		}
		FileWriter fw = new FileWriter(f);

		fw.append("test");
		fw.flush();
		fw.close();
		System.out.println("hello world");
	}
}
