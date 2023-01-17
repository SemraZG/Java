package practice;

import java.util.Scanner;

public class day15qa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = 0;
        do {
            if (counter == 3) {
                System.out.println("account is blocked");
                break;
            }

            System.out.println("enter your user name");
            String userName = input.next();

            System.out.println("enter your password");
            String password = input.next();

            counter++;
            if (userName.equals("admin") && password.equals("pwd123")){
                System.out.println("in account");
                break;
            }

        }while (true);
    }
}