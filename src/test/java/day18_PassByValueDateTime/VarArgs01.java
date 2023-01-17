package day18_PassByValueDateTime;

public class VarArgs01 {
    public static void main(String[] args) {

        //if you want to make the parameters limit flexible in a method, use "VarArgs".
        //To create VarArgs "data type + ... + space + a name for the VarArgs.
        //VarArgs use Arrays behind. When you work with VarArgs, you can think you are working with Arrays.
        //VarArgs can accept zero or more elements.


        System.out.println(add(3,5));
        System.out.println(add(56,95,45));




    }

    public static int add(int... a){

        int sum= 0;

        for (int w: a){
            sum= sum+w;
        }
        return sum;


    }

    /*
Int q1 ==> Can I use another regular parameter after varargs? ==> "No. Because "varargs" cannot be typed more than once     inside method parenthesis also if typed; second parameter will make java reach out the limit of varargs and it will give error.
 Varargs must be last parameter everytime.

Int q2 ==> Can I use another regular parameter before VarArgs? ==> "Yes, you can use many regular parameters
before VarArgs.

Int q3 ==> Can I use multiple "varargs" parameters in a method? ==> "No.Because once we type varargs as first
parameter then we cannot add any other parameters after varargs...
*/









}










