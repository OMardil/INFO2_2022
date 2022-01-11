/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1_p4;

import java.text.NumberFormat;
import java.util.*;

/**
 *
 * @author Omar Eduardo Acosta Ramos
 */
public class Act1_p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double descuento = 0;
        double precioLista = 0;
        double precioFinal = 0;
        double precioMensualidad = 0;
        int cantidadMensualidades = 0;
        int continuar = 1; // 1 = si continuar
        int contadorVentas = 0;
        int input;

        //Format $XXX,XXX.XX
        //example = 100000 -> $100,000.00
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

        while (continuar == 1) {
            //limpiar todas las variables que cambian por cada captura nueva
            descuento = 0;
            precioLista = 0;
            precioFinal = 0;
            precioMensualidad = 0;
            cantidadMensualidades = 0;

            //Solicitar los datos a carro
            System.out.println("¿Qué carro desea comprar?");
            System.out.println("1. Coche básico, contado.");
            System.out.println("2. Coche básico, a crédito.");
            System.out.println("3. Coche equipado, contado.");
            System.out.println("4. Coche equipado, a crédito.");

            System.out.print("Seleccione una opción: ");
            input = s1.nextInt();
            //Validate option is correct
            if (input < 0 || input > 4) {
                System.out.println("-------------------------------");
                System.out.println("ERROR: Opción incorrecta. Vuelva a intentar");
                System.out.println("-------------------------------");
                continue;
            }

            //Solicitar el precio del carro
            System.out.print("¿Cuál es el precio del coche?: ");
            precioLista = s1.nextDouble();

            //Calcular el descuento y las mensualidades
            switch (input) {
                case 1:
                    descuento = -10;
                    cantidadMensualidades = 1;
                    break;
                case 2:
                case 4:
                    descuento = +24;
                    cantidadMensualidades = 24;
                    break;
                case 3:
                    descuento = -15;
                    cantidadMensualidades = 1;
                    break;
            }

            precioFinal = (100 + descuento) / 100 * precioLista;
            precioMensualidad = precioFinal / cantidadMensualidades;

            System.out.println("-------------------------------");
            System.out.println("Precio de Lista: " + formatter.format(precioLista));
            System.out.println("Precio Final: " + formatter.format(precioFinal));
            System.out.println("Mensualidad: " + formatter.format(precioMensualidad));
            System.out.println("Cantidad de mensualidades: " + cantidadMensualidades);

            //Continuar capturando mas carros?
            System.out.println("-------------------------------");
            System.out.println("Desea continuar?");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Elija una opción: ");
            input = s1.nextInt();
            System.out.println("-------------------------------");

            if (input == 1) {
                continuar = 1;
            } else {
                continuar = 0;
            }

            contadorVentas++;

        }

        System.out.println();
        System.out.println("Total de ventas: " + contadorVentas);
    }

}
