package com.lemon.design.pattern.establish5.factory.simpleFactory;

/**
 * 具体商品
 */
public class BenzCar implements Car {
    @Override
    public String drive() {
        return "Drive Benz";
    }
}
