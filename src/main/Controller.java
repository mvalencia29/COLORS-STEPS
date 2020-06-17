package main;

import java.util.List;

public class Controller {

    //Empezar el juego
    public static void startGame(){
        Pattern.generatePattern();
        Pattern.getPatternInGameNextRound();
    }

    //Options
    // 100 = won the game
    // 200 = won the round
    // 300 = lost the game

    //Validar cada ronda del juego
    public static Result finishRound(List<Integer> patternInGamePlaying){
        int response = ValidateResult.validate(patternInGamePlaying);
        Result message = validateResponse(response);
        return message;
    }

    /*
        En este metodo dependiendo de la respuesta de la validacion,
        llamamos a otros metodos para actualizar el score y resetear la
        informacion en las listas.
     */
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
        else if(response == 300){
            result.setCode(300);
            result.setMessage("Perdio");
            Controller.resetDataLoser();
        }
        else{
            result.setCode(400);
            result.setMessage("Desconocido");
        }
        return result;
    }

    /*
        Metodo para resetear la informacion y actualizar el mejor y ultimo score, una ves que el usuario gane el juego
    */
    private static void resetDataWinner(){
        Pattern.resetPatterns();
        Points.resetCurrentScore();
        Points.setRecord(100);
        Points.setLastScore(Points.getCurrentScore());
        Points.setOneAttempts();
    }

    /*
        Metodo para resetear la informacion, y actualizar el mejor y ultimo score, una ves que el usuario pierda el juego
    */

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
