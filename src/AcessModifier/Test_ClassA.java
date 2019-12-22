package AcessModifier;

public class Test_ClassA {

	public static void main(String[] args) {
	
	ClassA ob = new ClassA();
	ob.setAge(25);
	ob.setName("Rajkumar");
	
	System.out.println("My name is => "+ob.getName());
	System.out.println("My age is => "+ob.getAge());
	}
}
