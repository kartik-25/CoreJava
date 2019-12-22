package This;
//Rule => The scope of these local variable will only be limited to main() method.
//Rule => We must create object of class to access global variable and non static method()

public class Local_and_Global_Variable {

    int a =9;
    int age =99;
    
    
    void display() {
    int a =7;
    int age =77;
    System.out.println("Inside display() local value of a==> "+a);
    System.out.println("Inside display() local value of age==> "+age);
    
    }
	public static void main(String[] args) {
		
	// local variable i and j .
	// Rule => The scope of these local variable will only be limited to main() method.
	// Rule => Inside method we must call local variables directly.
	System.out.println("****Rule 1 ==> Inside method we must call local variables directly.*****************");
		
	int a =5;
	int age=55;
	
	System.out.println("Inside Main() local value of a==> "+a);
	System.out.println("Inside Main() local value of age==> "+age);
	
	//Rule  => We must create object of class to access global variable and non static method()
	
	Local_and_Global_Variable ob = new Local_and_Global_Variable();
	System.out.println("******Rule 2 ==> We must create object of class to access Non static method******");
	ob.display();
	System.out.println("******Rule 3 ==> We must create object of class to access Global variable******");
	System.out.println("Global variable value of  i ==>  "+ob.a);
	System.out.println("Global variable value of  i ==>  "+ob.age);
	
	
	

	}

}
