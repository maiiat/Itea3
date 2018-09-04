package Lesson02_Serialaizable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat("SdddddSSS",23);
		System.out.println(cat);
		
		
		/*
		try(DataOutputStream dod = new DataOutputStream(new FileOutputStream("cat.bin"))){
			dod.writeUTF(cat.getName());
			dod.writeInt(cat.getAge());
			System.out.println("Cat is binary now!");
		} catch (Exception e) {
			System.out.println("Opssssss....");
		}
		*/
		
		
		try(DataInputStream dod = new DataInputStream(new FileInputStream("cat.bin"))){
			Cat catt = new Cat(dod.readUTF(), dod.readInt());
			System.out.println("Cat from file:" );
		} catch (Exception e) {
			System.out.println("Opssssss....");
		}
		
		
		
	}

}
