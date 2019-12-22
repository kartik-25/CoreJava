package Abstraction;

public class Test_AbstractBankClass_1_case1 extends AbstractClass_1{
	
	int a =12;
	int b =144;
	public void test1() {
		System.out.println("test1() method belong to Test_AbstractClass");
	}
	public void test3() {
		System.out.println("test3() method belong to Test_AbstractClass");
	}

	public static void main(String[] args) {
		/*Rule = We cannot create reference and object of abstract class as compile time error is displayed
		AbstractClass_1 ob = new AbstractClass_1();   */
		
		System.out.println("************* Scenario of abstract class reference and child class object ************");
		
		/*Rule = We can create reference of abstract class and object of child class. so that  We can access all method and variable of abstract class
		 */
		
		AbstractClass_1 ob = new Test_AbstractBankClass_1_case1();
		// Rule => Variable always depends upon reference . In above case variable values from parent class (abstract class) is always defined
		System.out.println(ob.a);
		System.out.println(ob.b);

		// Rule => Method call at compile time depend on reference. However method call at runtime depends on object (child class).
		ob.test1();
		ob.test2();
		

		System.out.println("************* Scenario of  reference and  object of child class ************");
		
		Test_AbstractBankClass_1_case1 ob1 = new Test_AbstractBankClass_1_case1();
		// Rule => Variable always depends upon reference. Hence child class object reference is called.
		  System.out.println(ob1.a);
		  System.out.println(ob1.b);
		  
		// Rule => Method call at compile time depend on reference. However method call at runtime depends on object.
		    ob1.test1();
		    ob1.test2();
		    ob1.test3();

	}

	@Override
	void test2() {
	System.out.println("test2() is implemented in Test_AbstractClass");	
	}

	

}
