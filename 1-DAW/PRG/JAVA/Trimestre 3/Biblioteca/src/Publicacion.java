import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Publicacion extends Biblioteca{
    private String tipoPublicacion;

    public Publicacion(String titulo, String autor, int numeroPaginas, String fechaPublicacion, String descripcion, String tipoPublicacion) {
        super(titulo, autor, numeroPaginas, fechaPublicacion, descripcion);
        this.tipoPublicacion = tipoPublicacion;
    }

    public String getTipoPublicacion() {
        return tipoPublicacion;
    }

    public void setTipoPublicacion(String tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }


    public static List<Material> materiales = new ArrayList<>();
    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Se ha agregado el material correctamente.");
    }

    public  void eliminarMaterial(Material material){
        if (materiales.contains(material)){
            materiales.remove(material);
            System.out.println("Se ha eliminado el material correctamente.");
        }else {
            System.out.println("No se ha encontrado el material a Eliminar.");
        }
    }


}
