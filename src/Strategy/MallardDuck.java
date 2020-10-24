package Strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        cuackBehavior = new Cuack();
    }

    @Override
    public void display() {
        System.out.println("Showing Mallard");
    }

}
