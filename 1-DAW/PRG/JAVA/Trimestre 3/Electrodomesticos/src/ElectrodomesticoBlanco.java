import java.util.ArrayList;

public abstract class ElectrodomesticoBlanco extends Electrodomestico{
    private  int voltage;
    private int capacidad;

    public ElectrodomesticoBlanco(String nombre, String marca, String modelo, double precio,
                                  String descripcion, int voltage, int capacidad) {
                                  super(nombre, marca, modelo, precio, descripcion);
                                    this.voltage = voltage;
                                    this.capacidad = capacidad;
    }

    public void agregar (ArrayList<Electrodomestico> almacen){
        almacen.add(this);
    }


    public void eliminar(ArrayList<Electrodomestico> almacen){
        almacen.remove(this);
    }


    public Electrodomestico buscar(ArrayList<Electrodomestico> almacen){
        if(almacen.contains(this))
            return this;
        else
            return this;
    }

    @Override
    public String imprimir(){
        String salida = super.imprimir();
        salida += "Voltage     : "+ this.voltage + "\n" + "Capacidad   : " + this.capacidad + "\n";
        return salida;

    }

}
