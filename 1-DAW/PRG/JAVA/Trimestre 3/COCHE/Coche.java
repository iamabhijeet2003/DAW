/**
 *
 * @author guivifra
 */
 public class Coche {

     private int numBastidor;
     private String matricula;
     private String marca;
     private String modelo;
     private String color;
     private double precio;
     boolean[] revisiones = new boolean[5];

    /**
     * Constructor general de la clase
     * @param numBastidor el número de bastidor
     * @param matricula la matrícula
     * @param marca la marca
     * @param modelo el modelo
     * @param color el color
     * @param precio el precio
     */
    public Coche(int numBastidor, String matricula, String marca, String modelo, String color, double precio) {
        this.numBastidor = numBastidor;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        for (int i = 0; i < revisiones.length; i++) {
             revisiones[i]=false;
            
        }
    }



    /**
     * Imprimimos el estado de las revisiones del coche
     */
    public void mostrarRevisiones() {
        for (int i = 0; i < revisiones.length; i++) {
            System.out.println("Revisión " + (i + 1) + "hecha: " + this.revisiones[i]);
        }
    }
    
    /**
     * Muestra los datos del coche
     */
    public void mostrarDatos(){
        String res="";
        res+= "Marca: " + getMarca()+"\n";
        res+= "Modelo: " + getModelo() + "\n";
        res+= "Color: " + getColor() + "\n";
        res+= "Matricula: " + getMatricula()+"\n";
        res+= "Bastidor: " + getNumBastidor() + "\n";
        res+= "Precio: " + getPrecio();
        System.out.println(res);
        mostrarRevisiones();
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    /**
     * Incrementa el precio en un porcentaje, indicado en tanto por 1
     * @param porct Porcentaje de incremento 
     */
    public void aumentarPorcentajePrecio(double porct){
        if (porct<0 || porct>1){
            System.out.println("El porcentaje debe de estar entre 0 i 1");
            return;
        }
        setPrecio(getPrecio() * (1+porct));
    }
    
    /**
     * Pasa la revisión indicada por numRev
     * @param numRev número de la revisión, entre 0 y el número máximo de revisiones
     */
    public void revisar(int numRev){
        if (numRev<0 || numRev>=revisiones.length){
            System.out.println("Número de revisión incorrecto");
            return;
        }
        
        revisiones[numRev]=true;
    }
    
    /**
     * Cuenta el número de revisiones realizadas
     * @return el número de revisiones
     */
    public int numRevision(){
        int i;
        for ( i = 0; i < revisiones.length; i++) {
            if (revisiones[i]==false)
                break;
        }
        return i;
    }
    
}
