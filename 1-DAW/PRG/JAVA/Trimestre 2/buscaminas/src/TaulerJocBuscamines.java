
import java.util.function.Consumer;

public class TaulerJocBuscamines {

    Casilla [][] caselles;
    int numFiles;
    int numColumnes;
    int numMines;

    int numCasellesObertes;
    boolean jocAcabat;

    private Consumer<Casilla[]> eventPartidaPerduda;
    private Consumer<Casilla[]> eventPartidaGuanyada;

    private Consumer<Casilla> eventCasellaOberta;

    public TaulerJocBuscamines(int numFilesIn, int numColumnesIn, int numMinesIn) {

        inicialitzarCaselles();

    }

    public void inicialitzarCaselles(){

        generarMines();
    }

    private void generarMines(){

        actualitzarNumeroMinesAlVoltant();
    }

    public void imprimirTauler() {

    }

    private void imprimirPistes() {

    }


    private void actualitzarNumeroMinesAlVoltant(){

    }

    private int calculaNumMines(int fila , int col){

        return numMines;
    }

    public static void main(String[] args) {
        TaulerJocBuscamines tauler=new TaulerJocBuscamines(5, 5, 4);
        tauler.imprimirTauler();
        System.out.println("---");
        tauler.imprimirPistes();
    }

    Casilla [] obtenerCasillasAlVoltante(int fila, int col){

        return obtenerCasillasAlVoltante(0, 0);
    }

    Casilla[] obtenirCasellesAmbMines() {

        return obtenirCasellesAmbMines();
    }

    public void seleccionarCasella(int posFila, int posColumna) {
        eventCasellaOberta.accept(caselles[posFila][posColumna]);
        if (caselles[posFila][posColumna].esMina()) {
            eventPartidaPerduda.accept(obtenirCasellesAmbMines());
        }else if (caselles[posFila][posColumna].getNumMinesAlVoltant()==0){
            marcarCasellaOberta(posFila, posColumna);
            Casilla[] casellesAlVoltant=obtenerCasillasAlVoltante(posFila, posColumna);
            for(Casilla casella: casellesAlVoltant){
                if (!casella.estaOberta()){
                    seleccionarCasella(casella.fila, casella.col);
                }
            }
        }else{
            marcarCasellaOberta(posFila, posColumna);
        }
        if (partidaGuanyada()){
            eventPartidaGuanyada.accept(obtenirCasellesAmbMines());
        }
    }

    void marcarCasellaOberta(int posFila, int posColumna){
        if (!caselles[posFila][posColumna].estaOberta()){
            numCasellesObertes++;
            caselles[posFila][posColumna].setOberta(true);
        }
    }

    boolean partidaGuanyada(){

        return numCasellesObertes>=(numFiles*numColumnes)-numMines;
    }

    public void setEventPartidaPerduda(Consumer<Casilla[]> eventPartidaPerduda) {
        this.eventPartidaPerduda = eventPartidaPerduda;
    }

    public void setEventCasellaOberta(Consumer<Casilla> eventCasellaOberta) {
        this.eventCasellaOberta = eventCasellaOberta;
    }

    public void setEventPartidaGuanyada(Consumer<Casilla[]> eventPartidaGuanyada) {
        this.eventPartidaGuanyada = eventPartidaGuanyada;
    }


}
