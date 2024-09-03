package javapractices;

public class AccessSepcifiers {
	public int a = 10;
	private int b = 20;
	int c = 30;
	protected int d = 40;

	public void add() {

		System.out.println(a + a);
		System.out.println(b + b);
		System.out.println(c + c);
		System.out.println(d + d);

	}

}
