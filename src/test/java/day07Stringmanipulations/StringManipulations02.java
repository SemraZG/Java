package day07Stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {


     /* String str= "Java is OOP";

      String a = str.replace('O', '*');
        System.out.println(a);
        String  b= str.replace("Java", "*");
        System.out.println(b);

        String st= "Ali is 13 years old, I think he seems 15.";
        String result3 = st.replace('0','*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(result3);

         String result4= st.replaceAll( "[0-9]", "*");
        System.out.println(result4);

        Type code to check if a password is valid or not for the following conditions;
        Password must have at least 8 characters different from space character
        Password must have at least 1 symbol*/



        String pwd =  "!1a23b4?es";
        boolean a= pwd.replaceAll("\\s", "").length()>7;
        System.out.println(a);

        boolean b= pwd.replaceAll("\\s", "").replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println("is the password valid?" + (a &&b));






















    }
}
