/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clase_persona;

/**
 *
 * @author AngieFrMa
 */
public class EVA1_2_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //implementacion
    System.out.println("Hola Mundo!!");
    Persona estudiante = new Persona();//declaro un identificador (objeto) tipo persona
    estudiante.id = "00112233";
    estudiante.nombre = "Juan Perez Jolote";
    estudiante.edad = 10;
    estudiante.imprimirDatos();
    //CONCATENACIÓN -> PEGAR CADENAS DE TEXTO
    //"  " + ENTERO/BOLEAND/STRING/DOUBLE/ETC --> CADENA DE TEXTO
    System.out.println("Año de nacimiento: " + estudiante.CalcularAñodeNacimiento());
    
    
    Persona estudiante2 = new Persona();
    estudiante2.nombre = "Angie";
    estudiante2.id = "1111111";
    estudiante2.edad = 20;
    estudiante2.imprimirDatos();
    System.out.println("Año de nacimiento: " + estudiante2.CalcularAñodeNacimiento());
    
    
    Persona estudiante3 = new Persona();
    estudiante3.nombre = "Pedro";
    estudiante3.id = "654654";
    estudiante3.edad = 50;
    estudiante3.imprimirDatos();
    System.out.println("Año de nacimiento: " + estudiante3.CalcularAñodeNacimiento());
    
    }
    
}

class Persona //declaración
{//implementacion
    //ATRIBUTOS DE LA CLASE
    String id;
    String nombre;
    int edad;
    
    
    //COMPERTAMIENTO
    //metodo de imprimir datos --> metodo/función --> f() = x + 1
    //valor de retorno + nombre de la función ( argumentos );
    void imprimirDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La id es: " + id);
        System.out.println("Su edad es: " + edad);
    } 
   
    //calcular el nacimiento
    int CalcularAñodeNacimiento(){
        int añoNac = 2022 - edad; //decllaración 
        return añoNac;
    }
}
