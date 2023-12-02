public class Coche2aMa extends Coche{
    private int kms;

    public Coche2aMa(int numBastidor, String matricula, String marca, String modelo, String color, double precio, int kms) {
        super(numBastidor, matricula, marca, modelo, color, precio);
        this.kms = kms;
    }



    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public String imprimirCoche2aMano(){
        return super.getNumBastidor() + " " +
                super.getMatricula()+ " " +
                super.getMarca()+ " " +
                super.getModelo()+ " " +
                super.getColor()+ " " +
                super.getPrecio()+ " " +
                this.kms + " " ;
    }
}
