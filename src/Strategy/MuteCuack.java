package Strategy;

public class MuteCuack implements CuackBehavior {

    @Override
    public void cuack() {
        System.out.println("<< Silence >>");
    }

}
