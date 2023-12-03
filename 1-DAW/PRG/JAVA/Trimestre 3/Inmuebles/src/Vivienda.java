import java.text.DecimalFormat;


public class Vivienda extends Inmueble implements Calculos{
    private int numHabitaciones;
    private int numBanos;
    enum estado{obra_nueva,buen_estado,para_reformar}
    private estado estadoDeVivienda;


    public Vivienda(String codigoCatastral, double m2, double precio, int numHabitaciones, int numBanos, estado estadoDeVivienda) {
        super(codigoCatastral, m2, precio);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.estadoDeVivienda = estadoDeVivienda;
    }


    public double calcularComision(double precio){
        if(getPrecio()>100000){
            return calcularComision(precio,0.05);
        }else {
            return calcularComision(precio,0.03);
        }
    }

    @Override
    public String imprimirInformacion() {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        double comision = calcularComision(getPrecio());
        double precioTotal = calcularPrecioTotal();
        double precioFinal = comision + precioTotal;

        String salida = "Numero de Habitaciones : "+numHabitaciones + "\n" +
                        "Numero de baños : " + numBanos + "\n" +
                        "Estado de la Vivienda : " + estadoDeVivienda + "\n";
        salida += "Comision : " + decimalFormat.format(comision)+ "\n";
        salida += "Precio Final con comisión e impuestos (Precio+impuesto general (10%) + comision): " + decimalFormat.format(precioFinal) + "\n";
        return super.imprimirInformacion() + salida;
    }

}
