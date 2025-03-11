package com.in28minutes.learn_spring_framework.game;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Go up mario");
    }

    @Override
    public void down() {
        System.out.println("Go into a hole");
    }

    @Override
    public void left() {
        System.out.println("Go left");
    }

    @Override
    public void right() {
        System.out.println("Go forward");
    }
}
