package ReturnType;

/*
 Return Type = Output return by method is called return type.
 
 String is sequence of character  . It specified by double quote (" ").

 Character is single character . It is specified by single quote ( ' ').
 */

public class Example {
	
	
	void test1() {
		System.out.println("void test1()");
	}

	int test2() {
		System.out.println("int test2()");
		return 2;
	}
	
	double test3() {
		System.out.println("double test3()");
		return 2.2;
	}
	
	String test4() {
		System.out.println("String test4()");
		return "OHM";
	}
	
	char test5() {
		System.out.println("char test5()");
		return 'o';
	}
	
	boolean test6() {
		System.out.println("boolean test6()");
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example ob = new Example();
		ob.test1();
		ob.test2();
		ob.test3();
		ob.test4();
		ob.test5();
		ob.test6();

	}

}
