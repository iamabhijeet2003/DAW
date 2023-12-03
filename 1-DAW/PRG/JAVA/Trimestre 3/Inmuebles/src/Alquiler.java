import java.util.ArrayList;
import java.util.Date;

public class Alquiler implements Calculos{
    private double precioAlquiler;
    private double rentaMensual;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<PagosAlquiler> pagosAlquiler = new ArrayList<>();



    public Alquiler(double precioAlquiler, Date fechaInicio, Date fechaFin) {
        this.precioAlquiler = precioAlquiler;
        this.rentaMensual = calcularComisionAlquiler(precioAlquiler)+precioAlquiler;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    private double calculaPrecio(double precioAlquiler){
        return calcularComisionAlquiler(precioAlquiler);
    }



    public void registrarPago(double monto, String fecha) {
        PagosAlquiler pago = new PagosAlquiler(monto, fecha);
        pagosAlquiler.add(pago);
    }


    @Override
    public String imprimirInformacion() {
        return null;
    }


    @Override
    public double calcularImpuesto(double precio) {
        return Calculos.super.calcularImpuesto(precio);
    }


    public void imprimirResumenAlquiler() {
        System.out.println("Resumen del Alquiler");
        System.out.println("Precio de Alquiler: " + precioAlquiler);
        System.out.println("Renta Mensual: " + rentaMensual);
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha de Fin: " + fechaFin);

        System.out.println("Pagos de Alquiler:");
        for (PagosAlquiler pago : pagosAlquiler) {
            System.out.println("- Monto: " + pago.getMonto());
            System.out.println("  Fecha: " + pago.getFecha());
        }
    }
}
