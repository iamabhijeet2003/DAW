/*
 Realiza un programa que calcule i escriba la suma y el producto de los 10 primeros números naturales.
 */
public class Ej_09 {
    public static void main(String[] args) {
        int suma=0;
        int producto=1;
        System.out.println("los primeros 10 numeros naturales son : ");
        for(int i=1;i<=10;i++){
            System.out.println(i);
            suma += i;
            producto *= i;
        }
        System.out.println("La suma de los primeros 10 numeros naturales es : "+ suma);
        System.out.println("El producto de los primeros 10 numeros naturales es : "+ producto);
    }
}
