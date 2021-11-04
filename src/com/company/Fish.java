package com.company;

public class Fish implements Animal_Transport{
    @Override
    public void say() {
        System.out.println("Bad-oop");
    }

    @Override
    public void canSwim() {
        System.out.println("Yes");
    }

    @Override
    public void canRun() {
        System.out.println("No");
    }

    @Override
    public void canFly() {
        System.out.println("No");
    }
}
