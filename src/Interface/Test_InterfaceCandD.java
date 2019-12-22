package Interface;

public class Test_InterfaceCandD implements Interface_C, Interface_D {
	
	int l=99;
	
	public static void test1() {
		System.out.println("Static method that belong to TestInterfaceCandD");
	}
	public static void main(String[] args) {
	
		Test_InterfaceCandD ob = new Test_InterfaceCandD();
		test1();
		System.out.println(ob.i);
		System.out.println(ob.j);
		System.out.println(ob.k);
		System.out.println(ob.l);
		
		ob.sum();
		ob.sub();
		ob.multiply();

	}

	@Override
	public void multiply() {
    System.out.println("Multiply i*j*k*l= "+(i*j*k*l));
    System.out.println("Multiply i*j*l= "+(i*j*l));
    System.out.println("Multiply i*l= "+(i*l));
		
	}

	@Override
	public void sum() {
	System.out.println("Sum of i+j+k+l= "+(i+j+k+l));
	System.out.println("Sum of j+k+l= "+(j+k+l));
	System.out.println("Sum of i+j+k= "+(i+j+k));
	}

	@Override
	public void sub() {
	System.out.println("Sub of i+j-k-l= "+(i+j-k-l));
	System.out.println("Sub of j+k-l= "+(j+k-l));
	System.out.println("Sub of i-j+k= "+(i-j+k));
	}

}
