import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Libro extends Publicacion{
    private String numeroISBN;
    private String editorial;

    public Libro(String titulo, String autor, int numeroPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion, String numeroISBN, String editorial) {
        super(titulo, autor, numeroPaginas, fechaPublicacion, descripcion, tipoPublicacion);
        this.numeroISBN = numeroISBN;
        this.editorial = editorial;
    }

    public String getNumeroISBN() {
        return numeroISBN;
    }

    public void setNumeroISBN(String numeroISBN) {
        this.numeroISBN = numeroISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
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
