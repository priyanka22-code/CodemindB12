package javapractices;

public class Superkeyword {
	public static void main(String[] args) {
		superchild Superclild = new superchild();
		Superclild.superchildadd();
	}
}
class superparent {

	int superparemt = 10;
	int a = 50;
	public void superparentadd() {

		System.out.println("add superparent");
	}
	superparent(int a) {
		System.out.println("Parent class comnstructor");
	}
}
class superchild extends superparent {
	int superclild = 20;
	int a = 60;
	public void superchildadd() {
		System.out.println("Super add");
		System.out.println(super.a + a);
	}
	superchild() {
		super(10);
		System.out.println("Child class constructor");
	}
}