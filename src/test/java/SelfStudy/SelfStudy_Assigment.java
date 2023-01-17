    package SelfStudy;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;
    import java.util.Scanner;

    public class SelfStudy_Assigment {
        public static void main(String[] args) {

            Scanner input= new Scanner(System.in);
            List<Integer> intList = new ArrayList<>();

            String x;
            String y;
            String z;

            do {
                System.out.println("Enter an integer");
                int a= input.nextInt();
                intList.add(a);
                System.out.println("Do you want to add a new integer yes/no");
                x=input.next();

            } while(x.equalsIgnoreCase("yes"));

            System.out.println(intList);

            do {
                System.out.println("Enter the integer to remove ");

                int b= input.nextInt();
                intList.remove(intList.indexOf(b));
                System.out.println("do you wanna remove another int yes/no");
                y=input.next();

            }while (y.equalsIgnoreCase("yes"));

            System.out.println(intList);

            do {
                System.out.println("Enter the integer to update");
                int c= input.nextInt();

                System.out.println("Enter the new integer");
                int d= input.nextInt();
                intList.set(intList.indexOf(c), d);
                System.out.println("Do you wanna update another integer yes/no");
                z=input.next();

            }while (z.equalsIgnoreCase("yes"));

            System.out.println(intList);

    }
}













































