import java.util.ArrayList;

public abstract class Inmueble implements Calculos{
    private String codigoCatastral;
    private double m2;
    private double precio;

    public Inmueble(String codigoCatastral, double m2, double precio) {
        this.codigoCatastral = codigoCatastral;
        this.m2 = m2;
        this.precio = precio;
    }

    public double calcularPrecioTotal() {
        return precio+calcularImpuesto(precio);
    }

    public String imprimirInformacion(){
        String salida = "Codigo Catastral : " + codigoCatastral + "\n" +
                        "Superficie (m2) : " + m2 + "\n" +
                        "Precio : "+ precio + "\n";
        salida += "Importe de Impuesto General(10%) : " + calcularImpuesto(precio) + "\n";
        salida += "Precio Total con impuestos : "+ calcularPrecioTotal() + "\n";

        return salida;
    }

    public void agregar(ArrayList<Inmueble> inmuebles){
        inmuebles.add(this);
    }


    public double getM2() {
        return m2;
    }


    public double getPrecio() {
        return precio;
    }



}
