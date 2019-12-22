package Constructor;

public class TestConstructor2 {
	
// global variable
int a , b;

TestConstructor2(){
System.out.println("I am from default constructor");
}

TestConstructor2(int a){
this.a=a;
System.out.println("I am parameterized integer constructor(int a)");
}

TestConstructor2(int a , int b){
this.a=a;
this.b=b;
System.out.println("I am parameterized integer constructor(int a , int b)");
}

void display(){
System.out.println("value of a =>"+a);
}

void display1() {
System.out.println("value of a and b=>"+a+";"+b);
}

void sum() {
int d =a;
System.out.println("sum of integer a"+a);
}

void sum1() {
int d =a+b;
System.out.println("sum of integer a and b"+d);
}

public static void main(String[] args) {

	System.out.println("***** First constructor**********");
	// Rule = value of default constructor is not initialized.Hence 0(zero) will be displayed.
	TestConstructor2 ob = new TestConstructor2();
	ob.display();
	ob.display1();
	ob.sum();
	ob.sum1();
	
	
	System.out.println("***** Second  constructor**********");
	// Rule = value is initialized for parameterized constructor. hence 5 will be displayed.
	TestConstructor2 ob1 = new TestConstructor2(5);
	ob1.display();
	ob1.display1();
	ob1.sum();
	ob1.sum1();
	
	
	System.out.println("***** Third  constructor**********");
	// Rule = value is initialized for parameterized constructor. hence 5 will be displayed.
	TestConstructor2 ob2 = new TestConstructor2(5 ,5 );
	ob2.display();
	ob2.display1();
	ob2.sum();
	ob2.sum1();

	}

}
