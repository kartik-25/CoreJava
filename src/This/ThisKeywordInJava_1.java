package This;
/*
 *  Rule of this() keyword 
=>	This is used to differentiate between local variable and global variable.
=>	This is used to call current class constructor 
=>	This can be used as method argument. This refer to current class
=>	Using this we can call non static member
=>	This will be available for non static member.
=>	In Non static method using This() we can call static variable.
=>  But inside Static method we cannot use this() keyword as compile time error is displayed.
 */
public class ThisKeywordInJava_1 {
	
	int a , b , c;
	
	ThisKeywordInJava_1(){
	System.out.println("I belong to default constructor of ThisKeywordInJava class");
	}
	
	ThisKeywordInJava_1(int a){
	this(); // Rule => this is used to call current class constructor
	this.a=a;
	System.out.println("I am from parameterized constructor ThisKeywordinJava1(int a)");
	}
	
	ThisKeywordInJava_1( int a , int b){
	this(4); // Rule =>This can be used as method argument. Hence calling parameterized integer constructor.
	this.a=a;
	this.b=b;
	System.out.println("I am from parameterized constructor ThisKeywordinJava1(int a , int b)");
	}
	
	

   ThisKeywordInJava_1(int a , int b ,int c){
	this(4,4);// Rule =>This can be used as method argument. Hence calling parameterized integer constructor.
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println("I am from parameterized constructor ThisKeywordinJava1(int a , int b , int c)");
    }
   
    void display() {
    	System.out.println("value of a, b,c==>  "+a+";"+b+";"+c);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordInJava_1 ob = new ThisKeywordInJava_1(9 , 9, 9);
		ob.display();

	}

}
