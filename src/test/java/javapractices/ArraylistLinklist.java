package javapractices;
import java.util.ArrayList;
import java.util.Iterator;
public class ArraylistLinklist {
	public static void main(String[] args) {
		ArrayList<Integer> Arraylist = new ArrayList<Integer>();
		Arraylist.add(null);
		Arraylist.add(20);
		Arraylist.add(10);
		Arraylist.add(40);
		Arraylist.add(20);
		// for loop
		for (int i = 0; i < Arraylist.size(); i++) {
			System.out.println(Arraylist.get(i));
		}
		// for each loop
		// for(Integer i:Arraylist) {
		// System.out.println(i);
		System.out.println("************************************");
		// Clear Method =Removes all of the elements from this list. The list willbe
		// empty after this call returns.
		Arraylist.clear();
		for (Integer i : Arraylist) {
			System.out.println(i);
		}
		System.out.println("***********************************");
		//Is Empty  Returns true if this list contains no elements.
		System.out.println("Arraylist is Empty= "+ Arraylist.isEmpty());
		System.out.println("**************************************");
		// ADD ALL
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		arraylist2.add(10);
		arraylist2.add(100);
		arraylist2.add(500);
		arraylist2.add(10);
		arraylist2.add(200);
		arraylist2.add(400);
		arraylist2.add(10);
		Arraylist.addAll(arraylist2);
		for (Integer j : Arraylist) {
			System.out.println(j);
		}
		System.out.println("*******************");
		// Remove method
		Arraylist.remove(2);
		for (Integer j : Arraylist) {
			System.out.println(j);
		}
		System.out.println("***********************");
		// size method - size of your index
		System.out.println(Arraylist.size());
		System.out.println("*****************************");
		//Contains method Returns true if this list contains the specified element.
		System.out.println(Arraylist.contains(100));
		System.out.println(Arraylist.contains(1000));
		System.out.println("************************************");
		System.out.println(Arraylist.isEmpty());
		System.out.println("********************************");
		//Get Method Returns the element at the specified position in this list
		System.out.println(Arraylist.get(0));
		System.out.println("*******************************************");
		Iterator<Integer> it= Arraylist.iterator();
		//Returns true if the iteration has more elements.
		while (it.hasNext()) {
			//It.Next -Returns true if the iteration has more elements.
		System.out.println(it.next());
		}
		System.out.println("****************************");
		//remove all-
		ArrayList<Integer> Arraylist3 = new ArrayList <Integer>();
		Arraylist3.add(10);
		Arraylist3.add(400);
		Arraylist.removeAll(Arraylist3);
		
		Iterator <Integer> it2=Arraylist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}
	
}
