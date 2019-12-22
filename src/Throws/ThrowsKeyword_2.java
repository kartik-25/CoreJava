package Throws;

import java.io.IOException;

public class ThrowsKeyword_2 {

	
	void test1() throws IOException {
		// we are making object of IOexception
		throw new IOException("I am throwing IOexception");
	}
	
	void test2() throws IOException {
		System.out.println("I am running from Test2 method");	
		// Rule => Since we are calling test1() . So we have to declare IO exception in test2() method.
		test1();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ThrowsKeyword_2 ob = new ThrowsKeyword_2();
		ob.test2();
	}

}
