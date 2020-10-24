package Strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    CuackBehavior cuackBehavior;

    public Duck() { }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setCuakBehavior(CuackBehavior cuackBehavior) {
        this.cuackBehavior = cuackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performCuack() {
        cuackBehavior.cuack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}
