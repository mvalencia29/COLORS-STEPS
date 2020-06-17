package main;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

    /*
        Esta lista contiene los patrones de colores que tendra esa partida del juego
    */
    private static List<Integer> pattern = new ArrayList<Integer>();

    /*
        Esta lista contiene los patrones de colores que seran mostrados en cada ronda del juego
    */
    private static List<Integer> patternInGame = new ArrayList<Integer>();

    /*
        Por medio de este metodo llenamos la lista que contiene los patrones de colores de esa partida.
    */
    public static void generatePattern(){
        for (int i = 0; i < 100; i++){
            pattern.add((int) (Math.random() * 4) + 1);
        }
    }

    /*
        Por medio de este metodo obtenemos el patron de colores de la ronda actual
    */
    public static List<Integer> getPatternInGame() {
        return patternInGame;
    }

    /*
        Por medio de este metodo agregamos un numero (Color), mas para la siguiente ronda
    */
    public static List<Integer> getPatternInGameNextRound() {
        Pattern.patternInGame.add(pattern.get(patternInGame.size()));
        return patternInGame;
    }

    /*
        Por medio de este metodo limpiamos los dos patrones que tenemos
    */
    public static void resetPatterns() {
        pattern.clear();
        patternInGame.clear();
    }
}
