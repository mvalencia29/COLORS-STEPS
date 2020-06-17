package main;

public class Points {

    // Puntaje actual
    private static int currentScore = 0;
    // Record actual
    private static int record = 0;
    // Ultimo Puntaje
    private static int lastScore = 0;
    // Intentos
    private static int attempts = 0;

    public static int getCurrentScore() {
        return currentScore;
    }

    public static void setOnePointCurrentScore() {
        Points.currentScore++;
    }

    public static void resetCurrentScore() {
        Points.currentScore = 0;
    }

    public static int getRecord() {
        return record;
    }

    public static void setRecord(int record) {
        Points.record = record;
    }

    public static int getLastScore() {
        return lastScore;
    }

    public static void setLastScore(int lastScore) {
        Points.lastScore = lastScore;
    }

    public static int getAttempts() {
        return attempts;
    }

    public static void setOneAttempts() {
        Points.attempts++;
    }

}
