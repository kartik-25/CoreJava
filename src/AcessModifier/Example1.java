package AcessModifier;

/*
Accessing of modifier Example class through this Example1 class having no Inheritance relationship .

Rule => Private method and variable can't be called in other class. Compile time error occurs.
*/

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Example ob = new Example();
	System.out.println(ob.a);
	System.out.println(ob.b);
	System.out.println(ob.d);
	
	ob.test1();
	ob.test2();
	ob.test4();
	
	
	/*
	System.out.println(ob.c);
	ob.test3();
	 */
	}

}
