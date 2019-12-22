package SIB_and_IIB;
/*
Rule=> Instance Initialization Block (IIB)

The movement you create object of class IIB will get loaded.
It will get executed as per object. If we create 10 object IIB will get executed 10 times.
*/

public class TestSIBandIIB_2 {
	
	static {
		System.out.println("I am from SIB 1");
		}
		
		static {
		System.out.println("I am from SIB 2");
		}
		
		{
	    System.out.println("I am from IIB 1");
		}
		
		{
		System.out.println("I am from IIB 2");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSIBandIIB_2 ob = new TestSIBandIIB_2();
		

	}

}
