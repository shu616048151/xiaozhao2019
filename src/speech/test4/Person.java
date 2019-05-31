package speech.test4;

public class Person {
	public String name="person";
	static{
		System.out.println("person static");
	}

	public Person() {
		super();
		System.out.println("person constructor");
	}
	public void sayHello(){
		System.out.println("person sayHello");
	}
	public static void test(){
		System.out.println("person test");
	}
}
