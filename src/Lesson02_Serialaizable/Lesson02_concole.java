package Lesson02_Serialaizable;

import java.io.Console;

public class Lesson02_concole {

	public static void main(String[] args) {
		Console console = System.console();
		if(console==null){
			System.out.println("WTF?!MAcOS???????");
			System.exit(66613);
		}
System.out.println("Console ok.....");

console.printf("Please enter your username: ");
String login=console.readLine();
console.printf(login + "\n");


console.printf("Please enter your password: ");
char[] passwordChars = console.readPassword();
String passwordString = new String(passwordChars);

console.printf(passwordChars + "\n");

if (login.equals("admin") && passwordString.equals("12345")){
	System.out.println("You have passed");
}
else {
	System.out.println("Failed");
}


	}

}
