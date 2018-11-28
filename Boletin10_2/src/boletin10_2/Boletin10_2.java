/*
Programa o exercicio anterior para xogar contra o ordenador. 
Para eso, o ordenador xenera un número aleatorio, entre 1 e 50.

Este programa dará as seguintes pistas sobre lonxe que esté de adivinar o número:
    Se a distancia entre o número a adivinar e o tecleado é maior de 20 “ moi lonxe “
    Entre 10 e 20 , ambos incluidos, lonxe
    Maior de 10 e menor de 5 preto
    Menor ou igual de 5 moi preto .    

 */
package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//  Para conseguir un entero, quitamos los decimales usando la clase Math.floor()
//  FORMULA para conseguir un número entero entre M y N con M menor que N y ambos incluídos:
//  int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.
        //variables
        int numAdivinar = (int) Math.floor(Math.random() * (50 - 1 + 1) + 1);
        int numIntentos;
        int numIntroducido;

        //bucle que pide el numero de intentos, no puede ser 0
        JOptionPane.showMessageDialog(null, "ADIVINA EL NUMERO \n(Entre 1 y 50)");
        do {
            //guarda el numero de intentos
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog(
                    "¿Cuantos intentos necesitas? "));
        } while (numIntentos <= 0);

        // bucle que cuenta el numero de intentos
        for (int i = 1; i <= numIntentos; i++) {
            if (i == numIntentos) {
                JOptionPane.showMessageDialog(null, "Te queda una ultima oportunidad");
            }
            //mensaje que muestre el numero de intento
            JOptionPane.showMessageDialog(null, "Es tu oportunidad numero " + i);

            //bucle que no deja introducir un numero que no este entre el 1 y 50
            do {
                numIntroducido = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero crees que es? "));

            } while ((numIntroducido < 1) || (numIntroducido > 50));

            //el numero del jugador es mayor que el numero de la maquina
            if (numIntroducido > numAdivinar) {
                //el numero se aleja 20 puestos
                if (((numIntroducido - numAdivinar) >= 20) || ((numAdivinar - numIntroducido) >= 20)) {
                    JOptionPane.showMessageDialog(null, "ESTAS MUY LEJOS \n El numero es menor");
                    //el numero se aleja entre 20 y 10 puestos
                } else if ((((numIntroducido - numAdivinar) >= 10) || ((numAdivinar - numIntroducido) >= 10))
                        && (((numIntroducido - numAdivinar) < 20) || ((numAdivinar - numIntroducido) < 20))) {
                    JOptionPane.showMessageDialog(null, "ESTAS LEJOS \n El numero es menor");
                    //el numero se aleja entre 10 y 5 puetos
                } else if ((((numIntroducido - numAdivinar) < 10) || ((numAdivinar - numIntroducido) < 10))
                        && (((numIntroducido - numAdivinar) >= 5) || ((numAdivinar - numIntroducido) >= 5))) {
                    JOptionPane.showMessageDialog(null, "ESTAS CERCA \n El numero es menor");
                    //el numero se aleja menos de 5 puestos
                } else if (((numIntroducido - numAdivinar) <= 5) || ((numAdivinar - numIntroducido) <= 5)) {
                    JOptionPane.showMessageDialog(null, "ESTAS MUY CERCA, casi lo tienes \n El numero es menor");
                }

                // El numero que introduce el jugador es menor que la maquina
            } else if (numIntroducido < numAdivinar) {
                //el numero se aleja 20 puestos
                if (((numIntroducido - numAdivinar) >= 20) || ((numAdivinar - numIntroducido) >= 20)) {
                    JOptionPane.showMessageDialog(null, "ESTAS MUY LEJOS \n El numero es mayor");
                    //el numero se aleja entre 20 y 10 puestos
                } else if ((((numIntroducido - numAdivinar) >= 10) || ((numAdivinar - numIntroducido) >= 10))
                        && (((numIntroducido - numAdivinar) < 20) || ((numAdivinar - numIntroducido) < 20))) {
                    JOptionPane.showMessageDialog(null, "ESTAS LEJOS \n El numero es mayor");
                    //el numero se aleja entre 10 y 5 puetos
                } else if ((((numIntroducido - numAdivinar) < 10) || ((numAdivinar - numIntroducido) < 10))
                        && (((numIntroducido - numAdivinar) >= 5) || ((numAdivinar - numIntroducido) >= 5))) {
                    JOptionPane.showMessageDialog(null, "ESTAS CERCA \n El numero es mayor");
                    //el numero se aleja menos de 5 puesto
                } else if (((numIntroducido - numAdivinar) <= 5) || ((numAdivinar - numIntroducido) <= 5)) {
                    JOptionPane.showMessageDialog(null, "ESTAS MUY CERCA, casi lo tienes \n El numero es mayor");

                }

            } else if (numIntroducido == numAdivinar) {
                JOptionPane.showMessageDialog(null, "HAS ACERTADO!!\n TU GANAS \nEl numero era " + numAdivinar);
                i = numIntentos;

            }
            if ((i == numIntentos) && (numIntroducido != numIntentos)) {
                JOptionPane.showMessageDialog(null, "OHHH PERDISTE \n El numero era " + numAdivinar);
            }
        }//cierre bucle for
    }//main
}//clase
