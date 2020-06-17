package main;

import java.util.List;

public class ValidateResult {

    /*
        Validar los colores que el usuario digito
     */
    public static int validate(List<Integer> patternInGamePlaying){
        boolean resultValidate = ValidateResult.validateDataPattern(patternInGamePlaying);
        if(resultValidate){
            Points.setOnePointCurrentScore();
            boolean result = ValidateResult.validateHigherPosibleScoreToCurrent();
            if(result){
                return 100;
            }
            return 200;
        }
        else{
            return 300;
        }
    }

    /*
        Validar los colores que el usuario digito, para compararlos con los colores que son.
    */
    public static boolean validateDataPattern(List<Integer> patternInGamePlaying) {
        for (int i = 0; i < patternInGamePlaying.size(); i++){
            if(!(patternInGamePlaying.get(i) == Pattern.getPatternInGame().get(i))){
                return false;
            }
        }
        return true;
    }

    /*
        Validar si el usuario ya gano el juego.
    */
    public static boolean validateHigherPosibleScoreToCurrent() {
        if(Constants.maxScore == Points.getCurrentScore()){
            return true;
        }
        return false;
    }
}
