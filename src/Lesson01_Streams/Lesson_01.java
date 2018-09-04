package Lesson01_Streams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson_01 {

	public static void main(String[] args) {
	/**	FileInputStream fis = null;
		try {
			fis = new FileInputStream("putty.exe");
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}finally {
			try{
				fis.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}------------------------------------------------------------------------------------------*/

		
		/*try (FileInputStream fis = new FileInputStream("putty.exe");
				FileOutputStream fos = new FileOutputStream("copy_putty.exe")){
		int c;
				while((c=fis.read())!=-1){
					fos.write(c);
				}
				System.out.println("OK");
		} catch (IOException e){
			e.printStackTrace();
		
	}----------------------------------------------------------------------------------------------*/

		
	/**	try (FileReader fis = new FileReader("textForReading.txt");
				FileWriter fos = new FileWriter("copy_textForReading.txt")){
		int c;
				while((c=fis.read())!=-1){
					fos.write(c);
				}
				System.out.println("OK");
		} catch (IOException e){
			e.printStackTrace();
		
		}--------------------------------------------------------------------------------------*/
		
		BufferedReader in = null;
		PrintWriter pw = null;
		try{
		in = new BufferedReader (new FileReader("textForReading.txt"));
		pw = new PrintWriter(new FileWriter("copy_buff_textForReading.txt"));
		String temp;
		while((temp=in.readLine())!=null){
			pw.println(temp);
		}System.out.println("Buffer OK");
	}catch (IOException e){
		e.printStackTrace();
	}finally {
		try{
			in.close();
			pw.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}
}







































