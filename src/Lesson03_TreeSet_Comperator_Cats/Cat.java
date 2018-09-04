package Lesson03_TreeSet_Comperator_Cats;

import java.util.Comparator;

public class Cat {
	String name;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
	
	Cat(String name, int age){
		this.name = name;
		this.age = age;
			
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	/*
	@Override
	public int compare(Cat cat1, Cat cat2) {
		return cat1.getAge()>cat2.getAge()?1:-1;
	 	}
	*/

}
