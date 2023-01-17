package practice;

public class day15qa02 {
    public static void main(String[] args) {

    String str1= "nalan";
    String reversed= " ";
    int idx= str1.length()-1;
    while(idx>-1){
        reversed=reversed+str1.charAt(idx);
        idx--;
    }
    if (str1.equals(reversed)){
        System.out.println("palindrome");
    }else{
        System.out.println("not palindrome");
    }




    }
}
