package practice;

import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {

        /*Tom Hanks==> sknaH moT

        String str= "Tom Hanks";
        String x= "";
        for (int i=str.length()-1; i>=0; i--){
            x= x +str.charAt(i);

        }
        System.out.println(x);*/

       String fullname= " Tom Hanks ";

       String x= fullname.trim().substring(0, 1).toUpperCase();
        System.out.println(x);

    String y= fullname.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println(x+y);
















    }
}
