package day07Stringmanipulations;

import java.util.Scanner;

public class Stringmanipulaions03 {
    public static void main(String[] args) {
   /* String str= "Ali is 13 years old, I like Ali, Ali does not like me!...";

    int numOfAllChars = str.length();

    int a= str.replaceAll("\\p{Punct}", "").length();
        System.out.println(numOfAllChars-a);*/

        Scanner input = new Scanner(System.in);
        System.out.println("enter your first and last name");
        String fullName=input.nextLine();
        System.out.println(fullName);

        String fixedFullName= fullName.trim();
        System.out.println(fixedFullName);
















    }
}
