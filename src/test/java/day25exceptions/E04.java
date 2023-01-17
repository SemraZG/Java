package day25exceptions;

public class E04 {
    public static void main(String[] args) {

        int r1=convertStringToInt("123");
        System.out.println(r1 + 1);//124

    }

    //Create a method to convert a String to an integer

    public static int convertStringToInt(String str){
        return Integer.valueOf(str);
    }
}
