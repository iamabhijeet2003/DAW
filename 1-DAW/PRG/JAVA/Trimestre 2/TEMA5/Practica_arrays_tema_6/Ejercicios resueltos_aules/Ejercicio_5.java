public class Ejercicio_5 {
    public static void main(String[] args) {
        final int DIAS = 30;
        final int HORAS = 4;
        float[][] temperaturas;
        temperaturas = new float[DIAS][HORAS];
        int[] horas = {0, 6, 12, 18};
        int dia = 0;
        int opcio;
        do {
            do {
                dia = Leer.leerEntero("Dime el dia del que quieres introducir las temperaturas (0 para terminar): ");
            } while(dia<1 || dia >30);

            for (int i = 0; i < HORAS; i++) {
                temperaturas[dia-1][i] = Leer.leerFloat("Dime la temperatura de las" + horas[i] + "horas");
            }
        } while (dia != 0);

        do {
            System.out.println("1. Temperatura media de un dia");
            System.out.println("2. Temperatura media de una hora");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Terminar");
            opcio = Leer.leerEntero("Elige una opción: ");

            float media = 0;

            switch (opcio) {
                case 1:    
                    do {
                        dia = Leer.leerEntero("Dime de que dia quieres calcular la temperatura media: ");
                    } while(dia<1 || dia >30);

                    for (int i = 0; i < HORAS; i++) {
                        media += temperaturas[dia-1][i];
                    }

                    System.out.printf("La temperatura media del dia %d es %4.2f ºC\n",dia,media/HORAS);

                    break;
                case 2:
                    do {
                        dia = Leer.leerEntero("Dime de que hora quieres calcular la temperatura media: ");
                    } while(dia<1 || dia >30);

                    for (int i = 0; i < DIAS; i++) {
                        media += temperaturas[i][dia/6];
                    }

                    System.out.printf("La temperatura media de las %d horas es %4.2f ºC\n",dia,media/DIAS);

                    break;
                case 3:
                    for (int i = 0; i < DIAS; i++) {
                        for (int j = 0; j < HORAS; j++){
                            media += temperaturas[i][j];
                        }
                    }

                    System.out.printf("La temperatura media del dia %d es %4.2f ºC\n",dia,media/(DIAS*HORAS));
            }
        } while (opcio >= 4);
    }
}
