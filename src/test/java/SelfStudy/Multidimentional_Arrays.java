package SelfStudy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multidimentional_Arrays {
    public static void main(String[] args) {
/*
        //binarySearch() method; bu methodu kullanarak bir elemanın Arrayda olup olmadığını kontrol ederiz.
                                //binarySearch() methodu aradığımız elemanın indexini verir.
                                // bu methoddan önce mutlaka Arrays.sort() methodunu kullanmalıyız.
        int arr[]={12,31,43,14};
        int sayı=43;

        Arrays.sort(arr);
        Arrays.binarySearch(arr, sayı);
        int idx1= Arrays.binarySearch(arr, sayı);
        System.out.println(idx1);//3.indexi verdi

        int sayı2=58;
        int idx2= Arrays.binarySearch(arr, sayı2);
        System.out.println(idx2);//-5==> '-' demek Arrayda yok demek,
                                // 5 demek, eğer olsaydı Arrayda 5. sırada olacak demek, sıra ama index değil.
                                // sort() methodu ile sıraladığımız için değer olarak hangi aralıktaysa o sırada olacaktı demek.

        int sayı3=17;
        int idx3= Arrays.binarySearch(arr, sayı3);
        System.out.println(idx3);//-3


        //Arraydaki en büyük eleman ve en küçük elemanı bulunuz.

        int arr[]={-12,1,-5,23,-2,0};

        Arrays.sort(arr);
        System.out.println("Arraydaki en küçük eleman "+arr[0]);
        System.out.println("Arraydaki en büyük eleman "+arr[arr.length-1]);


        //Arraydaki en büyük negatif eleman ve en küçük pozitif elemanı bulunuz.

        int arr[]={-12,18,-5,23,-2,0};

        Arrays.sort(arr);//{-12,-5,-2,0,18,23}
        int maxNegatif=arr[0];
        int minPozitif= arr[arr.length-1];
        for (int w: arr){
            if (w<0){
                maxNegatif=Math.max(maxNegatif, w);
            }
            if (w>0){
                minPozitif=Math.min(minPozitif, w);
            }
        }
        System.out.println(maxNegatif+" and "+minPozitif);


        //Bir Stringdeki sesli harflerin sayısını bulan kodu yazınız.

        String str= "Java öğrenince para kazanmak kolay, öğrenmeyince ne kolay ki.";
        str=str.toLowerCase();
        System.out.println(str);
        String wovel[]=str.split(" ");
        System.out.println(Arrays.toString(wovel));
        //[Java, öğrenince, para, kazanmak, kolay,, öğrenmeyince, ne, kolay, ki.]
        String wovels[]=str.split("");
        System.out.println(Arrays.toString(wovels));
        //[J, a, v, a,  , ö, ğ, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , k, o, l, a, y, ,,  ,
        // ö, ğ, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, o, l, a, y,  , k, i, .]


        int counter=0;

        for (String w: wovels){
            switch (w){
                case "a":
                case "e":
                case "o":
                case "i":
                case "u":
                    counter++;

            }
        }
        System.out.println(counter);

        //veya;
        //Bir Stringdeki sesli harflerin sayısını bulan kodu yazınız.

        String str= "Java öğrenince para kazanmak kolay, öğrenmeyince ne kolay ki.";
        str=str.toLowerCase();

        str=str.replaceAll("[^aeiou]", "");
        System.out.println(str.length());


        //Bir Arrayin elemanları Array ise bu Multidimensional Array dir.

        int arr[][]=new int[3][2];
        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][0]=6;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=0;

        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1]));//[6, 18]
        System.out.println(arr[1][0]);//6


   //Bir string multidimentional array deki a olan elemanları yazdır.
   String arr[][]= { {"learn", "java", "it"}, {"is", "easy"} };
   for (String[] w: arr){
       for (String k: w){
           if (k.contains("a")){
               System.out.print(k+" ");
           }
       }
   }

   //Integer multidimentional array olusturun ve tüm sayıları toplayın.

       int arr[][]={{2,5,1}, {32,75}, {13,21,43,56}};
       int sum=0;
       for (int[] w: arr){
           for (int k: w){
               sum=sum+k;
           }
       }
        System.out.println(sum);



        //multidimentional array i normal array e çeviren kodu yazınız.

        int arr[][] = {{2, 5, 1}, {32, 75}};
        int elemanSayısı = 0;

        for (int[] w : arr) {
            elemanSayısı = elemanSayısı + w.length;
        }
        System.out.println(elemanSayısı);

        int idx = 0;
        int[] brr = new int[elemanSayısı];
        for (int[] w : arr) {
            for (int k : w) {
                brr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));//[2, 5, 1, 32, 75]
 */
        //multidimentional array deki en büyük ve en küçük elemanın toplamını veren kodu yazın

        int arr[][]={{2,5,1}, {83,75}};
        int elemansayısı=0;
        int idx=0;
        for (int [] w: arr){
            elemansayısı=elemansayısı+w.length;
        }
        int brr[]=new int[elemansayısı];
        for (int [] w: arr){
            for (int k: w){
                brr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));
        Arrays.sort(brr);
        System.out.println(brr[0]+brr[brr.length-1]);
        //veya
        int max= arr[0][0];
        int min= arr[0][0];
        for (int [] w: arr){
            for (int k: w){
               max=Math.max(max, k);
               min=Math.min(min, k);
            }
        }
        System.out.println(max+min);

















    }
}