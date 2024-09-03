package javapractices;

public class StringMethod3 {

	public static void main(String[] args) {
String s= "Welcome to codemind technology pune";
//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar. 
	System.out.println(s.replace('e', 'E'));
 System.out.println(s.replace("co", "##*&^"));
 
 //Replace All.Replaces each substring of this string that matches the 
 //given regular expression with thegiven replacement. 
   
 
 String ss= "asdSDJ765GFS45B98#@%$#&JH12FFT4";
 System.out.println(s.replaceAll("0-9", ss));
	
	}
	
	

}