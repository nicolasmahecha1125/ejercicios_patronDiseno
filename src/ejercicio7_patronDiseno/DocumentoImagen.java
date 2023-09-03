package ejercicio7_patronDiseno;

public class DocumentoImagen extends Documento{
    public DocumentoImagen(String contenido){
        super(contenido, "Imagen");
    }

    @Override
    public DocumentoImagen clone() {
        return new DocumentoImagen(this.contenido);
    }
}
