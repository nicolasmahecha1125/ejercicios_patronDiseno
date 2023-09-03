package ejercicio7_patronDiseno;

public abstract class Documento {
    protected String contenido;
    protected String formato;
    public Documento(String contenido,String formato){
        this.contenido = contenido;
        this.formato = formato;
    }
    public abstract Documento clone();
    public void mostrarContenido(){
        System.out.println("contenido del documento:");
        System.out.println(contenido);
    }
    public String obteneFormato(){
        return formato;
    }
}
