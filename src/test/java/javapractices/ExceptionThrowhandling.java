package javapractices;

public class ExceptionThrowhandling {

	public static void main(String[] args) {
		String s= "Welcome to Goa";
		
		
	try {
		s=null;
		throw new NullPointerException();
	}catch (NullPointerException e) {
		
		System.out.println("Exception catch = "+  e.getMessage());
	}
	}

}