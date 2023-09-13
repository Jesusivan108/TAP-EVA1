/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_heap;

/**
 *
 * @author Jesús
 */
public class EVA1_8_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona  perso = new persona();
        persona perso2 = new persona("Felix", "Jose", 50);
       
       // System.out.println(perso);
        //System.out.println(perso2);
        perso = null;
        
        persona copia = perso2;
        
      String copia1= perso2.getNombre();
      String copia2= perso2.getApellido();
        int copia3= perso2.getEdad();
      

        copia.setNombre("aaaaaaaaaaaaaa");
        System.out.println(copia1);
        System.out.println(copia2);
        System.out.println(copia3);
    }
    
}

class persona{
    private String nombre;
    private String apellido;
    private int edad;
public persona(){
    
}
    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}