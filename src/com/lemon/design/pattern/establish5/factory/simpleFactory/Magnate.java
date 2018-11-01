package com.lemon.design.pattern.establish5.factory.simpleFactory;

/**
 * 使用者
 */
public class Magnate {

    public static void main(String[] args) {
        try {
            //告诉司机我想开奔驰
            Car car = Driver.driver("Benz");
            //下命令，开车
            String speak = car.drive();
            System.out.println(speak);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
