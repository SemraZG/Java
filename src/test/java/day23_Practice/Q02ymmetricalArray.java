package day23_Practice;

public class Q02ymmetricalArray {
    //Type a method to check if an integer Array is symetrical or not.
    //palindrome

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        System.out.println("Is Array symmetrical?" + symmetrical(arr));

    }

    public static boolean symmetrical(int [] arr){
        boolean result= false;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]==arr[arr.length-1-i]){
                result= true;
            }else{
                result=false;
                break;
            }
        }

        return result;
    }





}
