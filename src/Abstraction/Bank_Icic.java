package Abstraction;

public class Bank_Icic extends AbstractBankClass{

	public static void main(String[] args) {
		AbstractBankClass ob = new Bank_Icic();
		ob.test();
		ob.OpenBankAccount();
		ob.RateOfInterest();

	}

	@Override
	void RateOfInterest() {
    System.out.println("Rate of interest of Icic bank is 4.5 %");
	}

}
