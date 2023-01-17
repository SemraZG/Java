package day16Lists;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        //how to crete a List(ArrayList)
        //1.way
        ArrayList<Integer> myList= new ArrayList<Integer>();
        //2.way
        ArrayList<Integer> myList2= new ArrayList<>();
        //3.way
        List<Integer> myList3= new ArrayList<>();

        //how to print a list on the concole;, add()method puts the elements in insertion order;

        System.out.println(myList3);

        //how to add a element a list;
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);
        System.out.println(myList3);

        //how to add an element into a specific index;
        myList3.add(1,50);
        System.out.println(myList3);

        myList3.add(3,99);
        System.out.println(myList3);

        //how to join two lists;
        List<String> a= new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b= new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);
        System.out.println(b);
        a.addAll(1,b);
        System.out.println(a);
        b.addAll(a);
        System.out.println(b);

        //how to get the number of element in a list;==> size() method
        int sizeofa =a.size();
        System.out.println(sizeofa);

        //Note: When we talk about the number of the elements in a Array use "lenght of the Array",
        // for the lists use "size of the list"


        //Example 1:

        List<Character> c= new ArrayList<>();
        c.add('x');
        c.add('y');
        //1.way
        int sizeOfc = c.size();
        if (sizeOfc==0){
            System.out.println("the list is empty");
        }else{
            System.out.println("the list is not empty");
        }

        //2.way==> .isEmpty() method returns "true" if the list has no any element,
        //.isEmpty() method returns "false" if the list has at least one element,

        boolean isEmpty = c.isEmpty();

        if (isEmpty){
            System.out.println("the list is empty");
        }else{
            System.out.println("the list is not empty");
        }

        //Note: if Java has a method for a specific functionality using the method is preferable.


          List<String> d= new ArrayList<>();
        d.add(" ");
        d.add("a");
        System.out.println(d);

        List<String> e= new ArrayList<>();
        e.add(" ");
        d.removeAll(e);
        System.out.println(d);
        if (d.isEmpty()){
            System.out.println("the list is empty or has just space character");
        }else{
            System.out.println("the lis has character/s different from space");
        }

















    }
}
