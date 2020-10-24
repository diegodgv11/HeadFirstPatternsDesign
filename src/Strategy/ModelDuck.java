package Strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        cuackBehavior = new Cuack();
    }

    @Override
    public void display() {
        System.out.println("Showing Model");
    }

}
