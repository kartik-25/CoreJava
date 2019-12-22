package SIB_and_IIB;
/*
Rule => Static block can only take static variable. 
Rule => IIB block can take both static and non static variable.
*/
public class TestSIBandIIB_3 {
	
	static int a = 9;
	int b = 99;
	
	static {
	System.out.println(a);
	// System.out.println(b); rule = non static variable cannot be used in SIIB since compile time error is displayed.
	System.out.println("I am from SIB block");
	}
	
	{
	System.out.println(a);
	System.out.println(b);
	System.out.println("I am from IIB block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("SIB block is executed automatically once class get loaded");
		 TestSIBandIIB_3 ob = new  TestSIBandIIB_3();
		
	}

}
