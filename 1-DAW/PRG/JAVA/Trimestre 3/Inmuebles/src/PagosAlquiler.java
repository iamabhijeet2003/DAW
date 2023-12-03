import java.util.ArrayList;
import java.util.Date;

public class PagosAlquiler {
    private double monto;
    private String fecha;

    public PagosAlquiler(double monto, String fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }


    public String getFecha() {
        return fecha;
    }


}
