package javapractices;

public class Thiskeyword {
	int a = 20;
	int b = 20;

	public static void main(String[] args) {

		Thiskeyword thiskeyword = new Thiskeyword();
		thiskeyword.add(20, 30);
		System.out.println(thiskeyword.a + thiskeyword.b);
	}

	public void add(int a, int b) {
		this.a = a;
		this.a = b;
	}
	public Thiskeyword() {
		this(10);
		System.out.println("Default Constructor");
	}
	public Thiskeyword(int num) {
		this(10, 0.20f);
		System.out.println("one parameter Constructor");
	}
	public Thiskeyword(int num, float num2) {
		System.out.println("two parameter Constructor");
	}
}
