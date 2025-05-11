package collectionsFrameworkConcepts;

import java.util.Stack;

public class StackConcepts {

	/* 1. Stack is a child of vector.
	 * 2. Specially designed for LIFO structure.
	 * 3. Insertion order is maintained in Arraylist 
	 * 4. Heterogeneous objects are allowed. 
	 * 5. Null insertion is possible 
	 */
	
	public static void stack() {
		//The only constructor is as below
		Stack<Object> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push('a');
		stack.push("Sarang");

		//Below method searches for an object in the stack and returns the distance from top
		stack.search(2);
		//Below method removes the topmost element of the stack
		stack.pop();
		//Below method returns the topmost element of the stack
		stack.peek();
	}
}
