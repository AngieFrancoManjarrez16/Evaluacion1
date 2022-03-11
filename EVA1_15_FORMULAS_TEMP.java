/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author AngieFrMa
 */
public class EVA1_15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("introducir los grados centigrados: ");
        double celsius = input.nextDouble();
        double fahrenhert = FormulasTemp.convertirCaF(celsius);
        double kelvin = FormulasTemp.convertirCaK(celsius);
        System.out.println(celsius + "°C, " + fahrenhert + "°F, " + kelvin + "°K ");
        System.out.println(fahrenhert + "°F, " + kelvin + "°K ");
        System.out.println(kelvin + "°K, " + fahrenhert + "°F");

    }
    
}

class FormulasTemp{
    public static double convertirCaF(double celsius){
        return celsius * 1.8 + 32.0;
    }
    public static double convertirFaC(double fahrenhert){
        return (fahrenhert = 32.0) / 1.8;
    }
    public static double convertirFaK(double fahrenhert){
        return 5/9 * (fahrenhert = 32.0) + 273.15;
    }
    public static double convertirCaK(double celsius){
        return celsius + 273.15;
    }
    public static double convertirKaC(double kelvin){
        return kelvin = 273.15;
    }
     public static double convertirKaF(double kelvin){
        return 1.8 * (kelvin = 273.15) + 32.0;
    }
}