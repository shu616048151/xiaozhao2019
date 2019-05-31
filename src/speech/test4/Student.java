package speech.test4;

public class Student extends Person{
	public String name="student";
	
	public Student() {
		super();
		System.out.println("student constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("student sayhello");
	}
	public static void test(){
		System.out.println("student test");
	}
	public void test1(){
		
	}
	public static void main(String[] args) {
		//子类向上转型，父类会丢弃子类中不属于父类的方法，会形成一个新的方法，同时子类的方法会覆盖父类的方法,
		//成员变量和静态方法被隐藏不能被覆盖，保留父类的方法和成员变量
		Person person=new Student();
		person.sayHello();
		person.test();
		System.out.println(person.name);
		new Animal() {
			
			@Override
			public void getName() {
				System.out.println("Hi animal");
			}
		};
	}
	
}
