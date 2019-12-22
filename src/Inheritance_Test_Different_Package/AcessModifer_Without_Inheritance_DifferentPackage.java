package Inheritance_Test_Different_Package;

import Inheritance.Example;

public class AcessModifer_Without_Inheritance_DifferentPackage {

	public static void main(String[] args) {
	
		
	System.out.println("******** Using reference and object of Child class *********");
		
		//	Rule = In case if we don't have inheritance relationship  then we can only access public (method and variable).
		Example ob = new Example();
		System.out.println(ob.a);
		ob.test1();

	}

}
