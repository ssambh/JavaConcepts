package collectionsFrameworkConcepts;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterface {

	/*Comparator is used for customized sorting order.
	 * It contains 2 methods - compare(obj1, obj2) and equal()
	 * 
	 * compare() method works exactly like compareTo() method of comparable interface.
	 * 
	 * equals() method ( return type boolean)  is not required to be implemented in the child class/intetrface that implements
	 * comparator interface because a new class is already a child of "Object" and Object
	 * already implements equals() method.
	 */
	
	public static void main(String[] args) {
		/*Naturally treeset will use compareTo() method of comparable interface for sorting while 
		 * element insertion.
		 */
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(12);	//-----> 12.compareTo(10)
		set.add(2);
		set.add(4);
		
		System.out.println(set);
		
		/*If we provide the comparator object to the treeset constructor, then compare(obj1, obj2)
		 * method is used and customized sorting order is used while element insertion.
		 */
		Comparator c = null;
		TreeSet<Integer> set2 = new TreeSet<>(c);
		
		set2.add(10);
		set2.add(12);	//-----> compare(12,10)
		set2.add(2);
		set2.add(4);
	}
}
