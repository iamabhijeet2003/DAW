import java.util.Date;

public class Periodico extends Publicacion {
    private String numeroVolumen;
    private String fecha;

    public Periodico(String titulo, String autor, int numeroPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion, String numeroVolumen, String fecha) {
        super(titulo, autor, numeroPaginas, fechaPublicacion, descripcion, tipoPublicacion);
        this.numeroVolumen = numeroVolumen;
        this.fecha = fecha;
    }

    public String getNumeroVolumen() {
        return numeroVolumen;
    }

    public void setNumeroVolumen(String numeroVolumen) {
        this.numeroVolumen = numeroVolumen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
