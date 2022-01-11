/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1_p6;

import static java.lang.Math.ceil;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Omar Eduardo Acosta Ramos
 */
public class Act1_p6 {

    /**
     * @param args the command line arguments
     */
    
    public static final double PALABRAS_POR_HOJA = 400;
    public static final int HOJAS_BASE = 3;
    public static final int HOJAS_COMPLEMENTARIA = 10;
    
    public static final double TARIFA_COMPLEMENTARIA = 25;
    public static final double TARIFA_BASE = 120;
    public static final double TARIFA_POR_HOJA = 30;
    
    public static void main(String[] args) {

        int palabras;
        int hojas;
        double tarifaBase = 0;
        double tarifaHojas = 0 ;
        double tarifaComplementaria = 0;
        double precioFinal = 0;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

        Scanner s1 = new Scanner(System.in);

        System.out.print("¿De cuántas palabras es el proyecto?: ");
        palabras = s1.nextInt();
        
        //NOTA: la división palabras/PALABRAS_POR_HOJA debe ser una división
        //      con doubles.
        hojas = (int)Math.ceil(palabras / PALABRAS_POR_HOJA);
            
        if (hojas < 0) {
            System.out.println("ERROR: Valor de entrada inválido.");
        } else {

            System.out.println("----------------------");
            tarifaBase = TARIFA_BASE;
                       
            if (hojas > HOJAS_BASE) {
                tarifaHojas = (hojas - HOJAS_BASE) * TARIFA_POR_HOJA;
            }
            
            if (hojas > HOJAS_COMPLEMENTARIA) {
                tarifaComplementaria = TARIFA_COMPLEMENTARIA;
            }
            
            precioFinal = tarifaBase + tarifaHojas + tarifaComplementaria;
            
            System.out.println("Hojas " + hojas);
            System.out.println("Tarifa base: " + formatter.format(tarifaBase));
            System.out.println("Tarifa hojas: " + formatter.format(tarifaHojas));
            System.out.println("Tarifa complementaria: " + formatter.format(tarifaComplementaria));
            System.out.println("----------------------");            
            System.out.println("Precio Final: " + formatter.format(precioFinal));
            System.out.println("----------------------");
            
        }

    }

}
