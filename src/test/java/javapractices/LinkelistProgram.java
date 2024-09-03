package javapractices;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkelistProgram {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		//Add Method 
		linkedlist.add(100);
		linkedlist.add(null);
		linkedlist.add(200);
		linkedlist.add(300);
		linkedlist.add(100);
		
		for(Integer i: linkedlist) {
			System.out.println(i);
		}
	System.out.println("********************************");
	//Clear method.
	linkedlist.clear();
for(Integer i: linkedlist) {
	System.out.println(i);
}
System.out.println("************************");
//List Is Empty -Boolean Expression return 
System.out.println("Linkedlist is Empty=" +linkedlist.isEmpty()); 
System.out.println("**********************************************");
//Add All Method
LinkedList<Integer> linkedlist2 =new LinkedList<Integer>();
linkedlist2.add(50);
linkedlist2.add(300);
linkedlist2.add(500);

linkedlist.addAll(linkedlist2);
for(Integer j: linkedlist) {
	System.out.println(j);
}
System.out.println("****************************");
//Remove Method 
linkedlist.remove(0);
for (Integer j: linkedlist) {
	System.out.println(j);
}
System.out.println("*****************************");
System.out.println("Size of Linkedlist=" + linkedlist.size());
System.out.println("*****************************************");
//Contains method 
System.out.println(linkedlist.contains(300));
System.out.println(linkedlist.contains(3000));
System.out.println("*****************************************");
//Get Method 
System.out.println(linkedlist.get(0));
System.out.println("********************************************");
//Iterator Method 
Iterator<Integer> it = linkedlist.iterator();
while (it.hasNext()) {
	System.out.println(it.next());
}
	}

}
