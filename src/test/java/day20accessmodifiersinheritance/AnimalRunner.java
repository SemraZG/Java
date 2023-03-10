package day20accessmodifiersinheritance;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat c= new Cat();
        c.eat();
        c.drink();
        c.meow();

        Dog d= new Dog();
        d.eat();
        d.drink();
        d.bark();

        Bird b= new Bird();
        b.eat();
        b.drink();
        b.tweet();

        Animal a= new Animal();
        a.eat();


    /* 1)We use "inheritance";

    i) to prevent "repetition"
    ii)to make "maintenance" easy
    iii) to make our classes "atomic"

    2) To make a class child of another class we use "extends" keyword
    3) Child classes can use class members from the parent classes

    However, parent classes cannot use anything from the child classes

    4) Every class expect "Object Class" in Java has at least one parent class which is "Object Class"

    5) Inheritance Types in java
    i)Multilevel Inheritance
    ii)Hierarchical Inheritance
    iii)Multiple Inheritance(Java does not support it)
    iiii)Opposite of Multiple Inheritance is Single Inheritance, Java supports Single Inheritance
     */










    }
}
