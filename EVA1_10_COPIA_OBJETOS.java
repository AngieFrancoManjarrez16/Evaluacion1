/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_copia_objetos;

/**
 *
 * @author AngieFrMa
 */
public class EVA1_10_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj1 = new Prueba();
        System.out.println("Dirección: " + obj1);
        obj1.x = 100;
        System.out.println("Valor de x en obj1: " + obj1.x);
        Prueba respaldo = obj1;
        System.out.println("Valor de x en el respaldo: " + respaldo.x);
        //modifico respaldo
        respaldo.x = 0;
        System.out.println("Valor de x en obj1: " + obj1.x);
        System.out.println("Valor de x en el respaldo: " + respaldo.x);
        //IMPRIMIR DIRECCIONES DE MEMORIA
        System.out.println("Obj1: " + obj1);
        System.out.println("Respaldo: " + respaldo);
        if(obj1 == respaldo)
            System.out.println("SON IGUALES");
        else
            System.out.println("SON OBJETOS DIFERENTES");
    }
    
}
class Prueba{
    public int x;
    
}