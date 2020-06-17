package main;

public class Result {
    // Objeto que devolvera el metodo finishRound() para enviar la informacion del codigo y mensaje de la ronda.
    private int code = 0;
    private String message = "";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
