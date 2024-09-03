package javapractices;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistprogram {

	public static void main(String[] args) {
		
		ArrayList<Integer> Arraylist= new ArrayList<Integer>();
		Arraylist.add(null);
		Arraylist.add(10);
		Arraylist.add(40);
		Arraylist.add(80);
		Arraylist.add(100);
		Arraylist.add(10);
		
		//for using for loop
		
		for(int i=0; i<Arraylist.size(); i++) {
		//System.out.println(Arraylist.get(i));
		
		}
		// By using for each loop
		for(Integer i : Arraylist) {
			//System.out.println(i);
		}		
		// by using Iterator 
			Iterator <Integer> it = Arraylist.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("**************");
			
			//remove method. Removes the element at the specified position in this list
			Arraylist.remove(0);
			for (Integer i:Arraylist) {
				System.out.println(i);
			}
			//Arraysize Method . Returns the number of elements in this list.
			System.out.println("*****************");

			System.out.println(Arraylist.size());
			
			//Contains Method Returns true if this list contains the specified element.
			System.out.println("*****************************");
			System.out.println(Arraylist.contains(100));
			//add method .
			ArrayList<Integer> Arraylist2 = new ArrayList<Integer>();
			Arraylist2.add(null);
			Arraylist2.add(500);
			
		
			
			
		}
	}
	
	




