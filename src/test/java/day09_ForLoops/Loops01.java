package day09_ForLoops;

public class Loops01 {
    public static void main(String[] args) {

    /*String name= "Mark";
    String reversedName= "";
    for (int i= name.length()-1; i>=0; i--){
    char ch=name.charAt(i);
    reversedName= reversedName + ch;

    }
        System.out.print(reversedName);
    String a= "Johnson";
    String reversed="";
    for (int i= a.length()-1; i>=0; i-- ){
        char b= a.charAt(i);
        reversed=reversed+b;


    }
        System.out.print(reversed);


        int sum = 0;
        for (int i=3; i<7; i++){
            sum=sum+i;
            System.out.println(sum);
        }

        int a=1 ;
                for(int i=3; i<7; i++){
                    a=a*i;
                }
        System.out.println(a);*/

        int num= -584;
        num=Math.abs(num);
        for (int i=num; i>0; i=i/10){
            num=num+i%10;

        }
        System.out.println(num);
















    }
}
