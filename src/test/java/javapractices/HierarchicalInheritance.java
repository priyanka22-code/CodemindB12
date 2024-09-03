package javapractices;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		TVSJupiter j =new TVSJupiter ();
		System.out.println(j.Companyname);
		System.out.println(j.comapnytype);
		System.out.println(j.Companyproduct);
		System.out.println(j.industri);
		System.out.println(j.Product);
		System.out.println(j.Type);
		System.out.println(j.color);
		System.out.println(j.Startingsystem);
		j.run();
		j.stand();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		
		TVSApache a=new TVSApache();
		System.out.println(a.Product);
		System.out.println(a.Type);
		System.out.println(a.Enginetype);
		System.out.println(a.Startingsystem);
	}

}
class TVSMotor {
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
class TVSJupiter extends TVSMotor {
	String Product = "TVS Jupiter";
	String color = "white";
	String Type = "Single cylinder, 4 stroke, CVTi, fuel injection";
	String Startingsystem = "Kick Start & Electric Starter";
}
class TVSApache extends TVSMotor {
	String Product = "TVS Apache";
	String Enginetype = "2 Stroke";
	String Type = "Petrol";
	String Startingsystem = "Kick Start & Electric Starter";
}
