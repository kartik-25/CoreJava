package Final_Class_Method_Variable;
/*
  Rule 1 =  We cannot establish inheritance relationship with final class . If try then compile time error occurs.
                                or
    if we try to extend parent class of final type in child class. Then as a result compile time error occurs. refer below code
  
  public class TestFinalClass extends Finalclass {
   }
  
  Rule 2 =We can only access final class through object and reference of final class in other class.
  
  Note we are not establishing inheritance relationship between them.  
 */

public class Test_FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalClass ob = new FinalClass();
		ob.test();

	}

}
