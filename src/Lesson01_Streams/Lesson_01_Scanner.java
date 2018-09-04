package Lesson01_Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Lesson_01_Scanner {

	public static void main(String[] args) {
		
	/**	Scanner in = new Scanner(System.in);
		while(true){
			if(in.hasNextInt()){
				user = in.nextInt();
				break;
			}else{
				System.out.println("Error");
		}System.out.println("End");
		in.next();
		}- -------------------------------------------------------------*/
		
		
		/*
		try {
			Scanner in = new Scanner(new FileReader("copy_buff_textForReading.txt"));
			while (in.hasNext()){
				if(in.hasNextInt()){
					System.out.println(in.nextInt());
					
				}else{
					in.next();
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}-----------------------------INT----------------------------*/
		
		/**try {
			Scanner in = new Scanner(new FileReader("copy_buff_textForReading.txt"));
			while (in.hasNext()){
				if(in.hasNextDouble()){
					if (!in.hasNextInt()){
					System.out.println(in.nextDouble());
					} else{in.next();}
				}else{
					in.next();
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}-----------------------------------------GET DOUBLE----------------------------*/

		/*try {
			Scanner in = new Scanner(new FileReader("copy_buff_textForReading.txt"));
			while (in.hasNext()){
				if(in.hasNextDouble()){
						String number = in.next();
						try{
						Integer.parseInt(number);
						} catch (Exception e){
					System.out.println(number);
					}
				
				}else{
					in.next();
				}
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}----------------------------------------GET DOUBLE---------------------------------------*/
		
		try {
			Scanner in = new Scanner(new FileReader("copy_buff_textForReading.txt"));
			in.useDelimiter("a");
			while (in.hasNext()){
						System.out.println(in.next());
					}		
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		
	}

}
}
