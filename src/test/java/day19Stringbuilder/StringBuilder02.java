package day19Stringbuilder;

public class StringBuilder02 {
    public static void main(String[] args) {

      StringBuilder sb1= new StringBuilder("Mississippi");
        System.out.println(sb1);

      //toString(); method is used to chance StringBuilder to String.

        String test= sb1.toString();
        System.out.println(test);

        StringBuilder revSb1 =sb1.reverse();
        System.out.println(revSb1);//ippississiM

        //.reverse() method is used to reserve a String.

        //If you ger a question like "How to reserve a String" tell them;
        //i)I can reserve a String by using .reverse() method from StringBuilder Class
        //ii)I can reserve a String by using loops.
        //Interviewer will tell you use the loops, loops are more preferable.

        sb1.deleteCharAt(0);
        System.out.println(sb1);//ppississiM ==> there is no value of indexOf(0) =i

        //.deleteCharAt() method is used to delete a character at a specific index

        //Note: When you use a method for StringBuilders, if it is "bold and not coming from String Class" it changes the original value.

        sb1.delete(2,5);
        System.out.println(sb1);//ppissiM

        //.delete(starting index, ending index) is used to delete characters from starting index from ending index
        //starting index is inclusive, ending index is evclusive.

        sb1.replace(2,4, "IS");
        System.out.println(sb1);//ppISsiM

        //.replace(starting index, ending index, new value) method is used to change characters from starting index to ending index to a new value


        sb1.insert(3, "xxx");
        System.out.println(sb1);//ppIxxxSsiM

        //.insert(number of characters from the beginning, new value) method will insert new value, after skipping number of characters from the beginning

        StringBuilder sb2= new StringBuilder("Java is love");
        StringBuilder sb3= new StringBuilder("Java is love");

        int result= sb2.compareTo(sb3);
        System.out.println(result);

        //Note: compareTo() method does not ignore cases, it checks alphabetical order by using ASCII Values.

        sb3.setCharAt(8, 'm');
        System.out.println(sb3);//Java is move

        // .setCharAt(nidex, new char valur) method is used to update a specific character at a specific index.


        // 1) Mechanism behind the "immutability"
        // 2) Benefits of "immutability"
        // 3)idfference between "immutability" and "mutability"
        // 4)Features of the StringBuilder

















    }
}
