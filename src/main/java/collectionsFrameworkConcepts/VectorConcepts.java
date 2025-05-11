package collectionsFrameworkConcepts;

import java.util.ArrayList;
import java.util.Vector;

public class VectorConcepts {

	/*
	 * 1. Underlying data structure is resizeable array or growable arrays. 
	 * 2. It can have duplicates 
	 * 3. Insertion order is maintained in Arraylist 
	 * 4. Heterogeneous objects are allowed. 
	 * 5. Null insertion is possible 
	 * 6. Serializable and clonable interfaces are implemented just like all other collection classes. 
	 * 7. Implements Random access interface. 
	 * 8. Most of the methods in vector are synchronized, so Vector is always thread safe. 
	 * 9. Best for retreival operation.
	 */

	public static void vector() {
		// This is one of the constructors that creates an empty vector with initial capacity as 10
		Vector<Integer> list = new Vector<>();

		// In the below constructor you can define the size.
		Vector<Integer> list1 = new Vector<>(30);

		// In the below constructor we are creating a new vector equivalent to another collections object
		Vector<Integer> list2 = new Vector<>(list);
		
		// In the below constructor, we can create a vector providing an initial capacity and incremental capacity.
		Vector<Integer> list3 = new Vector<>(30, 10);
	}
}
