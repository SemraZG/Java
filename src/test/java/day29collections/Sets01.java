package day29collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
        Sets are for storing multiple non-primitive data in the same data type.
        Sets are for storing unique data like email addresses, SSN number...
        There are 3 different Sets:
        i)HashSet:
            Uses "Hashing Technique".
            It does not put the elements in any order.
            HashSet accepts just a single "null" as element.
        ii)LinkedHashSet:
            Puts the elements in"Intersion Order".
        iii)TreeSet:
            Puts the elements in "Natural Order"(Ascending Order in numbers, Alphabetical Order in String".
            TreeSet is so slow in adding elements.


            Question: If you need to store "unique elements" in "natural order", which collection do you use?
                      Answer  : TreeSet
            Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
                      Answer  :
                        i)Create a HashSet
                        ii)Add elements into the HashSet
                        iii)Convert HashSet to TreeSet

         */
    public static void main(String[] args) {

        HashSet<String> emails= new HashSet<>();
        System.out.println(emails);

        emails.add("apple");
        emails.add("fig");
        emails.add("orange");
        emails.add("mango");
        emails.add("apple");//When you try to add repeated data, Java does not give any error, and last data will be overwritten to the previous data.

        System.out.println(emails);

        emails.remove("fig");
        System.out.println(emails);

        //emails.clear();//Deletes all elements from the HashSet
        //System.out.println(emails);//[]

        //1.way to use clone() method, this way is so general.
        Object emails2= emails.clone();//When you use clone() method, you can make data type "Object".
        System.out.println(emails2);
        //2.way to use clone() method, this way is better.
        HashSet<String> emails3= (HashSet<String>) emails.clone();
        System.out.println(emails3);


        //LinkedHashSet:

        LinkedHashSet<Integer> ssn= new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);

        System.out.println(ssn);//[123456789, 234567891, 345678912, 456789123]


        //TreeSet:
        //1.way
        Long starting=System.currentTimeMillis();
        TreeSet<Integer> nums= new TreeSet<>();

        nums.add(23);
        nums.add(12);
        nums.add(5);
        nums.add(-9);
        nums.add(0);
        System.out.println(nums);//[-9, 0, 5, 12, 23]

        Long middle =System.currentTimeMillis();

        //2.way
        HashSet<Integer> nums2= new HashSet<>();
        nums2.add(23);
        nums2.add(12);
        nums2.add(5);
        nums2.add(-9);
        nums2.add(0);
        System.out.println(nums2);//[0, 5, 23, -9, 12]

        TreeSet<Integer> perfectNums= new TreeSet<>(nums2);// or Set<Integer> perfectNums= new TreeSet<>(nums2);===> Because of that "Set" parent class, we can use it also.
        System.out.println(perfectNums);//[-9, 0, 5, 12, 23]

        Long ending =System.currentTimeMillis();

        System.out.println("1.way: "+(middle-starting));
        System.out.println("2.way: "+(ending-middle));









    }
}
