package generics;

import java.security.GeneralSecurityException;

public class Main {
    public static void main(String[] args) {
        //We can provide the type of the object like collections.
        GenericType<Integer> obj = new GenericType<>(23);
        GenericType<String> obj2 = new GenericType<>("Sarang");
        GenericType<Double> obj3 = new GenericType<>(1.5);
        obj.print();
        obj2.print();
        obj3.print();

        //calling genericType method.
        obj.genericMethod(55);
        obj2.genericMethod("Sambharia");

        //calling genericType method with 2 generic type parameters
        GenericType.genericType2("Sarang",50);
    }
}
