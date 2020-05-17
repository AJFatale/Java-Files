package Polymorphism;
import java.util.*;
public class CollectionInterface {
public static void main(String[] args) {
	List<String> l=new ArrayList<String>();
	l.add("Abhi");
	l.add("akash");
	l.add("Akshay");
	
	List<String>l1=new LinkedList<String>();
	l1.add("abc");
	l1.add("xyz");
	l1.add("pqr");
	ArrayList<String> l2=new ArrayList<String>();
	l2.add("Amit");
	l2.add("Vijay");
	l2.add("Kumar");
	l2.add(2,"Sachin");
	ListIterator<String> it=l2.listIterator();
            System.out.println();
            System.out.println("arrayList:"+l);
	System.out.println("linkedList:"+l1);	
	System.out.println("traversing elements in forward direction...");
	while(it.hasNext()) {
		System.out.print(" "+it.next());
	}
	
	System.out.println("\ntraversing element of linked list in backward direction...");
	while(it.hasPrevious()) {
		System.out.print(" "+it.previous());
	}
}
}
