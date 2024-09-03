package javapractices; 

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	void read () throws FileNotFoundException {
	 File f =new File("c//user//priyanka//mydoc/abc.txt");
	 
			FileReader fr= new FileReader(f);
	}

	public static void main(String[] args) {
		
		//FileNot Found exception by using try & catch
		ExceptionHandling eh = new ExceptionHandling ();
		try {
		eh.read();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Check Exception using try/catch");
	}

}
    
