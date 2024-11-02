package org.example.DecoratorPattern;

public class Jalipino  extends ToppingDecorator{

    BasePizza basePizza;

    Jalipino(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}