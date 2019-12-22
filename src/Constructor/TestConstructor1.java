package Constructor;

/*
Question) In below script if we comment (remove) default constructor then what happen ?

Answer => If we forcefully write parameterized constructor to the class then JVM will not keep by default constructor to class.
When you are making object on default constructor. Hence compile time error occurs. 
Note => Default constructor is not written.  
*/

public class TestConstructor1 {
	
	/*TestConstructor1(){
		System.out.println("I am default constructor");
	} */
	
	TestConstructor1(int a){
	System.out.println("I am paramterized integer constructo");
	}

	public static void main(String[] args) {
	
	/* Rule =>  we have not written default constructor . But we are trying to call it then compile time error occurs
		 
	TestConstructor1 ob = new TestConstructor1();

	Solution => If we remove parameterized integer constructor then above line will work as jvm will keep default constructor  */	
		}

}
