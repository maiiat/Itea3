package Lesson02_Serialaizable;

import java.io.Serializable;

public class Animal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2309895930582075137L;
	protected  String name;
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
	protected int age;

}
