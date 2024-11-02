package org.example.DecoratorPattern;

public class FarmHousePizza extends ToppingDecorator{

    BasePizza basePizza;

    FarmHousePizza(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 50;
    }
}
