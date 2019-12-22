package Constructor;

public class Test_ConstructorA_case1 extends ConstructorA {

/* Rule of Super() keyword 
Super() ; this method  is provided  by default by Java
First Super statement will first call parent class default constructor . 
Secondly Then it will call child class default constructor. 
*/	
	
public Test_ConstructorA_case1()
{
System.out.println("Child class default constructor[Test_ConstructorA_case1()]");
}

public Test_ConstructorA_case1(int a) {
System.out.println("Child class Parameterized integer constructor[Test_ConstructorA_case1(int a)]");	
}

public Test_ConstructorA_case1(String a) {
System.out.println("Child class Parameterized String constructor[Test_ConstructorA_case1(String a)]");		
}

public static void main(String[] args) {

	System.out.println("***************firstly calling child class default constrctor*******");
	Test_ConstructorA_case1 ob= new Test_ConstructorA_case1();

	System.out.println("***************Secondly calling child class Parameterized Integer constructor*******");
	Test_ConstructorA_case1 ob1= new Test_ConstructorA_case1(6);
	
	System.out.println("*************** Third calling child class Parameterized Integer constructor*******");
	Test_ConstructorA_case1 ob2= new Test_ConstructorA_case1("ShivShakti");

	}

}
