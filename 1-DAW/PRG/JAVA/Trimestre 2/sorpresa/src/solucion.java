import java.util.Arrays;

public class solucion {
    public static void main(String[] args) {

        String [][] rotors = new String [3][1];

        rotors[0]= new String[]{"EKMFLGDQVZNTOWYHXUSPAIBRCJ"};
        rotors[1]= new String[]{"AJDKSIRUXBLHWTMCQGZNPYFVOE"};
        rotors[2]= new String[]{"BDFHJLCPRTXVZNYEIWGAKMUSQO"};

        rotors[0]= giraRotor(rotors[0],3);
        rotors[1]= giraRotor(rotors[1],6);
        rotors[2]= giraRotor(rotors[2],10);

        String frase ="Estare mes atent a classe";
        String encript = encripta (frase.toUpperCase(),rotors[0]);
        encript = encripta (encript.toUpperCase(),rotors[1]);
        encript = encripta (encript.toUpperCase(),rotors[2]);

        System.out.println(encript);
        String desencript = desencripta (encript.toUpperCase(), rotors[2]);
        desencript = desencripta (desencript.toUpperCase(), rotors[1]);
        desencript = desencripta (desencript.toUpperCase(), rotors[0]);

        rotors[0]= giraRotor(rotors[0],-3);
        rotors[1]= giraRotor(rotors[1],-6);
        rotors[2]= giraRotor(rotors[2],-10);

        System.out.println(desencript);

    }

    private static String desencripta(String frase, String[] rotor)
        {
            String Abcdri = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String fraseDesEncript = "";

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) !=' ')
                    fraseDesEncript += Abcdri.charAt(rotor[0].indexOf(frase.charAt(i)));
                else
                    fraseDesEncript += " ";
            }
            return  fraseDesEncript;
        }


    private static String encripta(String frase, String[] rotor) {
        String Abcdri = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String fraseEncript = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) !=' ')
                fraseEncript += rotor[0].charAt(Abcdri.indexOf(frase.charAt(i)));
            else
                fraseEncript += " ";
        }
        return  fraseEncript;
    }

    private  static String[] giraRotor(String[] rotor, int i) {
        if (i > 0)
            return new String[]{rotor[0].substring(i, rotor[0].length()) + rotor[0].substring(0, i)};
        else
            return new String[]{rotor[0].substring(rotor[0].length() + i, rotor[0].length()) + rotor[0].substring(0,rotor[0].length() + i)};
    }

}