package javapractices;

public class Multipleinheritance {

	public static void main(String[] args) {

		student_1 S = new student_1();
		S.play();
		S.study();
	}
}
interface student1 {
	// instance variable
	String name = "priyanka";
	int SID = 101;
	int age = 29;
	// methods/function
	void study();
}
interface student2 {
	// variable
	String name = "Nilam";
	int SID = 102;
	int age = 30;
	// Method
	void play();
}
interface student extends student1, student2 {
}
class student_1 implements student {
	@Override
	public void study() {
		System.out.println("Student is Studing");
	}
	@Override
	public void play() {
		System.out.println("Student is playing");
	}
}