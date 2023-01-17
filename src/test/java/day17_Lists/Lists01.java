package day17_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {

       /* List<Integer> s= new ArrayList<>();

        s.add(2);
        s.add(3);
        s.add(2);
        s.add(2);
        s.add(5);

        List<Integer> a= new ArrayList<>();
        for (Integer w: s){
            if (!a.contains(w)){
                a.add(w);
            }
        } System.out.println(a);


        Scanner input= new Scanner(System.in);
        System.out.println("enter a letter");
        String str= input.next();
        //if (!str.equals([a-zA-Z])){
           // System.out.println("pls write a letter");
        //}

        List<String> y= new ArrayList<>();
        y.add("A");
        y.add("K");
        y.add("R");
        y.add("S");

        int g=y.indexOf("K");
        System.out.println(g);
        int h= y.indexOf("H");
        System.out.println(h);

        if (y.contains(str)){
            y.set(y.indexOf(str), "got it");

        }else{
            y.add(str);
        }
        System.out.println(y);*/


        //How can you understand the existence of a specific element in a List?
        //  i) Use indexOf() method, if the result is "-1" that means element does not exist, if the result is not "-1" it means the element exists
        //  ii) Use contains().
        //  indexOf methods returns the first occurrence of the element.

        List<String> y= new ArrayList<>();
        y.add("A");
        y.add("K");
        y.add("R");
        y.add("S");
        y.add("K");

        int a= y.lastIndexOf("K");
        System.out.println(a);//==>4  //lastIndexOf() method returns the last occurrence of the element.




















    }
}
