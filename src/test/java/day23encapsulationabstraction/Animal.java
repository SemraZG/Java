package day23encapsulationabstraction;

/*
    1)  Sometimes no child uses the implementation from the parent class, therefore
        the body of the method in parent class is being unusable.
        If something is unusable we do not want to type it.
        If you do not type the body of a method, you will have "method without body"(Like angels".
        It is called "Abstract Method".

    2) "Concrete Methods"(Methods with body) focus on 2 things; i)What to do, ii)How to do
       "Abstract Method" focuses on just "What to do".

    3) If you make a method "abstract", it will be mandatory to override for all child classes.

    4) "Abstract Method" can be created just in "Abstract Classes".
        To make a class abstract, put "abstract" keyword between "access modifier" and "class" keyword,
        for exp; public abstract class Animal

    5) When you remove "method body" you have to use "abstract" keyword between the "access modifier" and the "return type" of the method.
       for exp; public abstract void eat();

    6) It is impossible to create "object" from an "abstract class" but it does not mean abstract classes do not have constructors.
       They have "constructors" but "constructors" are not used to create object.

    7) Abstract classes can have "concrete methods" as well.

    8) "Concrete method" may or may not be overridden by Child Classes.

    9) Abstract methods cannot be put into a non-abstract class.(Non-abstract=Concrete)

    10) Normally child class must override all abstract methods from the parent class.
    But Mammal class did not override anything from the Animal Class, no complain.

    Because "Overriding abstract methods from parent" is mandatory just for "Concrete Classes"
    "Overriding abstract methods from parent" is NOT mandatory for abstract classes.

    If you want you can override abstract methods from parent Animal to Mammal, it is optional.
 */

public abstract class Animal {

    public abstract void eat();


    public abstract void drink();

    public void move(){
        System.out.println("Animals move...");
    }
}
