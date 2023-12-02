public class Casilla {

    public int fila;
    public int col;

    boolean mina;
    boolean oberta;

    int num_mines;


    public Casilla(int posFila, int posColumna) {
        fila = posFila;
        col = posColumna;
    }

    public void posarMina(){
        mina = true;
    }

    public void numMines(int num){
        num_mines = num;
    }
    public int getNumMinesAlVoltant() {

        return num_mines;
    }
    public void setNumMinesAlVoltant(int numMinesAlVoltant) {

        num_mines = numMinesAlVoltant;
    }



    public boolean esMina() {
        return mina;
    }
    public void ponMina(boolean minaIn) {
        mina = minaIn;
    }

    public boolean estaOberta(){
        return oberta;
    }
    
    public void setOberta(boolean obertaIn)
    {
        oberta=obertaIn;
    }

}
