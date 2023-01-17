package day27exceptionscollections;
import java.util.LinkedList;
public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String> visitors= new LinkedList();
        visitors.add("Tom");
        visitors.add("java");
        visitors.add("semra");
        visitors.add("ali");
        visitors.add("ayse");

        System.out.println(visitors);

        visitors.addLast("mahmut");
        visitors.addFirst("selma");

        LinkedList<String> kids= new LinkedList();
        visitors.add("abc");
        visitors.add("xzw");

        visitors.addAll(kids);

        System.out.println(visitors);

        visitors.add(2, "miami");
        System.out.println(visitors);
    }

}

//if the number of characters more than 4, remove them from the link list
