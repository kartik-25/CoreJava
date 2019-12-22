package Constructor;

public class Test_ConstructorA_case2 extends ConstructorA {
	
	
public Test_ConstructorA_case2() {
super(11); // firstly parent class parameterized integer constructor is invoked then child class default constructor.
System.out.println("Child class default constructor[Test_ConstructorA_case2()]");
}

public Test_ConstructorA_case2 (int a) {
super("OHM"); // firstly parent class parameterized string constructor is invoked then child class parameterized integer constructor.
System.out.println("Child class Parameterized integer constructor[Test_ConstructorA_case2(int a)]");	
}

public Test_ConstructorA_case2 (String a) {
// Rule => If super() is not explicitly specified then Firstly parent class default constructor is invoked then child class parameterized string constructor.
System.out.println("Child class Parameterized String constructor[Test_ConstructorA_case1(String a)]");	
}

public static void main(String[] args) {
	
System.out.println("***************firstly calling child class default constrctor*******");
Test_ConstructorA_case2 ob= new Test_ConstructorA_case2();

System.out.println("***************Secondly calling child class Parameterized Integer constructor*******");
Test_ConstructorA_case2 ob1= new Test_ConstructorA_case2(6);
	
System.out.println("*************** Third calling child class Parameterized String constructor*******");
Test_ConstructorA_case2 ob2= new Test_ConstructorA_case2("GoriShankar");		

	}

}
