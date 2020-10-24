package Strategy;

class Squeak implements CuackBehavior {

    @Override
    public void cuack() {
        System.out.println("Squeak");
    }

}