import java.util.ArrayList;

public abstract class ElectrodomesticoBlanco extends Electrodomestico {
    private int voltaje;
    private int capacidad;

    public ElectrodomesticoBlanco(String nombre, String marca, String modelo,
                                  double precio, String descripcion,
                                  int voltaje, int capacidad) {
        super(nombre, marca, modelo, precio, descripcion);
        this.voltaje = voltaje;
        this.capacidad = capacidad;
    }

    public void agregar (ArrayList<Electrodomestico> almacen){
        almacen.add(this);
    }

    public void eliminar (ArrayList<Electrodomestico> almacen){
        almacen.remove(this);
    }

    public Electrodomestico buscar (ArrayList<Electrodomestico> almacen){
        if (almacen.contains(this))
            return this;
        else
            return null;
    }

    @Override
    public String imprimir() {
        String salida = super.imprimir();
        salida += "Voltaje: " + this.voltaje + " capacidad: " + this.capacidad + " \n";
        return salida;
    }
}
