package MethodOverRidding;

public class Example1 {

	public void test1() {
		System.out.println("Parent class Example2 having Public method as test1()");
		}
		
		protected void test2() {
		System.out.println("Parent class Example2 having Protected method as test2()");
		}

		private void test3() {
		System.out.println("Parent class Example2 having Private method as test3()");
		}
		
		void test4() {
		System.out.println("Parent class Example2 having Default method as test4()");
		}
		
		static void test5() {
		System.out.println("Parent class Example2 having Static method  as test5()");
		}
		
		final void test6() {
			System.out.println("Parent class Example2 having Final method as test6()");
		}
}
