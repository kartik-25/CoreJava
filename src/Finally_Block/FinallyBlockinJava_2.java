package Finally_Block;
/*
 * Rule=> We can write Try block without catch block if there is finally block. 
 */


public class FinallyBlockinJava_2 {

	public void test1() {
	
	try {
		int a[] = new int[5];
		a[5]=30/0;
	} finally {
		System.out.println("I belong to finally block");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyBlockinJava_2 ob = new FinallyBlockinJava_2();
		ob.test1();
	}

}
