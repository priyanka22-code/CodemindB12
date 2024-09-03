package javapractices;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgramm {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Priyanka");
		set.add("Pranv");
		set.add("Shree");
		set.add("Shrisha");
		set.add("Pranav");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*************LinkedHashset*****************");
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("Priyanka");
		set2.add("Pranv");
		set2.add("Shree");
		set2.add("Shrisha");
		set2.add("Pranav");
		Iterator<String> it2 = set2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("******************TreeSet*********************");
		// Treeset
		Set<String> set3 = new TreeSet<String>();
		set3.add("Priyanka");
		set3.add("Pranv");
		set3.add("Shree");
		set3.add("Shrisha");
		set3.add("Pranav");
		Iterator<String> it3 = set3.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
	}

}
