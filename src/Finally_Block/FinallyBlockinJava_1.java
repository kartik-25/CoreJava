package Finally_Block;
/*
=>	Finally, block is used to execute very important piece of code.
=>	The code that we always want to execute. We can’t miss that code.
=>	Irrespective anything that  happen to program finally block will get execute.
Note => this mainly used when we want to stop database or JDBC connection then we can write in finally block.
 */

public class FinallyBlockinJava_1 {

	public void test1() {
		try {
			
		}catch (Exception e) {
			
		}finally {
		System.out.println("I am from finally block in java");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyBlockinJava_1 ob = new FinallyBlockinJava_1();
		ob.test1();
	}

}
