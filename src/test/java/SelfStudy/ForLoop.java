package SelfStudy;

public class ForLoop {
    public static void main(String[] args) {

/*
        //4 den 17 ye kadar tamsayıları yazdır

        for (int i=4; i<18; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");//4 6 8 10 12 14 16
            }
        }


        //14den 5e kadar tamsayıları yazdır
        for (int i=14; i>4; i--){
            System.out.print(i+" ");//14 13 12 11 10 9 8 7 6 5
        }

        //14den 5e kadar cift sayıları yazdır
        for (int i=14; i>4; i--){
           if (i%2==0){
               System.out.print(i+" ");//14 12 10 8 6
           }
        }
        //15den 2e kadar 3e bölünebilen sayıları yazdır
        for (int i=15; i>2; i--){
            if (i%3==0){
                System.out.print(i+" ");//15 12 9 6 3
            }
        }


        //"Java" stringini j*a*v*a* dönüştür
        String s="Java";
        for (int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");//J*a*v*a*

        }

        //Verilen Stringde tekrarsız karakterleri yazdır
        String a= "Hellooo Ali";
        for (int i=0; i<a.length(); i++){
            char c= a.charAt(i);
            if (a.indexOf(c)==a.lastIndexOf(c)){
                System.out.print(c);//He Ai
            }
        }

        //3den 6ya kadar tamsayıların toplamını yazdır
        int sum=0;
        for (int i=3; i<7; i++){
            sum+=i;
        }
        System.out.println(sum);//18


        //6dan 3e kadar tamsayıları carp
        int multply=1;
        for (int i=3; i<7; i++){
            multply*=i;
        }
        System.out.println(multply);


        //Verilen tamsayının rakamları toplamını bul

        int num=-385;
        num=Math.abs(num);
        int result=0;

        for (int i=num; i>0; i/=10){
            result=result+ i%10;
        }
        System.out.println(result);

        //Verilen Stringi tersten yazdırın

        String s= "Kabak gibi tabak";
        String empty="";
        for (int i=s.length()-1; i>=0; i--){
            empty+=s.charAt(i);
        }
        System.out.println(empty);

        //verilen stringde "m" haric herseyı yazdır

        String s="Andromeda";
        String empty="";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)!='m'){
                System.out.print(s.charAt(i));
            }
        }


        String s="Yusuf";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='u'){
                continue;
            }
            System.out.print(s.charAt(i));
        }

veya
        String s= "yusuf";
        String empty= "";
        for (int i=0; i<s.length(); i++){

            if (s.charAt(i)=='u'){
                continue;
            }
            empty+=s.charAt(i);
        }
        System.out.println(empty);


    //1den 100e kadar 6 ile bölünenler hariç tüm tamsayıları yazdır

        for (int i=1; i<101; i++){
        if (i%6==0){
            continue;
        }
            System.out.print(i+" ");
    }


        //verilen stringdeki m den önceki karakterleri yazdır

        String s= "Lüksemburg";
        String empty="";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='m'){
                break;
            }
            empty+=s.charAt(i);

        }
        System.out.println(empty);
*/




    }
}