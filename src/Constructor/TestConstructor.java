package Constructor;

public class TestConstructor {

	public TestConstructor() {
	System.out.println("I belong to default constructor");
	}
	
	public TestConstructor(int i) {
	System.out.println("I belong to parameterized interger constructor");
	}
	
	public TestConstructor(String a) {
	System.out.println("I belong to paramterized String constructor");
	}
	public static void main(String[] args) {
	
		TestConstructor ob = new TestConstructor();
		TestConstructor ob1 = new TestConstructor(2);
		TestConstructor ob2 = new TestConstructor("ShivShakti");
		

	}

}

/*
General Information about constructor

=> JVM by default create on default constructor if it is not create in class.
=> Whenever we create object of any class. Basically we are creating object of default constructor.

Few rules of constructor are as follows

A) No we cannot create two "Default constructor" .Since compile time error will occurs .
B) No we cannot create two "Parameterized constructor" with same argument .Since compile time error will occurs.
C) But we  can create two constructor having same argument but different data type.
 e.g. => Testconstructor(int a) and Testconstructor(String a)
*/
 