/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_constructures;

/**
 *
 * @author AngieFrMa
 */
public class EVA1_17_CONSTRUCTURES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        System.out.println("Nombre " + persona.getNombre());
        System.out.println("Edad " + persona.getEdad());

        Persona persona2 = new Persona();
        System.out.println("Nombre 2: " + persona2.getNombre());
        System.out.println("Edad 2: " + persona2.getEdad());
        
        Persona persona3 = new Persona("Angie", 20);
        System.out.println("Nombre 3: " + persona3.getNombre());
        System.out.println("Edad 3: " + persona3.getEdad());
        
        Persona persona4 = new Persona(5.0);
        System.out.println("Nombre 4: " + persona4.getNombre());
        System.out.println("Edad 4: " + persona4.getEdad());

    }
    
}

class Persona{
    private String nombre;
    private int edad;
    
    //CONSTRUCTOR DEFAULT <-- no me refiero al nivel acceso, me refiere a que no tiene (argumentos)
    //INICIALIZAR VALORES
    public Persona(){
        System.out.println("CREANDO EL OBJETO");
        nombre = "Juanito Perez";
        edad = 25;
    }
    
    public Persona (String nombre, int edad){
        System.out.println("CREANDO EL OBJETO CON CONSTRUCTOR QUE ACEPTA VALORES");
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(double valor){
        System.out.println("CREANDO EL OBJETO CON CONSTRUCTOR QUE ACEPTA DOUBLES");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}