package day21inheritance;

public class CarRunner {
    public static void main(String[] args) {



    Civic d= new Civic(2021);

    //super() can be used with parameters like super(true), super(Hybrid), super(2021)
   // When a class has multiple constructors to select the constructor we need, we use super() with parameters.


        /*
        1) When you try to access a "variable" by using an object in inheritance, start to look for the "variable" in the class used in the "data type of the object"
        2) When you try to access a "method" by using an object in inheritance, start to look for the "object" in the class whose "constructor" was used
        3) In the first line of every constructor there is invisible "super()" to call default constructor from the parent class, if you want you type it explicitly.
        4) Data Type of an object can be selected from the class itself or from the parents of the class.

        Object dog= new Dog(); OR Animal dog= new Dog(); OR Mammal dag= new Dog(); Dog dog= new Dog();

        5) Private class members cannot be inherited.
           Default class members can be inherited if the child class in the same package with the parent class.
           Protected and public class members do not have restriction in inheritance.


       i)   this() is used to call constructor from the same class.
       ii)  this() must be in the first line in a constructor body.
       iii) this() is used to call constructor from the same class, super() is used to call constructor from parent class.


         */




    }
}
