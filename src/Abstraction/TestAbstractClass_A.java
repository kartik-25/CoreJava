package Abstraction;

public class TestAbstractClass_A extends AbstractClass_A {

	public static void main(String[] args) {
		
		TestAbstractClass_A ob = new TestAbstractClass_A();
		ob.test1();
		ob.test2();
		ob.test3();
		
	}
	@Override
	public void test1() {
		 System.out.println("Remaning method are called from TestAbstractClassA java class");
	}

	@Override
	public void test2() {
		 System.out.println("Remaning method are called from TestAbstractClassA java class");
	}

	
	
}
