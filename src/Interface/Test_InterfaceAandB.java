package Interface;

public class Test_InterfaceAandB implements Interface_A , Interface_B{

	
	int e =16;
	final int f =21;
	
	void test3() {
		System.out.println("test3() specifically belong to Test_InterfaceAandB ");
	}
	public static void main(String[] args) {
		/*
		 *Rule=  We cannot create object of Interface. If we try to do so then as result compile time error occurs.Hence commenting it.
		 *InterfaceA ob = new InterfaceA();
		 *InterfaceB ob1 = new InterfaceB();
	    */
		
		// Rule = We can only create reference of interface and can only access methods and variable of this interface only.
		System.out.println("******************* We are using reference of InterfaceA*******************");
		Interface_A ob = new Test_InterfaceAandB();
		System.out.println(ob.a);
		System.out.println(ob.b);
		ob.test1();

		// Rule = We can only create reference of interface and can only access methods and variable of this interface only.
		System.out.println("******************* We are using reference of InterfaceB*******************");
		Interface_B ob1 = new Test_InterfaceAandB();
		System.out.println(ob1.c);
		System.out.println(ob1.d);
        ob1.test2();
        
        // using reference and object of Testclass we can access all method and variable of InterfaceA , InterfaceB and Testclass.
        System.out.println("******************* We are using reference and object of TestInterfaceAB()*******************");
        
        // all method and variable of interfaceA
        Interface_A ob2 = new Test_InterfaceAandB();
        System.out.println(ob2.a);
        System.out.println(ob2.b);
        ob2.test1();
        
        // all method and variable of interfaceb
        Interface_B ob3 = new Test_InterfaceAandB();
        System.out.println(ob3.c);
        System.out.println(ob3.d);
        ob3.test2();
        
        // all method and variable of Test_InterfaceAandB class
        
        Test_InterfaceAandB ob4 = new Test_InterfaceAandB();
        System.out.println(ob4.a);
        System.out.println(ob4.b);
        System.out.println(ob4.c);
        System.out.println(ob4.d);
        System.out.println(ob4.e);
        System.out.println(ob4.f);
        
        ob4.test1();
        ob4.test2();
        ob4.test3();
	}

	@Override
	public void test2() {
	System.out.println("test2() is implemented in Test_InterfaceAandB");
	}

	@Override
	public void test1() {
		System.out.println("test1() is implemented in Test_InterfaceAandB");
		}

}
