package day23_Practice;

public class Q01_SumOfFirstIntNums {
     /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */
     public static void main(String[] args) {


         myMethod(7,4,6,-7,100);
         myMethod(0,5,4,8);
         myMethod(-1,5,7,89);

         myMethod(3.4,2,3,6);

         myMethod(2.3,5.1,4.5,6.3);
     }

    public static void myMethod(int a, int...numbers){
       int sum=0;
       for (int w:numbers){
           sum+=w;//==sum=sum+w
       }
    System.out.println(a*sum);
}


    public static void myMethod(double a, int...numbers){
         double sum=0;
         for (int w:numbers){
             sum+=w;
         }
        System.out.println(a*sum);
}

    public static void myMethod(double a, double...numbers){
        double sum=0;
        for (double w:numbers){
            sum+=w;
        }
        System.out.println(a*sum);

}







}


