package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Empezar el juego
        Controller.startGame();
        //Validar en cada ronda
        List<Integer> testing = new ArrayList<>();
        testing.add(1);

        //Response
        // 100 = won the game
        // 200 = won the round
        // 300 = lost the game

        //Validar en cada ronda
        Result response = Controller.finishRound(testing);
        System.out.println(response.getCode());
        System.out.println(response.getMessage());
    }
}
