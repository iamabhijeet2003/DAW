import java.util.Arrays;
import java.util.Scanner;

/**
 * climograma
 */
public class climiograma {

    public static int menu() {
        int option;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("1− Castellà , 2 − Valencià , 3 − Anglés");
            System.out.println("Dis-me en quin idioma vols el diagrama");
            option = entrada.nextInt();
        }
        while (option!=1 && option!=2 && option!=3);
        return option;
    }
    public static int recuperaMax (int[] temperatures){
        int max = 0;
        for ( int i = 0; i<temperatures.length;i++){
            if (max<temperatures[i])
                max = temperatures[i];
        }
        return max;
    }


    public static void emplenaArrayH(String[][] arrStr, int[] temperatures, String[] mesos) {

        int max = recuperaMax(temperatures);

        for (int i = 0; i<mesos.length;i++ ){
            for ( int j = 0; j<=max; j++){
                if (i==0){
                    if (j==0)
                        arrStr[i][j]= "Temperatures";
                    else
                        arrStr[i][j]= Integer.toString(j);
                }
                if (j==0)
                    arrStr[i+1][j]=mesos[i];
                else{
                    if (temperatures[i]>=j)
                        arrStr[i+1][j]="*";
                }
            }
        }
    }
    public static void main(String[] args) {
        //int [] arrTemp = new int[12];
        int [] arrTemp = {2,14,13,15,17,21,24,26,22,17,15,14};
        int option =0;
        String[][] arrMesos = {
            {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"},
            {"gener", "febrer", "març", "abril", "maig", "juny", "juliol", "agost", "setembre", "octubre", "novembre", "desembre"},
            {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}};
            
            option = menu();
            
            String[][] arrClimiogramaH = new String [13][27];

            emplenaArrayH(arrClimiogramaH, arrTemp, arrMesos[option-1]);

            for (int i = 0; i<arrClimiogramaH.length;i++)
                System.out.println(Arrays.toString(arrClimiogramaH[i]));

        }

    
    





    
}

