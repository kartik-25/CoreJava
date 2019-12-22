package Constructor;

public class Test_ConstructorA_case3 extends ConstructorA {
	
	
	Test_ConstructorA_case3(){
	super("OHM");
	System.out.println("Child class default constructor[Test_ConstructorA_case3()]");
	}

	
	
	Test_ConstructorA_case3(int a){
	this();
	System.out.println("Child class Parameterized integer constructor[Test_ConstructorA_case3(int a)]");
	/* Rule of This() keyword
	=> this() will by default call default constructor (Test_ConstructorA_case3()) .
	=> Default constructor will behave accordingly.
    */
	}
	
	Test_ConstructorA_case3(String a) {
	//Rule=>In constructor we can not use both super() and this() keyword together as compile time error is displayed eg super(); this();
	System.out.println("Child class Parameterized String constructor[Test_ConstructorA_case3(String a)]");
	
	/*Rule => Super()or this() keyword must be declared in first line under constructor. 
	        However if written in below line then compile time error is displayed. */

	}
	public static void main(String[] args) {

	System.out.println("***************firstly calling child class default constrctor*******");
	Test_ConstructorA_case3 ob = new Test_ConstructorA_case3();
	System.out.println("***************Secondly calling child class Parameterized Integer constructor*******");
	Test_ConstructorA_case3 ob1 = new Test_ConstructorA_case3(6);
	System.out.println("*************** Third calling child class Parameterized String constructor*******");
	Test_ConstructorA_case3 ob2 = new Test_ConstructorA_case3("ArdhNareshwar");

	}

}
