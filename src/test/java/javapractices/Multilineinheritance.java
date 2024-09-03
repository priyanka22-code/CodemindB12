package javapractices;

public class Multilineinheritance {

	public static void main(String[] args) {

		threewheelers t = new threewheelers();
		
		System.out.println(t.Companyname);
		System.out.println(t.comapnytype);
		System.out.println(t.Companyproduct);
		System.out.println(t.industri);
		System.out.println(t.Product);
		System.out.println(t.Type);
		System.out.println(t.Startingsystem);
		System.out.println(t.color);
		t.run();
		t.stand();
	}
}
class Company {
	// Properties
	String Companyname = "TVS Motor";
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
class Twowheelers extends Company {
	String Product = "TVS Jupiter";
	String color = "white/";
	String Type = "Single cylinder, 4 stroke, CVTi, fuel injection";
	String Startingsystem = "Kick Start & Electric Starter";
}
class threewheelers extends Twowheelers {
	String Product = "TVS King Duplex";
	String Enginetype = "4 Stroke";
	String Type = "CNG,LPG,Petrol";
	String Startingsystem = "Kick Start & Electric Starter";
}
