package com.demo.ycwang.ycwangdemo.design.strategy;

public class Test {

    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        duck.eat();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }

}
