package javapractices;

public class Stringmethods {

	public static void main(String[] args) {
	String s = "Welcome to codemind";
	
	//Returns the char value at thespecified index. 
	//Returns the char value at thespecified index. 
	//charAt Method 
   char c = s.charAt(8);
   System.out.println(c); 
   
  //concat - joint the two string 
   System.out.println(s.charAt(11));
   System.out.println(s.concat(" Pune"));
   
   //Returns true if and only 
   //if this string contains the specifiedsequence of char values.
    System.out.println(s.contains("codemind"));
  //End with .Tests if this string ends with the specified suffix.
    System.out.println(s.endsWith("codemind"));
    //compare to .Compares two strings lexicographically
    
 System.out.println(s.compareTo("pune"));
    
   
	}

}
