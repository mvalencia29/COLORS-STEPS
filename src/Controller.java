import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void startGame(){
        Pattern.generatePattern();
        Pattern.getPatternInGameNextRound();
    }

    //Options
    // 100 = won the game
    // 200 = won the round
    // 300 = lost the game

    public static Result finishRound(List<Integer> patternInGamePlaying){
        int response = ValidateResult.validate(patternInGamePlaying);
        Result message = validateResponse(response);
        return message;
    }

    private static Result validateResponse(int response){
        Result result =  new Result();
        if(response == 100){
            result.setCode(100);
            result.setMessage("Ganador");
            Controller.resetDataWinner();
        }
        else if(response == 200){
            result.setCode(200);
            result.setMessage("Siguiente Ronda");
        }
        else{
            result.setCode(300);
            result.setMessage("Perdio");
            Controller.resetDataLoser();
        }
        return result;
    }

    private static void resetDataWinner(){
        Pattern.resetPatterns();
        Points.resetCurrentScore();
        Points.setRecord(100);
        Points.setLastScore(Points.getCurrentScore());
        Points.setOneAttempts();
    }

    private static void resetDataLoser(){
        Pattern.resetPatterns();
        Points.resetCurrentScore();
        if(Points.getCurrentScore() > Points.getRecord()){
            Points.setRecord(Points.getCurrentScore());
        }
        Points.setLastScore(Points.getCurrentScore());
        Points.setOneAttempts();
    }

}
