package SelfStudy;

public class Varargs {
    public static void main(String[] args) {
/*
    Farklı sayılardaki parametrelerle çalışabilen bir method oluşturmak istersek varargs kullanmslıyız.
    Varargs arka tarafta array kullanır.
    Varargs oluşturmak için "data type ... varargs ismi" yapısı kullanılır.
    Varargs herzaman en sonda olmalıdır.-->public static int sum(String s, int...a)-->bu şekilde olmalı.
    Yanyana iki varargs kullanılamaz.-->public static int sum(String ...s, int...a)-->bu şekilde kullanmayız


    Method Signature = Method Name + Method Parameters

    Java method signature dışında ne değişirse değişsin onu farklı kabul etmez.
    Return type veya access mod gibi şeylerin değişmesi methodu değiştirez.

 */

        System.out.println(sum(2,3,4,6,4));

        add(3.5,5);





    }
    public static int sum(int a, int b){
        return  a+b;
    }
    //İstediğimiz kadar sayıyı toplayabileceğimiz bir method oluşturun.

    public static int sum(int...a){
        int toplam=0;
        for (Integer w: a){
            toplam=toplam+w;
        }
        return toplam;
    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }

    public static void m3(String x, int... y) {
        int p = 1;
        for(int w: y) {
            p = p * w;
        }
        System.out.print(x);
        System.out.println(p);
    }



}

