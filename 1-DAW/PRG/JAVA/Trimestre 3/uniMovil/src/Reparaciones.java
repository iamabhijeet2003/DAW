public class Reparaciones implements ImpuestoVenta{
    private double horas;
    private double precioPorHora;

    public Reparaciones(double horas, double precioPorHora) {
        this.horas = horas;
        this.precioPorHora = precioPorHora;
    }


    public double calcularImpuesto(){
        return (this.horas * this.precioPorHora) * 0.1;
    }

    public double getHoras() {
        return horas;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String imprimirReparacion(){
        return "Numero horas : " + this.horas + "\n"
                + "Precio/hora : " + this.precioPorHora + "\n" +
                "Importe : " + (this.horas*this.precioPorHora) + "\n" +
                "Total : " + ((this.horas*this.precioPorHora) + calcularImpuesto());
    }
}
