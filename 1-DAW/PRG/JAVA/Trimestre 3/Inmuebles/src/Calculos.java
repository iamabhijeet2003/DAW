import java.util.Date;

public interface Calculos {

    public default double calcularImpuesto(double precio){
        return precio*0.1;
    }

    public default double calcularComision(double precio, double comision){
        return (precio*comision);
    }
    public String imprimirInformacion();

    public default double calcularComisionAlquiler(double precioAlquiler) {
        if (precioAlquiler > 500) {
            return calcularComision(precioAlquiler, 0.05);
        } else {
            return calcularComision(precioAlquiler, 0.03);
        }
    }



}


