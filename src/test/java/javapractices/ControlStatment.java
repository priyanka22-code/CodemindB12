package javapractices;

public class ControlStatment {

	public static void main(String[] args) {
		int number = 2;
		{
			if (number >= 0)
				System.out.println("Given number is Positive=" + number);
		}
		{
			if (number < 0)
				System.out.println("Given number is Negative=" + number);
		}
		System.out.println("##########################################");
		if (number % 2 != 0) {
			System.out.println("given number is odd=" + number);

		} else {
			System.out.println("given number is even=" + number);
		}
		System.out.println("######################################");

		float marks = 67;
		if (marks >= 35 && marks <= 50) {
			System.out.println("Your eligible for art");
		} else if (marks > 50 && marks <= 65) {
			System.out.println("Your eligible for commerse");
		} else if (marks > 65 && marks <= 70) {
			System.out.println("Your eligible for science");
		} else if (marks > 70) {
			System.out.println("Your eligible for computer science");
		} else {
			System.out.println("you are not eligible for any stream");
		}
		System.out.println("#########################"); 
	}
}
