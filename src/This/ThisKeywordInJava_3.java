package This;
/*
 *  Rule of this() keyword 
   By default global variable is given preference over local variable.
   Using this() keyword local variable is given preference over global variable.
   When naming of my local variable and global variable is not same.then as result local value will override global value.
 */
public class ThisKeywordInJava_3 {
	
	// global variable
	int a = 9;
	int b = 99;
	
	void test(int a , int b) {
	a=a;
	b=b;
	}
	
	//Rule= Using this() keyword local variable is given preference over global variable.
	void test2(int a , int b) {
	this.a=a;
	this.b=b;
	}
	
	/*
	 Scenario : Example when we will not use this keyword.  But still my code will work.
	 * Solution =>  When naming of my local variable and global variable is not same.
	  Note => If name of global and local variable is same then then we have to use This() keyword to diplay local variable
	 */
	
	//Rule= When naming of my local variable and global variable is not same.then as result local value will override global value.
    void test3( int p , int q) {
    a=p;
    b=q;
    }
    
    void display() {
    System.out.println("value of a and b==> "+a+";"+b);
    }
    
    public static void main(String[] args) {
    
    	ThisKeywordInJava_3 ob = new ThisKeywordInJava_3();
    	System.out.println("**** scenario A *******");
    	ob.test(2, 22);
    	ob.display();
    	System.out.println("**** scenario B *******");
    	ob.test2(3, 33);
    	ob.display();
    	System.out.println("**** scenario C *******");
    	ob.test3(4, 44);
    	ob.display();
    	
    }
}
