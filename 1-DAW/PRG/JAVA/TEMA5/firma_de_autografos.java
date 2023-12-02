public class firma_de_autografos {
    public static void main(String[] args) {

        String[] fans = {"Luke", "Han", "Leia", "Yoda", "Kylo", "Qui-Gon", "Mando"};
        int[] elements = {4, 2, 2, 5, 1, 3, 2};

        System.out.print("Estado de la cola:    [");

        for(int i=0;i<fans.length;i++){
            if(i==fans.length-1){
                System.out.print("'"+fans[i]+"'");
            }
            else{
                System.out.print("'"+fans[i]+"',");
            }

        }
        System.out.println("]");

        System.out.print("Elementos que quedan: [");
        for(int i=0;i<elements.length;i++){
            if(i==elements.length-1){
                System.out.print("    "+elements[i]+"    ");
            }
        }
        System.out.println(" ]");
    }
    




}
