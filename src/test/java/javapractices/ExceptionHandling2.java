package javapractices;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// Finally block
		
		int a[]= {10,30,40,50};
		int b;
		int c= 20;
		int d;
		
		try {
			b= a[10];
		}catch (Exception e) {
			System.out.println(e.getMessage() + "=ArrayIndexOutOfBondException");
		}
		try {
			d=c/0;
		}catch (Exception e) {
			System.out.println(e.getMessage() + "=Arithmatic Excepetion");
		}
	
		finally {
			System.out.println("Final block Excecute");
		}
		
		
		
	}
}
