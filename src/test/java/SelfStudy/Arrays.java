package SelfStudy;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

    /*    //[0, 2, 3, 0, 12, 0] sıfırları en sona koyunuz.==>[2, 3, 12, 0, 0, 0]

        int arr[] = {0, 2, 3, 0, 12, 0};
        int brr[] = new int[arr.length];

        int idx=0;
       for (int i=0; i<arr.length; i++){
           if (arr[i]!=0){
              brr[idx]=arr[i];
               idx++;
           }

       }
        System.out.println(java.util.Arrays.toString(brr));


//Bir Arrayin içinde herhangi bir eleman olup olmadığını kontrol eden ve kac kere tekrarlandığını gösetren kodu yazın.

int arr[]={2,1,2,-3,2};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a digit to check");
        int digitCheck=input.nextInt();
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (digitCheck==arr[i]){
                count++;
            }
        }
        if (count>0) {
            System.out.println(digitCheck +" is in arr Array" + " "+count + " times");
        }else{
            System.out.println(digitCheck +" does not in arr Array");

        }

        //Size verilen cümledeki en uzun kelimeyi bulan kodu yazınız.

    String s="Java kolaydır çalışana, 12345678911155  ne kolay ki çalışmayana demiş 1234512345678911155a";
    s= s.replaceAll("\\p{Punct}", "");
    System.out.println(s);
    String arr[]= s.split(" ");
    System.out.println(java.util.Arrays.toString(arr));
    String max="";


    for (int i=0; i<arr.length-1; i++){
    if (arr[i].length()>arr[i+1].length()){
        max=arr[i];
    }else{
        max=arr[i+1];
    }
    }
        System.out.println(max);
 */
        //Class List with student's names
       Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of the students");
        int std= input.nextInt();
        input.nextLine();
        String arr[]=new String[std];
        for (int i=1; i<=std; i++){
            System.out.println("enter the "+ i+ ". student's name");

            String name=input.nextLine();
            arr[i-1]=name;
        }
        System.out.println(java.util.Arrays.toString(arr));







        }











    }
