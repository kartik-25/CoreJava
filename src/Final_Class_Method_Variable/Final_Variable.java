package Final_Class_Method_Variable;

/* 
 Rule 1 = Final value must initialized . If it is not initialized then compile time error is  displayed.
  
 Rule 2 = When we try to initialize value of final variable(already initialized) through constructor  then compile time error occur.
 
 Rule 3 = If Final variable is not initialized then we can initialize through constructor of class.

 Rule 4 = Final variable cannot be reassigned to other value if we do so then compile time error is displayed.
  
  Rule 5 = If a variable is not final than its value can be reassigned successfully.  
*/

    public class Final_Variable {
 	
	/*
	Rule 1 = If a variable is not final than its value can be reassigned successfully.
		 */
    	
    int a =8 ;
    
    void test1() {
    a=88;
    System.out.println(a);
    }
    
    /*
    Rule 2 = Final variable cannot be reassigned to other value if we do so then compile time error is displayed.
    
     final int x = 8;
   			  
     void test2 (){
   	x =12 ;  //compile time error will occurs if we try to reassign already initialized final variable
   			  }
   	   */
    /*
    Rule 3 = Final value must initialized . If it is not initialized then compile time error is  displayed.
    		*/
    		 //  uninitialized final value will display compile time  error. e.g final int a;
    		 
    		  final int b =20;
    		  final int c = 55 ;
    		  
    /*
     Rule 4 = When we try to initialize value of final variable(already initialized) through constructor  then compile time error occur.
    		  
     finalVariable()  \\ using constructor if we try to initialize final variable then compile time error is displayed.
     {
     b = 55;  \\ compile time error is displayed.
     c = 55;  \\ compile time error is displayed.
     }
    */
     /*
    Rule 5 =If Final variable is not initialized then we can initialize through constructor of class.
    */
    		  
    final int k;
    
    Final_Variable(){
    k=55;
    System.out.println(k);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stu

   Final_Variable ob = new Final_Variable();
   System.out.println("Call nonstatic variable a =>"+ob.a);
   System.out.println("Call final variable b=>"+ob.b);
   System.out.println("Call final variable c=>"+ob.c);
   System.out.println("Call final variable k=>"+ob.k);


	}

}
