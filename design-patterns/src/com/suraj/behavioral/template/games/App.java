package com.suraj.behavioral.template.games;

public class App {
    public static void main(String[] args) {
        Game footballGame = new FootballGame();
        Game basketballGame = new BasketballGame();
        footballGame.play();
        basketballGame.play();
    }
}

