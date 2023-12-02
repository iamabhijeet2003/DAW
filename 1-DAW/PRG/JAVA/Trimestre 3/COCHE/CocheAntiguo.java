public class CocheAntiguo extends Coche2aMa{
    private String propietario_anterior;

    public CocheAntiguo(int numBastidor, String matricula, String marca, String modelo, String color, double precio, int kms, String propietario_anterior) {
        super(numBastidor, matricula, marca, modelo, color, precio, kms);
        this.propietario_anterior = propietario_anterior;
    }

    public String imprimirCocheAntiguo(){
        return super.imprimirCoche2aMano()+ " " +
                this.propietario_anterior;
    }

}
