package collectionsFrameworkConcepts;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsInJava {

	// There are 3 cursors in Java - Enumeration, Iterator and listIterator
	  
	 
	/* 1. ENUMERATION -1.0v of Java
	 * This is a retrieval methodology to retreive only for legacy classes(Vector)
	 * Used to get objects one by one.
	 */
	public static void enumeration() {
		
		Vector<Integer> vector = new Vector<>();
		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(3);
		//Below is a way to create enumeration object using vector class elements.
		Enumeration<Integer> e = vector.elements();
		
		while(e.hasMoreElements()) {
			Integer i = e.nextElement();
			System.out.println(i);			
		}
	}
	/*Limitations of enumeration
	 * 1. Only for legacy classes
	 * 2. No removal operation can be implemented using enumeration
	 * 3. Only forward direction cursors.
	 */
	
	
	/* 2. ITERATOR - Present in collection interface.
	 * 1. To overcome the limitations of enumeration, we can use Iterator.
	 * 2. Iterator is a universal cursor and can be implemented with any collection class.
	 * 3. Read and remove operation can be performed.
	 */
	public static void iterator() {
		ArrayList<String> al = new ArrayList<>();
		
		/*Iterator object can be created for any collection class. If we don't provide the type for iterator,
		 * then typecasting is required when we retrieve the object from iterator.
		 */
		Iterator<String> itr = al.iterator();
		Iterator<String> itr1 = al.iterator();
		//below method is used to check if the iterator has next element or not. Returns boolean value.
		itr.hasNext();
		
		//Below method is used to return the next element in the iterator
		itr.next();
		
		//Below method removes the element form the underlying collection used
		itr.remove();
		
		while(itr.hasNext()) {
			String i = itr.next();
			String i1 = (String)itr1.next();
		}
	}
	
	/*Limitations of Iterator
	 * 1. Only forward direction cursors.
	 * 2. Replace operation is not present.
	 * 3. Addition of new objects while iterating is not present.
	 * 4. Replacement of an element can not be performed.
	 */
	
	
	
	/* 3. LIST ITERATOR - Present in collection interface. This is the most powerful cursor
	 *  Used for List Ojects only.(ArrayList, LinkedList, vector, stack)
	 * 1. To overcome the limitations of enumeration and iterator, we can use List Iterator.
	 * 2. List Iterator is a universal cursor and can be implemented with any collection class.
	 * 3. Read, remove, replace and add operations can be performed.
	 * 4. This is a bi-directional cursor.
	 * 5. It is a child interface of iterator.
	 */
	public static void listIterator() {
		ArrayList<String> al = new ArrayList<>();
		
		/*ListIterator object can be created for any collection class. If we don't provide the type for iterator,
		 * then typecasting is required when we retrieve the object from Listiterator.
		 */
		ListIterator<String> itr = al.listIterator();
		ListIterator itr1 = al.listIterator();
		//below method is used to check if the iterator has next element or not. Returns boolean value.
		itr.hasNext();
		
		//Below method is used to return the next element in the iterator
		itr.next();
		
		//Below method removes the element form the underlying collection used
		itr.remove();
		
		//Below method returns the index of next element from the current index.
		itr.nextIndex();
		
		//below method is used to check if the iterator has previous element or not. Returns boolean value.
		itr.hasPrevious();
		
		//Below method is used to return the previous element in the iterator
		itr.previous();
		
		//Below method returns the index of the previous element from the current index.
		itr.previousIndex();
		
		//Below method is used to replace the current object in the underlying collection
		itr.set(null);
		
		//Below method is used to add a new element
		itr.add(null);
				
		
		
		while(itr.hasNext()) {
			String i = itr.next();
			String i1 = (String)itr1.next();
		}
	}
	

	
	/*
	 * 	    PROPERTY 	  | 	  ENUMERATION 	      | 		ITERATOR 	   | 		List Iterator
	 *      --------              -----------                   --------                -------------
	 * 1. Applicable for  | Only for Legacy classes   | Any collection class   | Only for List classes
	 * 2. Movement		  | Only forward direction    | Only forward direction | Both forward and backward 
	 * 3. Accessibility   | Only read access		  | Both read and remove   | Read, remove, replace and add
	 * 4. How to get it	  | Using elements() of vector| iterator() method	   | listIterator() method
	 * 5. Legacy or not	  | Yes - 1.0v				  | No - 1.2v			   |No - 1.2v
	 */
	
	/* As Enumeration, Iterator and ListIterator are interfaces, we do not  create an object of these interface(we cannot)
	 * but we create an object of the implementation classes present in the data structure classes that implements these
	 * cursors. Please see the below example.
	 */	
	
	public static void main(String[] args) {
		Vector<String> al = new Vector<>();
		Enumeration<String> e = al.elements();
		Iterator<String> itr = al.iterator();
		ListIterator<String> ltr = al.listIterator();
		//This will print "java.util.Vector$1". This is the implementation of enumeration in vector class, that returns enumeration type object.
		System.out.println(e.getClass().getName());
		//This will print "java.util.Vector$Itr". This is the implementation of iterator in vector class, that returns enumeration type object.
		System.out.println(itr.getClass().getName());
		//This will print "java.util.Vector$ListItr". This is the implementation of List iterator in vector class, that returns enumeration type object.
		System.out.println(ltr.getClass().getName());
	}
}
