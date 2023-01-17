package day09_ForLoops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class selfstudy {
    public static void main(String[] args) {
     /*String x="123456";
     for (int i=x.length()-1; i>=0; i--){
         char y=x.charAt(i);
         if (y%2==0)
         System.out.print(y);
     }

        int a= 10;
        int b=20;
        System.out.println("swaptan once a ve b:" + (a+ ","+ b));
        int temp= a;
        a=b;
        b=temp;

        System.out.println("swaptan sonra a ve b:" + (a +","+b));

        String str= "Tom & Marry";
        String x= "";
        for (int i= str.length()-1; i>=0; i--){
            char ch= str.charAt(i);
            x=x+ch;
        }
        System.out.print(x);


        int sum=0;
        for (int i=3; i<7; i++){
            sum= sum+i;

        }
        System.out.println(sum);

        int mult=1;
        for (int i=6; i>2; i--){
          mult=mult*i;
        }
        System.out.println(mult);


    int sum=0;
    for (int i=584; i>0; i=i/10){
        sum=sum+i%10;
        System.out.println(sum);
    }


        String str = "Andromeda";
        for (int i = 0; i < str.length(); i++){
            char ch=str.charAt(i);
            if (ch!='m'){
                System.out.print(ch);
            }

        }
        for (int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if (ch=='m'){
                continue;
            }
            System.out.print(ch);
        }


        String city= "Luxemburg";
        for (int i=0; i<city.length(); i++){
            char ch= city.charAt(i);
            if (ch=='m'){
                break;
            }
            System.out.println(ch);
        }

        Scanner input=new Scanner(System.in);
        System.out.println("enter a integer");
        String num= input.next();
        int sum=0;
        for (int i=0; i<num.length(); i++){
            String digit=num.substring(i, i+1);
            if (num.indexOf(digit)== num.lastIndexOf(digit)){
                sum= sum+Integer.valueOf(digit);
            }
            System.out.println(sum);
        }



        String pwd= "xy1AmSW?";
       Boolean a= pwd.contains("A");
       boolean b=pwd.startsWith("xy");
       boolean c= pwd.startsWith("W", 6);
       boolean d= pwd.length()==8;
        System.out.println(a&&b&&c&&d);



        String s= "Do practice to be better 100";
        boolean a= s.endsWith(" better");
        System.out.println(a);
        String b=s.concat("!").concat("a");
        String c= s+"!";
        System.out.println(b);
        System.out.println(c);

        String d= s.replace("D", "S").replace("to", "do").replace("better", "good").concat("!");
        System.out.println(d);
        String e= s.replaceAll("[0-9]", "aa");
        System.out.println(e);

        String str= "Tom Hanks";
        String x= "";
        for (int i=str.length()-1; 0<=i; i--){

            x=x+str.charAt(i);

        }
        System.out.println(x);



        String fullName= " Tom Hanks ";
        String newfull= fullName.trim().substring(0,1).toUpperCase();
        System.out.print(newfull);

        String last= fullName.trim().split(" ")[1].toUpperCase().substring(0,1);
        System.out.print(last);


        Scanner input = new Scanner(System.in);
        int counter = 0;
        do {
            if (counter == 3) {
                System.out.println("blocked");
                break;
            }

            System.out.println("enter username");
            String userName = input.next();
            System.out.println("enter password");
            String password = input.next();
            counter++;
            if (userName.equals("admin") && password.equals("123")) {
                System.out.println("you re ın account");
                break;

            }
        }while (true) ;


        String str= " naLAn ";
        String x=str.trim().toLowerCase();
        x=x.substring(0,1).toUpperCase()+x.substring(1);
        System.out.println(x);

        String x= "Ali Can";
        String y= "Mehmet Canlı";
        String z= "Semra zengin";
        int a= x.replaceAll(" ", "").length();
        int b= y.replaceAll(" ", "").length();
        int c=z.replaceAll(" ", "").length();
        System.out.println(a+b+c);


        String s=" Miami 33018!!! ";
        int y= s.replace(" ","").replaceAll("[^a-zA-Z0-9]", "").length();
        System.out.println(y);


        String s= "miami ";
        s=s.trim().substring(4);
        System.out.println(s);


        String s= " Java";
        s= s.substring(1);
        System.out.println(s);


        String s= " javasdafsthejruktk ";
        s= s.trim();
        int y= s.length();
        System.out.println(y);
        s=s.substring(0,18).toUpperCase();
        System.out.println(s);



        String s= "Java23456";
        int x= s.length()-1;
        System.out.println(x);
        s=s.substring(1,8);
        System.out.println(s);


        String s= " Tom Hanks  ";
        int x=s.trim().replaceAll("\\s", "").length();
        if (x==s.trim().length()-1) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }



        String s= "Tom Hanks";
        String x= s.substring(0,1);
        String y= s.split(" ")[1].substring(0,1);
        System.out.println(x+y);



        String s= "wow! Ali is 13 years old, but he is a university student.";
        String x= s.replaceAll("[^a-zA-Z0-9\\s]", "");
        int y= s.length()-x.length();
        System.out.println(y);


        Scanner input= new Scanner(System.in);
        System.out.println("enter password");
        String pwd= input.next();

        if (pwd.contains(" ")){
            System.out.println("dont use space");
        } else if(pwd.replaceAll("\\s", "").length()>7){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }

       List<Integer> s= new ArrayList<>();
       s.add(0);
       s.add(1);
       s.add(1,10);
        System.out.println(s);
        List<Integer> k= new ArrayList<>();
        k.add(0);
        k.add(33);
        s.addAll(0,k);
        System.out.println(s);
        s.addAll(k);
        System.out.println(s);

        int a= s.size();
        System.out.println(a);

        boolean y=s.isEmpty();
        System.out.println(y);

        List<Integer> s= new ArrayList<>();
        s.add(12);
        s.add(0);
        s.add(1);
        s.remove(0);
        System.out.println(s);
        List<Integer> k= new ArrayList<>();
        k.add(1);
        k.add(0);
        s.removeAll(k);
        System.out.println(s);

        List<String > s= new ArrayList<>();
        s.add("shoes");
        s.add("book");
        s.add("shoes");
        s.add("laptop");
        s.add(" ");

        s.contains(" ");
        System.out.println(s);

        s.remove(String.valueOf(" "));

        System.out.println(s);

        s.set(1,"pencil");
        System.out.println(s);

        List<Integer> s= new ArrayList<>();
        s.add(5000);
        s.add(6200);
        s.add(5840);

        System.out.println(s);

        for (int i=0; i<s.size(); i++){
            s.set(i, s.get(i)*10);

        }
        System.out.println(s);


        List<String> s= new ArrayList<>();
        s.add("semra");
        s.add("rabia");
        s.add("betül");

        for (int i=0; i<s.size(); i++){
            s.set(i, s.get(i)+" gökalp");
        }
        System.out.println(s);
        List<String> k= new ArrayList<>();
        k.add("semra");

        if (s.equals(k)){
            System.out.println("same");
        }else{
            System.out.println("not");
        }

        boolean n= s.contains("semra");
        System.out.println(n);*/


        List<Integer> s= new ArrayList<>();
        s.add(12);
        s.add(10);
        s.add(20);
        s.add(65);

        List<Integer> m= new ArrayList<>();
        m.add(20);
        m.add(10);
        m.add(11);

        boolean n=s.containsAll(m);
        System.out.println(n);










































    }
}














