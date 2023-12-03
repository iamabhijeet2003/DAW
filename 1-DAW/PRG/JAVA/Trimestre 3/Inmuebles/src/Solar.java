import java.text.DecimalFormat;
import java.util.ArrayList;

public class Solar extends Inmueble implements Calculos{
    enum tipo{suelo_Residencial,suelo_Industrial};
    private tipo tipoSuelo;
    private int anioRevisionCatastral;
    private boolean cargasPendientes;

    public Solar(String codigoCatastral, double m2, double precio, tipo tipoSuelo, int anioRevisionCatastral, boolean cargasPendientes) {
        super(codigoCatastral, m2, precio);
        this.tipoSuelo = tipoSuelo;
        this.anioRevisionCatastral = anioRevisionCatastral;
        this.cargasPendientes = cargasPendientes;
    }


    public double calcularComision(double precio) {

        if(getM2()>300){
            return calcularComision(precio,0.07);
        }else {
            return calcularComision(precio,0.03);
        }

    }


    public String cargaPendiente(){
        if (cargasPendientes){
            return " Si ";
        }
        else
            return "No ";
    }


    @Override
    public String imprimirInformacion() {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        double comision = calcularComision(getPrecio());
        double precioTotal = calcularPrecioTotal();
        double precioFinal = comision + precioTotal;

        String salida = "Tipo de Suelo : "  + tipoSuelo + "\n" +
                        "Año de Revision Catastral : " + anioRevisionCatastral + "\n" +
                        "Cargas pendientes : " + cargaPendiente()+ "\n";
        salida += "Comision : " + decimalFormat.format(comision)+ "\n";
        salida += "Precio Final con comisión e impuestos (Precio+impuesto general (10%) + comision): " + decimalFormat.format(precioFinal) + "\n";
        return super.imprimirInformacion() + salida;
    }
}
