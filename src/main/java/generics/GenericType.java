package generics;

import org.w3c.dom.ls.LSOutput;

/*
We need to provide the name of the type in angle brackets.
we can also extend other classes
we can extend multiple classes using '&' operator
 */
public class GenericType<T> {
    T printThis;

    public GenericType(T printThis){
        this.printThis = printThis;
    }

    public void print() {
        System.out.println(this.printThis);
    }
    // We can also create a method with generic type parameters.
    public static <P> void genericMethod(P genericType){
        System.out.println(genericType);
    }

    //We can also take more than 2 generic type parameters in a generic method
    public static <P,C> void genericType2(P genericTypevariable1, C genericTypeVariable2){
        System.out.println(genericTypevariable1);
        System.out.println(genericTypeVariable2);
    }

}
