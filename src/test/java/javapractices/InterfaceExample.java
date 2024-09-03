package javapractices;

public class InterfaceExample {

	public static void main(String[] args) {
		employeeclass E = new employeeclass();
		E.salary();
		E.Working();
	}
}
interface Employee {
	// instance variable
	public static final int employeeID = 20;
	int age = 29;
	String name = "Sunil";
	// instance function/Method
	public abstract void salary();
	void Working();
}
class employeeclass implements Employee {
	@Override
	public void salary() {
		System.out.println(50000);
	}
	@Override
	public void Working() {
		System.out.println("Employee is working ");
	}
}