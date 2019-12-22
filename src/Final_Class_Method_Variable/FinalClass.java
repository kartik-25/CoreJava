package Final_Class_Method_Variable;
/* Rule of Final class
 
  1. Final class cannot be extended by any other class.
  2. making a class , method and variable final help java to improve performance 
      because jvm get opportunity to make assumption and optimization.
   3. All variable defined inside Interface are by default final.
 
Important Rule to remember
1 => we use Final to prevent inheritance.
2 => we use final to prevent method overloading. 
*/
public class FinalClass {

	public void test() {
		System.out.println("I belong to finalClass");
	}
}
