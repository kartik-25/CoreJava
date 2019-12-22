package Abstraction;
/*
When abstract class implement interface then we can implement selected method based on our requirement. 
so out of 3 method we are only defining one test3() in abstract class.
Remaining 2 method will be defined in classB.
*/
public abstract class AbstractClass_A implements InterfaceExample{

	

	@Override
	public void test3() {
		System.out.println("Only one single method test3() is implemented AbstractClass_A");
		
	}


}
