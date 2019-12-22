package SIB_and_IIB;
/*
Rule =>Static Initialization Block (SIB)
 Whenever we are writing static block to any class. It will get loaded to memory the movement the class will Loaded to memory.
 It will get executed only once.
*/

public class TestSIBandIIB_1 {

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

	}

}
