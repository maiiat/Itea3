package Lesson02_Lambda;

public class LanbdaM {

	public static void main(String[] args) {
		/*MyInt myInt = new MyInt(){
			@Override
			public void doSomething(){
				System.out.println("Hello from lambla");
			}
		};*/
//myInt.doSomething();
//List al = new ArrayList();


SomeClass sc = new SomeClass();
//sc.someMethod(()-> System.out.println("Hello lambda"));
sc.someAnotherMethod((name, age)-> System.out.println("Hello lambda: =" +name+ age ));
	}

}
