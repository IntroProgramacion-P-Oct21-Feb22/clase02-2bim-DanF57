/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        //Formas de declarar arreglos
        // arreglo de tipo entero
        int[] arreglo1 = new int[5];

        // arreglo de tipo entero
        int[] arreglo2;
        arreglo2 = new int[5];

        // arreglo de tipo entero
        int[] arreglo3 = {5, 10, 15, 20, 25};
        System.out.println(arreglo3[3]);

        // arreglo de doubles
        double[] arreglo4 = {10.1, 10.2, 10.3};

        //arreglo de cadenas
        String[] arreglo5 = {"Hola", "Bien", "Adios", "Mal"};
    }

}
