package day23_Practice;

public class Cat extends Q04_Animal{
    public void meow(){
        System.out.println("Cats meow...");
    }

    @Override
    public void eat() {
        System.out.println( "cats eat meat");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void weight() {
        super.weight();
    }

    @Override
    public void consume() {
        super.consume();
    }

    @Override
    public void move() {
        super.move();
    }
}
