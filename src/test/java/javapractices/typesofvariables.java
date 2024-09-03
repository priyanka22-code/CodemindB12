package javapractices;

public class typesofvariables {

	public static void main(String[] args) {
		System.out.println(variable.d);
		System.out.println(variable.g);
		variable variable = new variable();
		System.out.println(variable.a);
		variable.test();
		

	}

}
class variable{
	
	//instance member variable 
int a=10;
public float c=25.5f;

//static member variable 
public static int d=30;

//final variable

public final int e =40;
static final int g=50;

//local variable 

public void test () {
	
	final int f=10+20;
	System.out.println(f);
}
		
	}
	
