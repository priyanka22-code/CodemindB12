package javapractices;

public class Thiskeywordusing {

	public static void main(String[] args) {
		Thisuse thisuse = new Thisuse(10, 20);
		thisuse.add();
		System.out.println(thisuse.hashCode());
		Thisuse thisuse2 = new Thisuse(150, 20);
		thisuse2.add();
	}
}
class Thisuse {
	int num1;
	int num2;
	public Thisuse(int a, int b) {
		num1 = a;
		num2 = b;
	}
	public void add() {
		System.out.println(this.hashCode());

		System.out.println(num1 + num2);
	}

}