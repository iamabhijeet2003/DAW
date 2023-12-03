import java.text.DecimalFormat;

public class Terrenos extends Inmueble implements Calculos{
    enum tipo{Regadio,Secano}
    private tipo tipoRiego;
    private boolean edificacion;
    private boolean riegoGoteo;

    public Terrenos(String codigoCatastral, double m2, double precio, tipo tipoRiego, boolean edificacion, boolean regadioPorGoteoDesplegable) {
        super(codigoCatastral, m2, precio);
        this.tipoRiego = tipoRiego;
        this.edificacion = edificacion;
        if(tipoRiego == tipo.Secano)
            this.riegoGoteo=false;
        else
            this.riegoGoteo=true;
    }

    public String edificacion(){
        if(edificacion)
            return " Si ";
        else
            return " No ";
    }

    public String riegoDeGoteo(){
        if(riegoGoteo)
            return " Si ";
        else
            return "No";
    }

    public double calcularComision(double precio) {
        return calcularComision(precio,0.03);
    }
    @Override
    public String imprimirInformacion() {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");

        double comision = calcularComision(getPrecio());
        double precioTotal = calcularPrecioTotal();
        double precioFinal = comision + precioTotal;

        String salida = "Tipo de Riego: " +tipoRiego + "\n" +
                        "Dispone de edificacion: " + edificacion() +"\n" +
                        "Riego por Goteo Desplegado : " + riegoDeGoteo() + "\n";
        salida += "Comision : " + decimalFormat.format(comision)+ "\n";
        salida += "Precio Final con comisión e impuestos (Precio+impuesto general (10%) + comision): " + decimalFormat.format(precioFinal) + "\n";

        return super.imprimirInformacion() + salida;
    }



}
