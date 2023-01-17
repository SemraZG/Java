package SelfStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
    /*
    ArrayListler Array ler gibi aynı data tipine sahip birden fazla datayı depolammak için kullanılır.
    Array ile ArrayList in farkı ise;
    Array de en başta kaç elemanlı olduğunu söylemek zorundayız, söylediğimiz elemandan fazlasını koyamayız.
    ArrayList de ise başta eleman sayısı söylemek zorunda değiliz, flexible dır.

    Arraylerin içine primitive ve reference(adresler) konulur,
    ArrayList in içine ise sadece non-primitive ler konulur.

    Arrayler super fast dir ve memory i az kullanılırlar bu yüzden lenghten eminsek Array kullanmalyız.




//ArrayList nasıl oluşturulur
        //1.way
        ArrayList<Integer> ages= new ArrayList<Integer>();
        //2.way
        ArrayList<Integer> heights= new ArrayList<>();
        //3.way
        List<Integer> nums= new ArrayList<>();

//ArrayListler nasıl yazdırılır

        System.out.println(nums);//Arrayde ise System.out.println(Arrays.toString(nums)) şeklinde yazdırıyoruz;

//ArrayListe nasıl eleman eklenir

        nums.add(21);//Arrayde eleman yükleme ise nums[0]=21;
        //ArrayListte eleman ekleme add metodu ile yapılır ve son yazılan en sona eklenir
        //buna da "insertion order" denilir.
        nums.add(1, 50);//===>ArrayListte 1. indexe 50yi koy demek.
        List<Integer> prices= new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);//nums ArrayListine prices listini ekle demek.
        System.out.println(nums);//[21, 50, 23, 185]
        nums.addAll(2, prices);//nums Listinde 2.indexe prices listini ekle
        System.out.println(nums);//[21, 50, 23, 185, 23, 185]

//ArrayListinde eleman sayıısnı bulma;

        int elemansayısı= nums.size();//Arraylerde eleman sayısını lenght metodu veriyordu.
        System.out.println(elemansayısı);//6

//ArrayListde herhangi bir eleman nasıl seçilir

        System.out.println(nums.get(3));//get() metodu ile parantezin içindeki indexteki elemanı buluruz, nums listindeki 3. indexteki elemanı ver demek.

//ArrayListde bir eleman nasıl değiştirilir

        nums.set(3, 200);//nums Listindeki 3.indexteki elemanı 200 yap demek.

//Example: nums ArrayListindeki tüm tek sayıları 11 arttırın.

        for (int w: nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w), w+11);
            }
        }
        System.out.println(nums);
        //arrayListteki 200 elemanını siliniz.
        //remove() methodunun içine tam sayı koyarsak Java onu index olrak kabul eder.
        //remove methodu ilk gördüğü elemanı siler.
        Integer sayı=200;
        nums.remove(sayı);
        System.out.println(nums);//[32, 50, 34, 34, 196]


    List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Tacettin]

        List<String> cities= new ArrayList<>();
        cities.add("Trabzon");
        cities.add("Tokyo");
        cities.add("Tokat");

        names.addAll(cities);
        System.out.println(names);//[Tom, Thomas, Tahsin, Trump, Tacettin, Trabzon, Tokyo, Tokat]

        //Birden fazla eleman silmek istiyorsak silmek istediklerimizi bir listin içine koy,
        //sonra, removeall() methodu ile oluşturduğun listi diğer listten sil.

        //For Exp: tahsin ve trabzonu sil

        List<String> x= new ArrayList<>();
        x.add("Tahsin");
        x.add("Trabzon");
        System.out.println(x.size());

        names.removeAll(x);
        System.out.println(names);//[Tom, Thomas, Trump, Tacettin, Tokyo, Tokat]

        //Uzunluktan bahsederken Arrayler için Arrayin lenghti deriz,
        //Listler için Listin size deriz.

        List<String> myNames= new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tokat");


        System.out.println(names.containsAll(myNames));//true--> containsAll birden fazla elemanın listte var olup olmadığını kontrol eder.

    List<String> a= new ArrayList<>();
        a.add("Shoes");
        a.add("Tv");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
       //a listndeki Shoes elamanının ilk görünümünü siliniz.

        a.remove("Shoes");
        System.out.println(a);//[Tv, Radio, Laptop, Shoes, Book, Shoes]
        //a listndeki Shoes elamanının bütün görünümlerini siliniz.----> hepsini silmek istiyorsak removeAll methodu ile başka bir list oluşturarrak silmeliyiz.
       List<String> delete= new ArrayList<>();
       delete.add("Shoes");
        a.removeAll(delete);
        System.out.println(a);//[Tv, Radio, Laptop, Book]

        //Salary listi oluşturun eğer salary 10.000den az ise %20 cok ise %10 zam yapınız.
        List<Double> salary= new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (double w: salary){
    if (w<10000.00){
        salary.set(salary.indexOf(w), w*1.2);
    }else{
        salary.set(salary.indexOf(w), w*1.1);
    }
            }
        System.out.println(salary);

        //iki Arrayin eşit olup olmadığını kontrol eden kodu yazın.

        List<Character> m= new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');

        List<Character> n= new ArrayList<>();
        n.add('x');
        n.add('z');
        n.add('y');


        int counter=0;
        if (m.size()!=n.size()){
            System.out.println("Listler eşit değil");
        }else {
            for (int i = 0; i < m.size(); i++) {
                if (m.get(i) != n.get(i)) {
                    counter++;
                    System.out.println("Listler eşit değil");
                    break;
                }

            }
            if (counter == 0) {
                System.out.println("Listler eşit");
            }
        }
        //2.way
        boolean result= m.equals(n);
        if (result){
            System.out.println("Listler eşit");
        }else{
            System.out.println("Listler eşit değil");
        }
//1.way

        //Verilen listteki elemanları tekrarsız olarak yazınız.
        List<Integer> digit= new ArrayList<>();
        digit.add(2);
        digit.add(3);
        digit.add(2);
        digit.add(2);
        digit.add(5);

        List<Integer> digitNew= new ArrayList<>();

        for (int w : digit){
            if (!digitNew.contains(w)){
                digitNew.add(w);
            }
        }
        System.out.println(digitNew);//[2, 3, 5]

//Kullancıdan bir harf alınız, harf sizdeki List in içinde varsa,
// o harf yerine bulundu deyiniz, yoksa harfi liste ekleyiniz.
        List<String> letter= new ArrayList<>();
        letter.add("A");
        letter.add("K");
        letter.add("R");
        letter.add("S");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a letter");
        String a= input.next();


if (letter.contains(a)){
    letter.set(letter.indexOf(a), "Bulundu" );
}else{
    letter.add(a);
}
        System.out.println(letter);

        //Bir listteki elemanlardan birbirine en yakın olan ikisini bulunuz.

        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(19);
        a.add(30);
        a.add(21);
    List<Integer> b= new ArrayList<>();
        System.out.println(a);
    Collections.sort(a);
        System.out.println(a);
    int minFark=Integer.MAX_VALUE;
        for (int i=1; i<a.size(); i++){
            minFark= Math.min(minFark, (a.get(i)-a.get(i-1)));


        }

        System.out.println(minFark);


        //Bir integer Listteki 7 hariç diğer elemanları yazdırın.
        //1.way
        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(12);
        a.add(7);
        a.add(21);
        a.add(78);
        a.add(9);
        List<Integer>b= new ArrayList<>();

        for (int w: a){
            if (w==7){
                continue;
            }else{
                b.add(w);
            }
        }
        System.out.println(b);

//Bir integer Listteki 7 hariç diğer elemanları 2 arttırıp yazdırın.
//2.way
        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(12);
        a.add(7);
        a.add(21);
        a.add(78);
        a.add(9);

        for (int w: a){
            if (w==7){
                continue;
            }else{
                a.set(a.indexOf(w), w+2);
            }
        }
        System.out.println(a);

        //Verilen Listteki 8 ve 8den önceki tüm elemanları iki katına çıkarınız.

        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(7);
        a.add(21);
        a.add(8);
        a.add(9);
        for (Integer w: a){
            a.set(a.indexOf(w), w*2);
            if (w==8){
                break;

            }
        }
        System.out.println(a);
*/

        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(7);
        a.add(21);
        a.add(1,0);
        System.out.println(a);//[12, 0, 7, 21]

        List<String> b= new ArrayList<>();
        b.add("A");
        b.add("B");
        b.add("C");
        b.add("D");
        b.remove(2);
        System.out.println(b);
        System.out.println(b.remove("C"));
        b.clear();
        System.out.println(b);
        List<Boolean> c= new ArrayList<>();






    }
}














