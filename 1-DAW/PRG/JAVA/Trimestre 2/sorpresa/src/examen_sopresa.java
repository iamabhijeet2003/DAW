public class examen_sopresa {
    public static String encriptarMensaje(String mensaje, int[] posiciones){

        String[][] rotor = new String[3][1];
        rotor[0][0] = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
        rotor[1][0] = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
        rotor[2][0] = "BDFHJLCPRTXVZNYEIWGAKMUSQO";

        //para rotar
        for(int i=0;i < posiciones.length; i++) {
            int numRotaciones = posiciones[i];
            String rotorActual = rotor[i][0];
            rotorActual = rotorActual.substring(numRotaciones) + rotorActual.substring(0, numRotaciones);
            rotor[i][0] = rotorActual;
        }

        //para cifrar
        String mensajeCifrado ="";
        for(int i=0;i<mensaje.length();i++){
            char letra = mensaje.charAt(i);
            for(int j=0;j<3;j++){
                String rotorActual = rotor[j][0];
                int indiceLetra = rotorActual.indexOf(letra);
                if(indiceLetra != -1){
                    letra = rotorActual.charAt((indiceLetra + 13) % 26);
                    break;
                }
            }
            mensajeCifrado += letra;
        }

        return mensajeCifrado;

    }

    public static String desencriptarMensaje(String mensajeCifrado, int[] posiciones) {
        // Inicializar los rotores otra vez
        String[][] rotor = new String[3][1];
        rotor[0][0] = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
        rotor[1][0] = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
        rotor[2][0] = "BDFHJLCPRTXVZNYEIWGAKMUSQO";

        // Rotar rotores hacia atras
        for (int i = 0; i < posiciones.length; i++) {
            int numRotaciones = posiciones[i];
            String rotorActual = rotor[i][0];
            rotorActual = rotorActual.substring(26 - numRotaciones) + rotorActual.substring(0, 26 - numRotaciones);
            rotor[i][0] = rotorActual;
        }

        //para descifrar
        String mensajeDescifrado = "";
        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char letraCifrada = mensajeCifrado.charAt(i);
            for (int j = 0; j >= 0; j--) {
                String rotorActual = rotor[j][0];
                int indiceLetraCifrada = rotorActual.indexOf(letraCifrada);
                if (indiceLetraCifrada != -1) {
                    letraCifrada = rotorActual.charAt((indiceLetraCifrada + 13) % 26);
                    break;
                }
            }
            mensajeDescifrado += letraCifrada;
        }


        return mensajeDescifrado;
    }

    public static void main(String[] args){
            String mensaje = "ESTARE ATENT A CLASSE";
            int[] posiciones = {3, 6, 10};
            String mensajeCifrado = encriptarMensaje(mensaje, posiciones);
        System.out.println(mensajeCifrado);


        String mensajeDescifrado = desencriptarMensaje(mensajeCifrado, posiciones);
        System.out.println(mensajeDescifrado);
    }



}









