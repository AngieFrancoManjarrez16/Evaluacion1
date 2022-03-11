/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga;

/**
 *
 * @author AngieFrMa
 */
public class EVA1_18_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HOLA MUNDO!!");
        Prueba obj = new Prueba();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Area de un rectangulo de 15 * 20" + calcularArea(15, 20));
        System.out.println("Area de un triangulo de 15 * 20" + calcularArea(15.0, 20.0, 1));
        System.out.println("Area del circulo de radio 100" + calcularArea(100.0));
        System.out.println("Area del circulo de radio 100" + calcularArea(100));
    }
    //calcula el area de un rectangulo
    public static double calcularArea(double largo, double ancho){
        return largo * ancho;
    }  
    //calcula el area del triangulo
    public static double calcularArea(double base, double altura, int esTringulo){
        return (base * altura) / 2; 
    }
    //calcula el area de un triangulo
    public static double calcularArea(int esTringulo, double base, double altura){
        return (base * altura) / 2;
    }
    //calcula el area de un circulo
    public static double calcularArea(double radio){
        System.out.println("double");
        return Math.PI * Math.pow(radio, 2);
    }
    //calcula el area de un circulo con ENTEROS
    public static double calcularArea(int radio){
        System.out.println("entero");
        return Math.PI * Math.pow(radio, 2);
    }
}

class Prueba{
    
}