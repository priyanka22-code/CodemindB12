package javapractices;

public class Abstract_1 {

	public static void main(String[] args) {
		calculation c = new calculation();
		c.addition();
		c.sub();
	}
}
abstract class arthnmaticoperation {
	// instance variable
	int a = 20;
	int b = 30;
	// instance function/method

	public void addition() {
		System.out.println(a + b);
	}
	public abstract void sub();
}
class calculation extends arthnmaticoperation {

	@Override
	public void sub() {
		System.out.println(a-b);
		
	}
	

	}
