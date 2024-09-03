package javapractices;

public class StringMethod2 {

	public static void main(String[] args) {
	String s= "Welcome to codemind";
	
//Compare to ignore case Compares two strings lexicographically
System.out.println(s.compareToIgnoreCase("Welcome to COD"));

//Equals Compares this string to the specified object. 
//The result is true if and only if the argument is not null and 
//is a String object that represents the same sequence of characters as this object. 
 System.out.println(s.equals("Welcome to pune"));
 
 //Equal to ignore case . 
 
 System.out.println(s.equalsIgnoreCase("Welcome TO codemind"));
 
 //Indexof . 
 
 System.out.println(s.indexOf("t"));


	
	}

}
