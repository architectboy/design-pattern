package com.lemon.design.pattern.establish5.factory.simpleFactory;

/**
 * 具体商品
 */
public class BmwCar implements Car {
    @Override
    public String drive() {
        return "Drive Bmw";
    }
}
