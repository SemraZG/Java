package day19Stringbuilder;

public class StringBuilder01 {
    public static void main(String[] args) {

    //What is "StringBuilder Class"?
        //"StringBuilder Class" is for creating "Mutable Strings"

        //We use "Sring Class" to create a String, why or when we will need "StringBuilder Class"?
        //String Class is "immutable", "StringBuilder Class" is mutable.

        //String Class is "immutable" because of that it does not change existing value.
        //İf you want to assign a new value to a variable, Java will create a new container inside the "String Pool"
        //then will put in it, then changes the address pointer to the new container.
        //If any container does not have any address container, "Garbage Collector" removes the container
        //from the memory. Before removing things from memory, Java "finalize" them,
        //without finalizing Java does not remove anything from memory.

        String name= "Tom";

        name= "Mark";

        String s= "John";
        String r= "John";

        //I want a seperate container whose value is Jhon.

        String u= new String("John");

        //If you want to change the value directly, without creating new container in memory you can use "StringBuilder Class".

        StringBuilder sb= new StringBuilder("Clara");
        sb= new StringBuilder("Jim");

        //How to create a StringBuilder Object
        //1.way
        StringBuilder sb1= new StringBuilder("Clara");
        System.out.println(sb1);//Clara

        //2.way
        StringBuilder sb2= new StringBuilder();
        sb2.append("Clara");
        System.out.println(sb2);//Clara

        sb2.append("Ocean");
        System.out.println(sb2);//ClaraOcean

        sb2.append("miami").append("FL").append("USA");
        System.out.println(sb2);//ClaraOceanmiamiFLUSA

        //How to learn the capacity in a StringBuilder

        StringBuilder sb3= new StringBuilder();

        int numOfChars= sb3.length();
        System.out.println(numOfChars);//0

        int cap= sb3.capacity();
        System.out.println(cap);//16

        sb3.append("Jackson");
        int numOfChars2= sb3.length();
        System.out.println(numOfChars2);//7
        System.out.println(cap);//16

        sb3.append("Mexico");
        sb3.append("The USA");
        int numOfChars3= sb3.length();
        int cap2= sb3.capacity();
        System.out.println(cap2);//34
        System.out.println(numOfChars3);//20

        //Note: If you exceed the existing capacity, Java will increase the capacity
        //like 2*Existing Capacity + 2, normally there is 16 capacity.



















    }
}
