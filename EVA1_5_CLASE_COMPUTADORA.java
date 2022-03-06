/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_clase_computadora;

/**
 *
 * @author AngieFrMa
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc1 = new Computadora();
        pc1.setColor("Gris");
        pc1.setMarca("Toshiba");
        pc1.setRam(64);
        pc1.setPrecioNeto(5000.00);
        
        System.out.println("Color: " + pc1.getColor());
        System.out.println("Marca: " + pc1.getMarca());
        System.out.println("Ram: " + pc1.getRam());
        System.out.println("Precio: " + pc1.getPrecioNeto());
    }
    
}
class Computadora{
    private int ram;
    private String marca;
    private String color;
    private double precioNeto;
    private double precioTotal;
    
    public void setRam (int valor){
        ram = valor;
    }
    public int getRam(){
        return ram;
    }
     public void setMarca (String valor){
        marca = valor;
    }
    public String getMarca(){
        return marca;
    }
     public void setColor (String valor){
        color = valor;
    }
    public String getColor(){
        return color;
    }
     public void setPrecioNeto (double valor){
        precioNeto = valor;
    }
    public double getPrecioNeto(){
        return precioNeto;
    }
       public void setPrecioTotal (double valor){
        precioTotal = valor;
    }
    public double getPrecioTotal(){
        return precioTotal;
    }
    
}
