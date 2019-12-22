package This;

public class ThisKeywordInJava_2 {

	int a =9;
	static int b =99;
	
	void test1() {
	System.out.println("I am from non static method test1()");
	// Rule => using this keyword calling non static method (test2()) and variable (a).  
	// Rule => This will be available for non static member.
	System.out.println(this.a);
	this.test2();
	// Rule => Inside non static method we can call static variable and method using this().
	System.out.println(this.b);
	this.test5();
	}
	
	void test2() {
	System.out.println("I am from non static method test2()");
	}
	
	void test3(ThisKeywordInJava_2 ob) {
		// it will display "Package name" then class name .eg "Practise_This.ThisKeywordinJava1" .
		System.out.println(ob.getClass().getName());
		System.out.println("I am from non static method test3(object)");
	}
	
	void test4() {
	// Rule => We need to specify this keyword in argument to access test4(obj) method.
	test3(this);
	}
	
	static void test5() {
	// Rule => Compile time error occurs if we try to write 'this keyword' inside static method.
	System.out.println("I am from static method test5");
	System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThisKeywordInJava_2 ob = new ThisKeywordInJava_2();
	System.out.println("***** Calling  static and non static variable through object ***************");	
	ob.test1();
	System.out.println("*********");
	ob.test3(ob);
	System.out.println("*********");
	ob.test4();
	System.out.println("***** Calling  static member without class name ***************");
	test5();
	System.out.println("*********");
	System.out.println(b);
	}

}
