package Abstract_Interface.Animal;

import Abstract_Interface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
