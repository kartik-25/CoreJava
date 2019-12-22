package WrapperClass;
/*
 Wrapper Classes are those classes , which are used to 'wrap' primitive variable in such a way that they behave like object.
 1. Integer :- for wrapping int variable.
 2. Character :- for wrapping char variable.
 3. Boolean :- for wrapping boolean variable.
 4. Long :- :- for wrapping long value.
 5. Float :- for wrapping float value.
 6. Double :- for wrapping double value.
 */

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x ="100";
		System.out.println(x+200);
		
		//data conversion : String into integer
		int i =Integer.parseInt(x);
		System.out.println(i+21);
		
		//data conversion :- String into double
		String y= "21.21";
		double j=Double.parseDouble(y);
		System.out.println(j+21.21);
		
		//data conversion :- String into boolean
		String z ="true";
		Boolean k=Boolean.parseBoolean(z);
		System.out.println(k);
		
		//data conversion :- Integer into string;
		int a =200;
		System.out.println(a+900);
		String l=String.valueOf(a);
		System.out.println(l+500);
		
		// Scenario =>
		String b="100a"; // In valid string hence it will give run time exception if we try to execute it .
		int m=Integer.parseInt(b);
		System.out.println(b); // Runtime error is displayed.

	}

}
