package javapractices;

public class NestedStatment {

	public static void main(String[] args) {
		 
		int AccountBalance=6000;
		final int PIN = 1234;
		int AvailableCurrenciesInMachine = 100;
		int WithdrawAmount =2000;
		
		if(PIN == 1234)
		{
		if(WithdrawAmount < AccountBalance)
		{
		if (AvailableCurrenciesInMachine == 100) {
			AccountBalance = AccountBalance- WithdrawAmount ;
			System.out.println(AccountBalance);
					
				}
		else {
			System.out.println("Mentioned currencies not in ATM ");
		}	
			}
		else {
			System.out.println("Account balance is insufficient");
		}
		System.out.println("#################################");
		String color ="Green";
		
		switch (color) {
		case "white":
			System.out.println("color is white");
			break;
		case "Green":
			System.out.println("color is Green");
			break;
		case "yellow":
			System.out.println("color is yellow");
			break;
		default:
			System.out.println("Color is invalid");
			break;
		}
		}
		
	}

}
