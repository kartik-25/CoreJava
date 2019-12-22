package Throws;

import java.io.IOException;

public class ThrowsKeyword_1 {

	 void test1() throws IOException {
	// we are making object of IOexception. or we are forcefully throwing IO exception.
	throw new IOException("I am from throws IO Exception");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ThrowsKeyword_1 ob = new ThrowsKeyword_1();
		ob.test1();

	}

}
