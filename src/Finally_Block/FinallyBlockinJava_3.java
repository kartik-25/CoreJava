package Finally_Block;

public class FinallyBlockinJava_3 {

	public void test() {
		try {
			System.out.println("Inside try method");
			int a[] = new int [5];
			a[5]= 30/2; // ArrayIndexoutofBound
			} catch (NullPointerException e) {
				System.out.println("Inside catch block");
				System.out.println("Divide by zero");
			} finally {
			   System.out.println("Finally block execute even when exception not handled in catch block");
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinallyBlockinJava_3 ob = new FinallyBlockinJava_3();
		ob.test();

	}

}
