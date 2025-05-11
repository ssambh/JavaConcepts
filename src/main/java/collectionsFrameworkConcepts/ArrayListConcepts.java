package collectionsFrameworkConcepts;

import java.util.ArrayList;

public class ArrayListConcepts {

	/* 1. underlying data structure is a resizeable array or growable array
	 * 2. It can have duplicates
	 * 3. Insertion order is maintained in Arraylist
	 * 4. Heterogeneous objects are allowed.
	 * 5. Null insertion is possible
	 */
	
	/* 1. Default initial capacity will be 10
	 * 2. If we add a new element in an arraylist, then a new arraylist is form and all the elements
	 * are copied from the initial arraylist plus the new elements.
	 * 3. The capacity of the new arraylist will be (currCap * 3/2) + 1
	 */
	
	/* 1. ArrayList and vector implements RandomAccess interface
	 * meaning, they can retrieve data very quickly and in constant time
	 * 2. RandomAccess is a marker interface and does not contain any methods.
	 * 3. ArrayList is the best choice if frequent operation is retrieval because of random access.
	 * 4. ArraList is the worst choice for insertion or removal operation because several shift operations are required.
	 */
	

	
	public static void arrayList() {
		// This is one of the constructors that creates an arraylist with initial capacity as 10
		ArrayList<Integer> list = new ArrayList<>();
		
		// In the below constructor you can define the size.
		ArrayList<Integer> list1 = new ArrayList<>(30);
		
		// In the below constructor we are creating a new arraylist equivalent to another collections object
		ArrayList<Integer> list2 = new ArrayList<>(list);
	}
	
}
