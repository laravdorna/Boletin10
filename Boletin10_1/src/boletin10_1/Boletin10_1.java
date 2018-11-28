/*
 * Codifica 	un programa que permita o seguinte xogo para adiviñar un número:
O primeiro xogador teclea ( utilizando a clase JoptionPane ), 
un número a adiviñar ( entre 1 e 50 ) 
e o número máximo de intentos que ten o segundo xogador para dar con el .
O programa irá sacando por pantaia mensaxes que orienten o segundo xogador sobre 
se o número tecleado e maior ou menor que o número a adiviñar . 
Fai o programa repetitivo.

 */
package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //variables
        int numAdivinar;
        int numIntentos;
        int numIntroducido;

        //bucle que pida numero si no esta entre 1 y 50
        do {
            //pide por pantalla que introduzca numero y se guarda en variable 
            numAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, Indique el numero a adivinar :"
                    + "\n (tiene que estar entre 1 y 50)  "));

        } while (numAdivinar < 1 || numAdivinar > 50);

        //bucle para que el numero de intentos no sea 0 o negativo
        do {
            //pedir numero de intentos en los que el jugador 2 tiene que adivinar
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Ahora introduce el numero de intentos en "
                    + "los cuales el Jugador 2 tendrá que adivinar el numero:"));
        } while (numIntentos <= 0);

        //bucle que cuente el numero de intentos del jugador 2
        for (int i = 1; i <= numIntentos; i++) {
            if (i == numIntentos) {
                JOptionPane.showMessageDialog(null, "Jugador 2, ES TU ULTIMA OPORTUNIDAD");
            }

            //mensaje que muestre el numero de intento
            JOptionPane.showMessageDialog(null, "Jugador 2, es tu oportunidad numero " + i);
            //bucle para introducir el numero entre 1 y 50
            do {
                //pide por pantalla que introduzca numero y se guarda en variable 
                numIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2,¿Que numero crees que es?"
                        + "\n (tiene que estar entre 1 y 50)"));
            } while (numIntroducido < 1 || numIntroducido > 50);

            //comparar numero jugador 1 con numero jugador 2
            if (numAdivinar == numIntroducido) {
                JOptionPane.showMessageDialog(null, "Jugador 2, HAS GANADO!!"
                        + "\nEl numero era el " + numAdivinar);
                i = numIntentos;

            } else if (numAdivinar > numIntroducido) {
                JOptionPane.showMessageDialog(null, "El numero es mayor de " + numIntroducido);
            } else if (numAdivinar < numIntroducido) {
                JOptionPane.showMessageDialog(null, "El numero es menor de " + numIntroducido);
            }
            //pierde
            if (numAdivinar != numIntroducido && numIntentos == i) {
                JOptionPane.showMessageDialog(null, "Jugador 2:\n HAS PERDIDO \n El numero era el  " + numAdivinar);
            }

        }//cierra el for

    }

}
