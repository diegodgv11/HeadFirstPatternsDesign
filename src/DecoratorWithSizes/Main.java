package DecoratorWithSizes;

public class Main {

    public static void main(String[] args) {

        Beverage simpleEspresso = new Espresso();
        System.out.println(simpleEspresso.getDescription() + ". Q" + simpleEspresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + ". Q" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + ". Q" + houseBlend.cost());

    }

}
