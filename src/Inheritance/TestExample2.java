package Inheritance;

/*
Scenario :- In parent class we have defined variable (public , protected ,private ,default ,static and final ) and no method.
However in Child class there is no variable and method (public , protected ,private ,default ,static and final).  
There is inheritance relationship between them.
*/

public class TestExample2 extends Example2{

	
		public void test1() {
			System.out.println("Child class TestExample2 having public method test1()");
			}

			protected void test2() {
			System.out.println("Child class TestExample2 having protected method test2()");
			}

			private void test3() {
			System.out.println("Child class TestExample2 having private method test3()");
			}

			void test4() {
			System.out.println("Child class TestExample2 having default method test4()");
			}

			public static void test5() {
			System.out.println("Child class TestExample2  having Static method test5()");
			}

			public final void test6() {
			System.out.println("Child class TestExample2  having Final method test6()");
			}
		
	public static void main(String[] args) {

	System.out.println("*****Scenario of reference and object of child class*****");

	// Rule =private member of parent class cannot be inherit into child class.

	TestExample2 obj= new TestExample2();
	obj.test1();
	obj.test2();
	obj.test3();  
	obj.test4();
	obj.test5();
	obj.test6();

	System.out.println(obj.a);
	System.out.println(obj.b);
	//System.out.println(obj.c);  Since private variable is defined parent class. Hence cannot to inherited
	System.out.println(obj.d);
	System.out.println(obj.e);
	System.out.println(obj.f);

	System.out.println("*****Scenario of reference and  object of parent class*****");

	// Rule => We cannot call private method from parent class reference and object. eg test 3() 

	Example2 obj1= new Example2();

	// Rule => No method is defined in parent class. Hence they cannot be called using parent object.


	// Rule => Since variable are defined in parent class. hence can be called.
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	//System.out.println(obj.c); Since private variable is defined parent class. Hence cannot to inherited.
	System.out.println(obj1.d);
	System.out.println(obj1.e);
	System.out.println(obj1.f);
	System.out.println("*****Scenario reference of parent class and  object of child class*****");

	//Rule => a)  We cannot call private method from parent class reference and object of child class. eg test 3() 
//	        b) Static method is strictly called from parent class. However public ,Protected and default methods are called from child class.


	Example2 obj2= new TestExample2();

	//Rule => No method is defined in parent class. Hence they cannot be called using parent class reference.

	//Rule => Since variable are defined in parent class. hence can be called.
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	//System.out.println(obj2.c); Since private variable is defined parent class. Hence cannot to inherited.
	System.out.println(obj2.d);
	System.out.println(obj2.e);
	System.out.println(obj2.f);

	}

}
