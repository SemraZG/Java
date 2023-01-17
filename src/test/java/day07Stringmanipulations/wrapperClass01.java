package day07Stringmanipulations;

public class wrapperClass01 {
    public static void main(String[] args) {


         /*
         wrapper class
         non- primitive have "methods", this is useful and good.
         we can do many actions by using "methods", this is good.
         but primitives do not have any "methods because of that we can not do any actions with primitives
         java created a new structure which has "primitive value and "methods" together.
          */
           /* int a=16;
            Integer b=17;
            char c='c';
            Character d='d';

            //autoboxing: to convert "primitive data" to "wrapper class"
            byte as=12; //close to add any actions/methods because byte primitive data
            Byte ac=as; // open to addition the methods
            //unboxing: to convert "wrapper class to its "primitive data"
            Short ws=34;
            short s=ws;*/

            //how get minimum and maximum values of numeric data types in java
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


    }
}
