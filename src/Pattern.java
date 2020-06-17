import java.util.ArrayList;
import java.util.List;

public class Pattern {

    private static List<Integer> pattern = new ArrayList<Integer>();

    private static List<Integer> patternInGame = new ArrayList<Integer>();

    public static void generatePattern(){
        for (int i = 0; i < 100; i++){
            pattern.add((int) (Math.random() * 4) + 1);
        }
    }

    public static List<Integer> getPattern() {
        return pattern;
    }

    public static List<Integer> getPatternInGame() {
        return patternInGame;
    }

    public static List<Integer> getPatternInGameNextRound() {
        Pattern.patternInGame.add(pattern.get(patternInGame.size()));
        return patternInGame;
    }

    public static List<Integer> resetPatterns() {
        pattern.clear();
        patternInGame.clear();
        return patternInGame;
    }
}
