package org.example.DecoratorPattern;

public class Main {

    public static void main(String[] args) {
//        BasePizza veggie = new Veggie();
//        BasePizza margaritta = new Margerita();
//        BasePizza cheezy = new Cheesy();

        ToppingDecorator pizza = new Jalipino(new Mushroom(new FarmHousePizza(new Margerita())));
        System.out.println("Pizza Price for the customer XYZ is" + pizza.cost());
    }
}
