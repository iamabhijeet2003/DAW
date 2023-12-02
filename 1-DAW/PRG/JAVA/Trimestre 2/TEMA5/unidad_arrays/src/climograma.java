import java.util.Arrays;
import java.util.Scanner;

public class climograma {
    public static void main(String[] args) {

        String[][] meses = {{"Temperaturas : ","Temperatures : ","Temperatures : "},
                            {"Enero :      ", "Gener :       ", "January :     "},
                            {"Febrero :    ", "Febrer :      ", "February :    "}, 
                            {"Marzo :      ", "Març :        ", "March :       "}, 
                            {"Abril :      ", "Abril :       ", "April :       "}, 
                            {"Mayo :       ", "Maig :        ", "May :         "}, 
                            {"Junio :      ", "Juny :        ", "June :        "}, 
                            {"Julio :      ", "Juliol :      ", "July :        "}, 
                            {"Agosto :     ", "Agost :       ", "August :      "}, 
                            {"Septiembre : ", "Septembre :   ", "September :   "}, 
                            {"Octubre :    ", "Octuber :     ", "October :     "}, 
                            {"Noviembre :  ", "Novembre :    ", "November :    "}, 
                            {"Diciembre :  ", "Decembre :    ", "December :    "}};
        
        String[][] asterisco = new String[meses.length][26];
        int[] temperatures = {12, 14, 13, 15, 17, 21, 24, 26, 22, 17, 15, 14};
        int maxTemp=0;
                        
        for (int i=0;i<temperatures.length;i++) {
            int temp = temperatures[i];
            if(temp>maxTemp){
                maxTemp=temp;
            }
        }

        System.out.println("1= Castellano, 2= Valenciano, 3=Inglés");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digame en que idioma quieres los datos: ");
        int eleccionIdioma = entrada.nextInt();
            
            for(int i=0;i<meses.length;i++){
                System.out.print(meses[i][eleccionIdioma-1]);

                if(i !=0){
                    for(int j=0;j<temperatures[i-1];j++){
                    System.out.print("  *");
                    }
                }else{
                    for(int k=1;k<10;k++){
                        System.out.print( k + "  ");
                    }
                    for(int l=10;l<maxTemp+1;l++){
                        System.out.print(l+ " ");
                    }
                }
                
                System.out.println();
            }

            System.out.println();
        String[][] mesesVertical = {{"   Ene   ", "  Gen   ", "  Jan   "},
                                    {" Feb   ", " Feb   ", " Feb   "}, 
                                    {" Mar   ", " Mar   ", " Mar   "}, 
                                    {" Abr   ", " Abr   ", " Apr   "}, 
                                    {" Jun   ", " Jun   ", " Jun   "}, 
                                    {" Jul   ", " Jul   ", " Jul   "}, 
                                    {" Ago   ", " Ago   ", " Aug   "}, 
                                    {" Sep   ", " Sep   ", " Sep   "}, 
                                    {"Oct   ", "Oct   ", "Oct   "}, 
                                    {"Nov   ", "Nov   ", "Nov   "}, 
                                    {"Dic   ", "Dec   ", "Dec   "}
                                    };
        
        
        for (int i = maxTemp; i >= 0; i--) {
            
            if(i<10){
                System.out.print(" "+i);
            }
            else{
                System.out.print(i+"");
            }


            //System.out.print(i+"  ");
            for (int j = 0; j < temperatures.length; j++) {
                int temp = temperatures[j];
                if (temp >= i) {
                    System.out.print("   *  ");
                } else {
                    System.out.print("      ");
                }
                
            }
            
            System.out.println();
            //System.out.print(mesesVertical[i][eleccionIdioma-1]);
        }             

        for(int i=0;i<mesesVertical.length;i++){
            System.out.print(mesesVertical[i][eleccionIdioma-1]);
        }
        System.out.println();
           
        /* 
        for(int i=maxTemp;i>=0;i--){
            for (int temp : temperatures) {
                if (temp >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            System.out.print(mesesVertical[i][eleccionIdioma-1]);
        }
        System.out.println();
        */
    }
}
