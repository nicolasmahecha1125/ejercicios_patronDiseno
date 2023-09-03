package ejercico2_patronDiseno;

public class Main {
    public static void main(String[] args) {
        GameCofiguration configuracion = GameCofiguration.getInstance();

        String dificultadDelJuego = configuracion.getDificultadDelJuego();
        int volumenDelSonido = configuracion.getVolumenDelSonido();
        String opcionesGraficas = configuracion.getOpcionesGraficas();

        System.out.println("dificultad del juego: "+dificultadDelJuego);
        System.out.println("volumen del sonido: "+volumenDelSonido);
        System.out.println("opciones del juego: "+opcionesGraficas);

        System.out.println("/////////////////////////////////////////////");

        configuracion.setDificultadDelJuego("Dificil");
        configuracion.setVolumenDelSonido(60);
        configuracion.setOpcionesGraficas("High");

        String nuevaDificultadDelJuego = configuracion.getDificultadDelJuego();
        int nuevaVolumenDelSonido = configuracion.getVolumenDelSonido();
        String nuevaOpcionesGraficas = configuracion.getOpcionesGraficas();

        System.out.println("nueva dificultad del juego: "+nuevaDificultadDelJuego);
        System.out.println("nuevo volumen del sonido: "+nuevaVolumenDelSonido);
        System.out.println("nuevas opciones del juego: "+nuevaOpcionesGraficas);

        System.out.println("/////////////////////////////////////////////////");


    }
}