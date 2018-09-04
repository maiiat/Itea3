package Lesson03_TreeSet_Comperator_Cats;

import java.util.Comparator;
import java.util.TreeSet;

import Lesson02_Lambda.SomeClass;

public class MainCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat("Vasia", 55);
		Cat cat2 = new Cat("Vasia2", 3);
		Cat cat3 = new Cat("Vasia3", 21);
				
		/*Comparator<Cat> comparator1 = new Comparator<Cat>(){
		@Override
		public int compare(Cat o1, Cat o2) {
		return cat1.getAge()>cat2.getAge()?1:-1;
		}};*/
			
		TreeSet<Cat> cats = new TreeSet<Cat>((o1,o2)->o1.getAge()>o2.getAge()?1:-1);
		cats.add(cat1);
		cats.add(cat2);
		cats.add(cat3);
		System.out.println(cats);
	}

}
