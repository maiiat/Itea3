package Lesson03_FileNIO;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileNIO {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("C:\\Users\\maiiat\\workspace\\Itea3\\textForReadingLLLLLLLLL.txt");
		Path p2 = Paths.get("C:\\Users\\maiiat\\workspace\\Itea3\\textForReading.txt");
		System.out.println(p1);
		System.out.println(Files.exists(p1));
		System.out.println(p2);
		System.out.println(Files.exists(p2));
		System.out.println("New comment");
		System.out.println("New comment2");
		
		try {
			//Files.copy(p1, p2);
			Files.move(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(p2);
		System.out.println(Files.exists(p2));

	}

}
