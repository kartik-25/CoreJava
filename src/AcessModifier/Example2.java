package AcessModifier;

/*
Accessing of modifier Example class through this Example 3 class having Inheritance relationship .

Rule => Private method and variable cannot be called in other class. Compile time error occurs.
*/
public class Example2 extends Example {

	public static void main(String[] args) {
	
	System.out.println("**reference and object of child class**");
		
		/*Rule = We cannot call private method and variable in other class  as compile time error occurs.
		System.out.println(ob.c);
		ob.test3();
		*/
	
	Example2 ob = new Example2();
	System.out.println(ob.a);
	System.out.println(ob.b);
	System.out.println(ob.d);
	
	ob.test1();
	ob.test2();
	ob.test4();
	
	System.out.println("**reference and object of Parent class**");
	/*Rule = We cannot call private method and variable in other class  as compile time error occurs.
	System.out.println(ob.c);
	ob.test3();
	*/
	Example ob1 = new Example();
	System.out.println(ob1.a);
	System.out.println(ob1.b);
	System.out.println(ob1.d);
	
	ob1.test1();
	ob1.test2();
	ob1.test4();
	
	System.out.println("**reference of Parent  and object of child class**");
	/*Rule = We cannot call private method and variable in other class  as compile time error occurs.
	System.out.println(ob.c);
	ob.test3();
	*/
	Example ob2 = new Example2();
	System.out.println(ob2.a);
	System.out.println(ob2.b);
	System.out.println(ob2.d);
	
	ob2.test1();
	ob2.test2();
	ob2.test4();

	}

}
