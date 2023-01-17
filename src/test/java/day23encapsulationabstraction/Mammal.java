package day23encapsulationabstraction;

public abstract class Mammal extends Animal {

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void move() {
        super.move();
    }
}
