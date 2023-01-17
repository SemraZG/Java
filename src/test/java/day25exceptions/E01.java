package day25exceptions;

public class E01 {

    /*
        1)Exception means un-expected issues in code execution
        2)There are two ways to work with Exceptions
            i)Using try-catch block: Handling Exception
            ii)Throw Exception and block the application
        3)If you do not handle the Exception, Java stops execution and the application is blocked.

    */
    public static void main(String[] args) {

       divide(6,0);//A number cannot be divided by zero

       divide2(6,0);//A problem occured in division


    }
    //1.way: We do not recommend that way.
    public static void divide(int a, int b){

        if (b==0){
            System.out.println("A number cannot be divided by zero");
        }else{
            System.out.println(a/b);
        }

    }

    //2. way: Handle Exception by using try-catch block.

    public static void divide2(int a, int b){
        try {
            System.out.println(a/b);
            System.out.println("Hi");
            System.out.println("by");
        }catch (ArithmeticException e){
            System.out.println("A problem occured in division");
        }
    }


}
