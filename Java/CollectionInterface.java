package Java;
import java.util.*;
public class CollectionInterface {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add("Sachin");
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ravi");
		ll.add("Akash");
		ll.add("Prajakta");
		ll.add("Ajay");
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("element at 2nd position:"+al.get(2));
		
		ListIterator<String> litr = al.listIterator();
		System.out.println("\ntraversing elements of linked list in forward direction...");
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("\ntraversing element of linked list in backward direction...");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
				
	}
}