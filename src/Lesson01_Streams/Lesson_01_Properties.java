package Lesson01_Streams;

import java.util.Locale;
import java.util.ResourceBundle;

public class Lesson_01_Properties {

	public static void main(String[] args) {
		String language;
		String country;
		
		if(args.length>1){
			language = args[0]; 
			country = args[1];	
		}else {
			language = "de"; 
			country = "DE";	
		}
			
		Locale currentLocale = new Locale(language, country);
		ResourceBundle message = ResourceBundle.getBundle("MessageBundle", currentLocale);
		System.out.println(message.getString("greetings"));

	}

}
