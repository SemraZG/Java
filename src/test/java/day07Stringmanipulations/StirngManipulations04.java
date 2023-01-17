package day07Stringmanipulations;

public class StirngManipulations04 {
    public static void main(String[] args) {

        String a= "Ali is 13 years old, I think he seems 15.";
        String b= a.replaceAll("[0-9A-Z]", "*");
        System.out.println(b);
        String c= a.replaceAll("[^a-z . ,]", "*");
        System.out.println(c);






























    }
}
