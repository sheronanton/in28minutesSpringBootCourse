package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicsJava {

    public static void main(String[] args) {

        MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();


        GameRunner gameRunner = new GameRunner(superContraGame);

        gameRunner.run();

    }
}
