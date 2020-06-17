package Abstract_Interface.fruit;

//      Tạo lớp Apple kế thừa lớp Fruit
public class Apple extends Fruit {
//    ghi đè phương thức
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
