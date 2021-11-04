package com.company;

public class Cow implements Animal_Transport{
    @Override
    public void say() {
        System.out.println("MOOOOO");
    }

    @Override
    public void canSwim() {
        System.out.println("Maybe");
    }

    @Override
    public void canRun() {
        System.out.println("Yes");
    }

    @Override
    public void canFly() {
        System.out.println("No");
    }
}
