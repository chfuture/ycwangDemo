package com.demo.ycwang.custom.design.strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new QuackQuack();
        flyBehavior = new FlyWithWings();
    }


}
