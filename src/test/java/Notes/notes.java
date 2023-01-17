package Notes;

public class notes {
    public static void main(String[] args) {
        /*1)"static" class members (variables and methods) are common for all objects created from the class
        2)When you do any update on "static" class members, all objects will see the updates on it
        3)If you want every object informed about every update on a class member make it static.

        To make a variable "static" , put   "static" keyword between "access modifier" and "data type"
        public static int stasticCounter=0;
        public int nonstasticCounter=0;




        1) If you do not assign any value for "static" and "non-static" variables, Java assigns "default values" to them
        but Java does not assign default value for "local variables"
        2) Default values are "0" for numeric data types, it is "null" for String, it is false for boolean.

        1)Java Class Loader makes the classes ready to use
        2)When the classes make ready, class members are loaded according to some order.
        main method is the first to be loaded normally
        3)Sometimes we need something to be loaded before main method, for this scenario we use "static block".
         The codes inside the "static block" is executed before everything in the class, even before main method.
        4)Rule: "static" structures can work just with static class members
         5) "Static block" can be used just with static variables because of the rule in 4th step
        6) "Static block" is used to initialize(assigning first value) "static variables"

      Note: When we create a variable inside the  main method, we do not use "static" keyword, because Java knows
            everything inside the main is "static".

         //Note: If you use Integer List element directly inside the remove() method lik remove(4), Java will accept it as index,
        // Because indexes are primitive integers, when you put 4, it will be accepted as primitive and it will be index.
        //  Lists use non-primitives as list elements, therefore you have to convert primitive int to Integer.
        // To do that, use valueOf() method from Integer wrapper class*/



        /* 1) When you use a variable inside a method, Java creates the copy of the variable and uses it inside the method.
      Java does that to protect the original value of the variables.
      If in every method usage, the value changes, it creates very big problems.

   2) Some programming languages do not use "Pass by value" they use "Pass by reference".
      If you use "Pass by reference" original value will change in every method usage.

   3) If you insist on changing the original value in Java you can do it as well.
      Assign the updated value to the original variable then original value will be updated*/

       /* ..........................................*/

        /*
Int q1 ==> Can I use another regular parameter after varargs? ==> "No. Because "varargs" cannot be typed more than once                             inside method parenthesis also if typed; second parameter will make java reach out the limit of varargs and it will give error.
 Varargs must be last parameter everytime.

Int q2 ==> Can I use another regular parameter before VarArgs? ==> "Yes, you can use many regular parameters
before VarArgs.

Int q3 ==> Can I use multiple "varargs" parameters in a method? ==> "No.Because once we type varargs as first
parameter then we cannot add any other parameters after varargs...
*/
    }

}
