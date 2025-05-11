package collectionsFrameworkConcepts;

import java.util.LinkedList;

public class LinkedListConcepts {

	/* 1. Underlying data structure is doubly linked list.
	 * 2. Insertion order is preserved.
	 * 3. Duplicates are allowed.
	 * 4. Heterogeneous elements are allowed.
	 * 5. null insertion is possible.
	 */
	
	/* 1. LinkedList implements serializable and cloneable interface but not RandomAccess interface.
	 * 2. LinkedList is the best choice if frequent operation is insertion or removal in the middle.
	 * 3. LinkedList is the worst choice for retrieval operation.
	 */
	public static void linkedList() {

		//This is one of the constructors which creates empty LinkedList Object.
		LinkedList<Integer> list = new LinkedList<>();
		
		/*
		 * This is another constructor which can take another collections object
		 * and create equivalent LinkedList object.
		 */
		LinkedList<Integer> list1 = new LinkedList<>(list);
		
		/* The below methods are specific to LinkedLlist class as it can be used
		 * for stack and queue implementation
		 */
		list.addFirst(0);
		list.addLast(0);
		list.getFirst();
		list.getLast();
		list.removeFirst();
		list.removeLast();
	}
}
