package ejercicio7_patronDiseno;

public class DocumentoTexto extends Documento{
    public DocumentoTexto(String contenido){
        super(contenido, "Texto");
    }

    @Override
    public DocumentoTexto clone() {
        return new DocumentoTexto(this.contenido);
    }
}
