package ejercicio7_patronDiseno;

public class Main {
    public static void main(String[] args){
        DocumentoTexto textooriginal = new DocumentoTexto("este es el documento texto ");
        DocumentoImagen imagenOriginal = new DocumentoImagen("esta es la imagen ");


        DocumentoTexto textoClonado = textooriginal.clone();
        DocumentoImagen imagenClonado = imagenOriginal.clone();

        System.out.println("Documento de texto original");
        textooriginal.mostrarContenido();
        System.out.println("Formato "+textooriginal.obteneFormato());

        System.out.println("Documento de texto clonado");
        textoClonado.mostrarContenido();
        System.out.println("formato "+textoClonado.obteneFormato());
        System.out.println("//////////////////////////////////////////////");

        System.out.println("Documento de imagen original");
        imagenOriginal.mostrarContenido();
        System.out.println("formato "+imagenOriginal.obteneFormato());

        System.out.println("Documento de imagen clonado");
        imagenClonado.mostrarContenido();
        System.out.println("formato "+imagenClonado.obteneFormato());
    }
}
