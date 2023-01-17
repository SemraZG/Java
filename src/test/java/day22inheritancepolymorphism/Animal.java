package day22inheritancepolymorphism;

public class Animal {
   public  String name= "Animal";

   public void eat(){
      System.out.println("Animals eat...");
   }
   public void drink(){
      System.out.println("Animals drink...");
   }
   public Mammal create(){
      return new Mammal();
   }

   public Integer add(){
      return 12;
   }
   public int multiply(){
      return 25;
   }

   public final int divide(){
      return 34;
   }

}
