/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_mod_acceso;

/**
 *
 * @author AngieFrMa
 */
public class EVA1_3_MOD_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona();//Instanciar (crear objeto)
        per1.setId("00112233");
        per1.setNombre("Angie");
        per1.setEdad(20);
        System.out.println("Nombre: " + per1.getNombre());
        
        
        Persona per2 = new Persona();
        per2.setId("546545");
        per2.setNombre("Fredy");
        per2.setEdad(29);
        System.out.println(per2.getNombre() + ", " + per2.getId());
        
    }
    
}

class Persona{
    //ATRIBUTOS (VARIABLES) propiedades
    private String id;
    private String nombre;
    private int edad;
    //COMPORTAMIENTO (METODOS)
    //PARA LEER Y MODIFICAR LOS ATRIVUTOS, USAMOS METODOS DE LECTURA/ESCRITA
    
    //LEER --> GET
    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    //ASIGNAR --> SET
    public void setId(String valor){
        id = valor;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setEdad(int valor){
        edad = valor;
    }
}
