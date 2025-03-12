package com.in28minutes.learn_spring_framework.game;

public class GameRunner {

    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public  void run(){
        System.out.println("Running game :"+game);
        game.right();
        game.left();
        game.up();
        game.down();
    }
}
