package Lesson02_Serialaizable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatM {

	public static void main(String[] args) {
		Owner owner = new Owner("Robot");
		Cat cat = new Cat("Vitalina", 21);
		cat.setOwner(owner);
		System.out.println(cat);
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try{
			FileOutputStream fos = new FileOutputStream("baos.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cat);
		oos.close();
		fos.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		try{
			FileInputStream fis = new FileInputStream("baos.bin");
		ObjectInputStream oos = new ObjectInputStream(fis);
		Cat cloneCat = (Cat) oos.readObject();
		System.out.println(cloneCat);
		System.out.println("Changing owner");
		owner.setName("Sergio");
		System.out.println(cat);
		System.out.println(cloneCat);
		} catch (IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
		
		/**
		Owner owner = new Owner("Robot");
		Cat cat = new Cat("Vitalina", 21);
		cat.setOwner(owner);
		System.out.println(cat);
		
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try{
			FileOutputStream fos = new FileOutputStream("baos.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cat);
		oos.close();
		fos.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		try{
			FileInputStream fis = new FileInputStream("baos.bin");
		ObjectInputStream oos = new ObjectInputStream(fis);
		Cat cloneCat = (Cat) oos.readObject();
		System.out.println(cloneCat);
		System.out.println("Changing owner");
		owner.setName("Sergio");
		System.out.println(cat);
		System.out.println(cloneCat);
		} catch (IOException | ClassNotFoundException e){
			e.printStackTrace();
		}*/
	}

}
