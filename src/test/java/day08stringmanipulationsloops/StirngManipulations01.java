package day08stringmanipulationsloops;

public class StirngManipulations01 {
    public static void main(String[] args) {

       /*  String str= "Java is easy. Java is OOP.";

        String a= str.replaceFirst("Java", "Apex");
        System.out.println(a);
        String b= str.replace("Java", "Apex");
        System.out.println(b);

       String shirtPrice = ‘$12.99’;
        String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices.

        String shirtP= "$12.99";
        String bookP= "$35.99";
        String shirt = shirtP.replace("$", "");
        String book= bookP.replace("$", "");
        System.out.println(shirt);
        System.out.println(book);
        Double c = Double.valueOf(shirt);
        Double d= Double.valueOf(book);
        System.out.println(c+d);*/



        String shirtPrice= "$12.99";
        String bookprice=  "$35.99";
        String shirt=shirtPrice.replace("$", "");
        System.out.println(shirt);
        String book= bookprice.replace("$", "");
        System.out.println(book);
        Double shirtınDouble= Double.valueOf(shirt);
        Double bookınDouble= Double.valueOf(book);

        System.out.println(shirtınDouble+bookınDouble);































    }
}
