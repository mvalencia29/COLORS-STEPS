import java.util.List;

public class ValidateResult {

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

    public static boolean validateDataPattern(List<Integer> patternInGamePlaying) {
        for (int i = 0; i < patternInGamePlaying.size(); i++){
            if(!(patternInGamePlaying.get(i) == Pattern.getPatternInGame().get(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean validateHigherPosibleScoreToCurrent() {
        if(Constants.maxScore == Points.getCurrentScore()){
            return true;
        }
        return false;
    }
}
