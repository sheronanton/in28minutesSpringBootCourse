package com.in28minutes.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Contra: Go up ");
    }

    @Override
    public void down() {
        System.out.println("Contra: Go into a hole");
    }

    @Override
    public void left() {
        System.out.println("Contra: Go left");
    }

    @Override
    public void right() {
        System.out.println("Contra: Go forward");
    }
}
