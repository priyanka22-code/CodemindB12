package javapractices;
public class Singlelevelinheritance {
	public static void main(String[] args) {
		Twowheeler t = new Twowheeler();

		System.out.println(t.ComapnyName);
		System.out.println(t.comapnytype);
		System.out.println(t.Companyproduct);
		System.out.println(t.industri);
		System.out.println(t.color);
		System.out.println(t.Type);
		System.out.println(t.Startingsystem);
		t.run();
		t.stand();
	}
}
class Vehical {
	// properties
	String ComapnyName = "TVS Motor";
	String comapnytype = "Manufacture";
	String Companyproduct = "Two-wheeler Three-wheeler Automobile parts";
	String industri = "Automotive";
	// Behaviour
	public void run() {
		System.out.println("Vehical is running");
	}
	public void stand() {
		System.out.println("Vehical is standing");
	}
}
class Twowheeler extends Vehical {

	String Product = "TVS Jupiter";
	String color = "white/";
	String Type = "Single cylinder, 4 stroke, CVTi, fuel injection";
	String Startingsystem = "Kick Start & Electric Starter";
}