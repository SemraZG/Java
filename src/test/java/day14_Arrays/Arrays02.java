package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {

    String date= "09/20/2022";
    String dateArray[]= date.split("/");
        System.out.println(Arrays.toString(dateArray));
        System.out.println("month:" + dateArray[0] + "day:" + dateArray[1]);

        Scanner input= new Scanner(System.in);
        System.out.println("enter a sentence...");
        String str= input.nextLine();
        String arr[]=str.split(" ");
        System.out.println("total number: "+ arr.length);













    }
}
