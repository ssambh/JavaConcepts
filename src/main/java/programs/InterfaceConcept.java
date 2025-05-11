package programs;

public interface InterfaceConcept {
	// All the methods in an interface are public and abstract by default
	void m1();
	
	void m2();
}

 class ServiceProvider implements InterfaceConcept{

	 /*
	  *1. Compulsarily, whenever we implement an interface methods, they should be declared as public,
	  *otherwise compile time error will be thrown
	  *
	  *2. We have to provide implementation for each and every method in the interface if the 
	  *calling class in not "Abstract" class.
	  */
	@Override
	public void m1() {
	}

	@Override
	public void m2() {		
	}
}
 // The below class does not implement all the methods of the interface as this is an abstract class
 abstract class ServiceProvider2 implements InterfaceConcept{
	 
		@Override
		public void m1() {
		}
 }
 
 /*
  *  As the below class is calling the above abstract class, it has to implement the unimplemented
  *  methods from the interface thatthe parent class is implementing
  */
 
 class SubServiceProvider extends ServiceProvider2{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	 
 }
