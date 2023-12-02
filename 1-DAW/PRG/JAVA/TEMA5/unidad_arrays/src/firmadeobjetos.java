import java.util.Arrays;

import javax.sound.midi.Soundbank;
import java.applet.*;


public class firmadeobjetos {
    public static void main(String[] args) {

        String[] arrayDeFans = {"Luke","Han","Leia","Yoda","Kylo","Qui-Gon","Mando"};
        String[] arrayDeObjetos = {"4","2","2","5","1","3","2"};
        String[] arrayDeTiempos = {"0","0","0","0","0","0","0"};

        while (!todoACero(arrayDeObjetos)) {
            sumaDos(arrayDeObjetos,arrayDeTiempos);
            cambioDePosicion(arrayDeTiempos, "tiempos");
            cambioDePosicion(arrayDeFans, "nombres");
            cambioDePosicion(arrayDeObjetos, "objetos");

            System.out.println("Estado de la cola:     "+Arrays.toString(arrayDeFans));
            System.out.println("Elementos que restan:     "+Arrays.toString(arrayDeObjetos));
            System.out.println(Arrays.toString(arrayDeTiempos));

        }

        System.out.println("Cola vacio. YA NO QUEDAN OBJETOS PARA FIRMAR!!");

    }

    private static void sumaDos(String[] arrayDeObjetos, String[] arrayDeTiempos) {
        if (!arrayDeObjetos[0].equals("0")){
            for (int i = 0; i <arrayDeObjetos.length ; i++) {
                if (!arrayDeObjetos[i].equals("0"))
                    arrayDeTiempos[i] = Integer.toString (Integer.valueOf(arrayDeTiempos[i])+2);
            }
        }
    }
   

    public static void cambioDePosicion (String[] arrEntrada, String tipo){
        int valor = -1;
        if (tipo.equals("objetos"))
            valor = Integer.valueOf(arrEntrada[0]);
        String first = arrEntrada[0];
        for (int i = 0; i < arrEntrada.length-1; i++) {
            arrEntrada[i] = arrEntrada[i+1];
        }
        if (tipo.equals("nombres"))
            arrEntrada[arrEntrada.length-1]= first;
        else {
            if (tipo.equals("objetos")) {
                arrEntrada[arrEntrada.length - 1] = valor > 0 ? Integer.toString(valor - 1) : Integer.toString(valor);
            }
            else
                arrEntrada[arrEntrada.length - 1] = Integer.toString (Integer.valueOf(first));
        }
    }


    private static boolean todoACero(String[] arrayDeObjetos) {
        for (int i = 0; i < arrayDeObjetos.length; i++) {
            if (!arrayDeObjetos[i].equals("0"))
                    return false;
        }
        return true;
    }

    
}