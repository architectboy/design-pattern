package com.lemon.design.pattern.establish5.factory.simpleFactory;

/**
 * 工厂类角色
 */
public class Driver {
    public static Car driver(String carName) throws Exception {
        if (carName.equalsIgnoreCase("Audi")) {
            return new AudiCar();
        } else if (carName.equalsIgnoreCase("Benz")) {
            return new BenzCar();
        } else if (carName.equalsIgnoreCase("Bmw")) {
            return new BmwCar();
        } else {
            throw new Exception("No this produce");
        }
    }
}
