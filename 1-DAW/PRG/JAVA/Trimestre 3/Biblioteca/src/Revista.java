import java.util.Date;

public class Revista extends Publicacion{
    private String numeroEdicion;
    private String tema;

    public Revista(String titulo, String autor, int numeroPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion, String numeroEdicion, String tema) {
        super(titulo, autor, numeroPaginas, fechaPublicacion, descripcion, tipoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.tema = tema;
    }

    public String getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(String numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void agregarMaterial(Material material) {
        materiales.add(material);

    }

    @Override
    public void eliminarMaterial(Material material) {
        materiales.remove(material);

    }
}
