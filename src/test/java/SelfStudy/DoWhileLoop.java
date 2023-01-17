package SelfStudy;

import javax.security.sasl.SaslClient;
import java.nio.file.LinkPermission;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
/*
    //Bir ondalik sayının ondalık kısmındakı rakamlarının toplamını bulunuz

        double num=24.5673;
        String str= String.valueOf(num);//String.valueOf(num) methodu parantezin içine konulan datayı(bu örnekte double olan num u) Stringe çevirir.
        System.out.println(str);
        String decimalpart= str.split("\\.")[1];//Split() methodu verilen Stringi söylenilen noktadan (bu örnekte 0'dan (\\.)) ikiye böler.
        //İlk bölüm 0.index, ikinci bölüm 1. index olur, [] bunun içne hangi bölmeyi istiyorsak onu yazarız 0 veya 1 olarak.
        System.out.println(decimalpart);
        int decimalint=Integer.valueOf(decimalpart);//Integer.valueOf(decimalpart) methodu methodu, parantezin içine konulan datayı
        // (bu örnekte String olan decimalpartı) int a çevirir.
        System.out.println(decimalint);

        int sum=0;

        do {
            sum=sum+decimalint%10;
            decimalint=decimalint/10;
        }while (decimalint>0);
        System.out.println(sum);

        //Kullanıcıdan sayı alınız, sayı 100den küçükse "kazandın" yazdırın, aksi halde "kaybettin" yazdır, kullanıcı kazandıkça oyun devam etmeli.

        Scanner input= new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a digit");
           num=input.nextInt();
            if (num<100){
                System.out.println("You win!");
            }

        }while (num<100);
        System.out.println("You lose!!");


        //kullanıcıdan aldıgınız ismin büyük harf olup olup olmadıgını kontrol et.

        Scanner input= new Scanner(System.in);
        do {
            System.out.println("Enter your name");
            char ilkHarf=input.next().charAt(0);
            if (ilkHarf>='A'&& ilkHarf<='Z'){
                System.out.println("ismi başarıyla girdiniz");
            }else{
                System.out.println("ismi yanlış girdiniz");
                break;
            }
        }while (true);


        String s= "Java is easy";
        System.out.println(s.split("\\s")[2]);//easy
*/





























    }
}
