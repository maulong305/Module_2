package Abstract_Interface;

import Abstract_Interface.Animal.Animal;
import Abstract_Interface.Animal.Chicken;
import Abstract_Interface.Animal.Tiger;
import Abstract_Interface.edible.Edible;
import Abstract_Interface.fruit.Apple;
import Abstract_Interface.fruit.Fruit;
import Abstract_Interface.fruit.Orange;

public class AbstracInterFaceTest {
    public static void main(String[] args) {
//        tạo đối tượng, gọi phương thức, đưa vào mảng
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
//        duyệt từng phần tử của mảng
        for (Animal animal : animals) {
            animal.makeSound();
            System.out.println(animal.makeSound());
//Ép kiểu
            if(animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
//        tạo đối tượng fruit, nhét vào mảng
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
