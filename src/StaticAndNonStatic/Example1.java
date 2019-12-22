package StaticAndNonStatic;

public class Example1 {

	static String a ="Shree Ganesh";
	String b="Shiv Shakti";
	
	/*Rule
	 1.	We can only use static variable in static method.    
	 We can't use non static variable. Non static variable requires object for calling. 
	 Static method does not depend upon object. So we can't call non static variable.
	 */
	
	public static void Ganesh_display() {
	System.out.println("Shree Ganeshaya Namaha");
	System.out.println(a);
	}
	
	/*Rule
	 2. We can use both static and non static variable in Non-Static method.
    Using object we can call both non static and static variable. 
	 */
	public void Shivdas() {
	System.out.println(a);
	System.out.println(b);
	System.out.println("OHM Durgaya Namaha OHM Ambaye Namaha");
	System.out.println("OHM Namah Shivay");
	}
	
	public static void main(String[] args) {

	System.out.println("****directly calling static method and variale*****");
	Ganesh_display();
	System.out.println(a);
	System.out.println("****Using class name calling static method and variable******");
	Example1.Ganesh_display();
	System.out.println(Example1.a);
	System.out.println("****Create object for acessing Non static method******");
	Example1 obj= new Example1();
	// Rule =Calling non static method using object
	obj.Shivdas();
	System.out.println(obj.b);
	
	// Rule => calling static method using object. However it is not recommended as it occupies extra space to load in heap memory.
	
	System.out.println("****Static method using object******");
	obj.Ganesh_display();
	System.out.println(obj.a);
	

	}

}
