import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    // static List<Material> materiales = new ArrayList<>();
    public static void main(String[] args) {

        Libro libro1 = new Libro("Aprende a programar ", "Sergi Moreno Sarrion", 333,"12-02-2023" , "Un manual de programacion para novatos","Digital", "1234567890", "Sergi");
        libro1.agregarMaterial(libro1);

        Revista revista1 = new Revista("FORBES-Millionaires","Forbes",120,"12-13-2014", "Los millonarios del España","Fisica","12","Negocio");
        revista1.agregarMaterial(revista1);

        Periodico periodico1 = new Periodico("Levante","Levante Valencia",10,"10-11-2023","Un periodico en Valenciano","papel","12","10-11-2023");
        periodico1.agregarMaterial(periodico1);

        Usuario usuario1 = new Usuario("Pedro", "Picapiedras");
        Usuario usuario2 = new Usuario("Pablo", "Picasso");
        Usuario usuario3 = new Usuario("Pablo", "Iglesias");


    }
    public static void prestarMaterial(Biblioteca biblioteca, Usuario usuario){

    }

}