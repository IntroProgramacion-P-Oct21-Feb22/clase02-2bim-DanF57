/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // arreglo de tipo entero
        int[] arreglo1 = new int[5];
        
        int[] arregloenteros = {1, 2, 3, 4, 5, 6};

        // arreglo de tipo double
        double[] arreglo2 = new double[5];
        
        double[] arreglodoubles = {10.10, 15.4, 16.5, 14.5, 8.5};

        // arreglo de tipo char
        char[] arreglo3 = new char[5];

        // arreglo de tipo String
        String[] arreglo4 = new String[5];
        
        String[] arreglostring = {"Hola", "Adios", "si"};
        // arreglo de tipo boleano
        boolean[] arreglo5 = new boolean[5];
       
    }

}
