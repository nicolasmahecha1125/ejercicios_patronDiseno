package ejercico2_patronDiseno;

import java.util.HashMap;

public class GameCofiguration {
    private static GameCofiguration instance;
    private String dificultadDelJuego;
    private int volumenDelSonido;
    private String opcionesGraficas;


    private GameCofiguration(){
        dificultadDelJuego= "Normal";
        volumenDelSonido =  40;
        opcionesGraficas = "Low";
    }
    public static GameCofiguration getInstance(){
        if (instance == null){
            instance = new GameCofiguration();
        }
        return instance;
    }

    public String getDificultadDelJuego() {
        return dificultadDelJuego;
    }

    public void setDificultadDelJuego(String dificultadDelJuego) {
        this.dificultadDelJuego = dificultadDelJuego;
    }

    public int getVolumenDelSonido() {
        return volumenDelSonido;
    }

    public void setVolumenDelSonido(int volumenDelSonido) {
        this.volumenDelSonido = volumenDelSonido;
    }

    public String getOpcionesGraficas() {
        return opcionesGraficas;
    }

    public void setOpcionesGraficas(String opcionesGraficas) {
        this.opcionesGraficas = opcionesGraficas;
    }
}
