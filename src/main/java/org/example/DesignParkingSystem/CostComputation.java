package org.example.DesignParkingSystem;

public class CostComputation {
    PricingStrategy pricingStrategy;
    CostComputation(PricingStrategy pricingStrategy){
        this.pricingStrategy=pricingStrategy;
    }

    Long getPrice(){
        return this.pricingStrategy.priceCalculate();
    }

}
