package collectionsFrameworkConcepts;

public class ComparableInterface {

	/*Comparable is meant for default natural sorting order.
	 * comparable interfacce only has one methods in it i.e. compareTo(Object)
	 * that returns an int value after the comparison.
	 * 
	 * ex:
	 * obj1.conpareTo(obj2)
	 * 
	 * returns -ve if obj1 comes before obj2
	 * returns +ve value if obj1 comes after obj2
	 * returns 0 if both are equal.
	 */
	
	public static void main(String args[]) {
		//Below code returns -ve value.
		System.out.println("A".compareTo("Z"));
		
		// Below code returns +ve value
		System.out.println("Z".compareTo("A"));
		
		//Below code returns 0
		System.out.println("A".compareTo("A"));
		
		//Below code returns nulll
		System.out.println("A".compareTo(null));
		
	}
}
