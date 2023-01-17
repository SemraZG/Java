package day18_PassByValueDateTime;

public class Increment_Decrement {
    public static void main(String[] args) {

   int a=12;
   int b=a++;
        System.out.println(b);//12
        System.out.println(a);//13

        int x= 15;
        int y=x--;
        System.out.println(y);//15
        System.out.println(x);//14

        int z= x--;
        System.out.println(z);//14
        System.out.println(x);//13

        int m = 21;
        int n= ++m;
        System.out.println(n);//22
        System.out.println(m);//22

        int t= 32;
        int u=--t;
        System.out.println(u);//31
        System.out.println(t);//31


















    }
}
