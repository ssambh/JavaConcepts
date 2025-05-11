package collectionsFrameworkConcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConcepts {

	/* 1. Set is a child interface of Collection interface
	 * 2. Duplicates are not allowed.
	 * 4. Set doesn't have any new methods and implements methods provided by collection interface.
	 */
	
	//Below discussed are the implementation classes of Set interface.
	
	
	/*1. HASHSET
	 * a) Duplicates are not allowed. add() method returns false and the duplicate object won't be added to the set.
	 * b) All objects will be inserted based on hashcode and insertion order won't be preserved.
	 * c) Heterogenous objects are allowed.
	 * d) Null insetion is possible.
	 * e) Implements serializable and cloneable interface.
	 * f) Best choice for search operation.
	 * g) Underlying data structure is hashtable.
	 * h) Implements serializable and cloneable interface.
	 */
	
	//Below are the 4 constructors that are common for HashSet, LinkedHashSet, HashMap, IdentityHashMap, WeakHashMap and HashTable
	/*Default initial capacity is 16 with fill load 0.75
	 *(This means after filling 75% of the hasset, a new hashset is automatically created.
	 */
	HashSet h = new HashSet();
	
	//If we want to provide our specified initial capacity with fill load 0.75.
	int initialCapacity = 20;
	HashSet h1 = new HashSet(initialCapacity);
	
	//If we want to provide our specified initial capacity  and with specified fill load
	int initialcap = 20;
	float loadCap = (float) 0.90;
	HashSet h2 = new HashSet(initialcap, loadCap);
	
	//To create an equavalent hashset of the given collection objectin the parameter.
	ArrayList<String> list = new ArrayList<>();
	HashSet h4 = new HashSet(list);
	
	
	
	/*2. LINKED HASHSET
	 * a) This is a child class of hashset.
	 * b) Duplicates are not allowed but insertion order is maintained.
	 * c) Underlying data structure is hashtable + linked list
	 */
	LinkedHashSet lkh = new LinkedHashSet();
	
	
	
	
	/*3. SORTED SET
	 * a) This is a child interface that implements Set interface.
	 * b) Duplicates are not allowed but sorting order is maintained.
	 * c) Default natural sorting order for integers in ascending and for strings in alphabetical.
	 */
	
	//Sorted set specific 6 methods are as below.
	
	
	/*4. TREESET
	 * As Sorted set is an interface and treeSet is a class that implements sorted set, we will
	 * use tree set to define the methods of sortedset.
	 * a) Underlying data structure is balanced tree.
	 * b) Duplicates are not allowed.
	 * c) Insertion order is not preserved.
	 * d) All elements will be inserted according to some sorting order.
	 * e) Heterogenous objects are not allowed.
	 * f) Null insertion is possible only once in an empty treeset.
	 */
	
	/* we can only add Homogenous and comparable objects in Treeset.
	 * i.e. If we are adding an object in a treeset whose implementation class does not implement comparable
	 * Interface, then we will get ClassCastException.
	 */
	
	//There are 4 constructors in treeSet.
	
	//This creates an empty treeset object. Default natural sorting order is applied.
	TreeSet ss = new TreeSet();
	
	// This creates an empty treeset with a customized sorting order.
	Comparator com;
	TreeSet ss1 = new TreeSet(com);
	
	//create an equivalent treset object from any collection object.
	ArrayList<String> l = new ArrayList<>();
	TreeSet ss2 = new TreeSet(l);
	
	// Creates an equivalent treeset object from any sortedset object.
	TreeSet ss3 = new TreeSet(ss);
	
	StringBuilder sb = new StringBuilder();
	
	public void sortedSet() {
		ss.add(100);
		ss.add(200);
		ss.add(300);
		ss.add(400);
		ss.add(500);
		ss.add(900);
		// returns the first element in the set
		ss.first();
		
		// Returns the last element in the set
		ss.last();
		
		// Returns the elements before the given input [100, 200, 300]
		ss.headSet(400);
		
		// Returns the elements after the given input [500, 900]
		ss.tailSet(400);
		
		// Returns the elements within the given range(inclusive the first argument)[200, 300, 400, 500]
		ss.subSet(200, 900);
	}
	
}
