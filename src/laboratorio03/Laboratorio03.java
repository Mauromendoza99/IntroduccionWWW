/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio03;

/**
 *
 * @author Hp Pc
 */
public class Laboratorio03 {//Punto 1

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Punto 3.1
        
       Entrenador pepe= new Entrenador("Pepe","tenis");//Punto 3.1
       pepe.getNombre();
       pepe.getTipo();
       System.out.println("id: "+Entrenador.contadorEntrenadores+"\tNombre: "+pepe.getNombre()+"\tTipo: "+pepe.getTipo());
       //Punto 3.2
       Entrenador pepe1= new Entrenador("Jose","futbol");
       pepe1.getNombre();
       pepe1.getTipo();
       System.out.println("id: "+Entrenador.contadorEntrenadores+"\tNombre: "+pepe1.getNombre()+"\tTipo: "+pepe1.getTipo());
       
       Entrenador pepe2= new Entrenador("Juan","natacion");
       pepe2.getNombre();
       pepe2.getTipo();
       System.out.println("id: "+Entrenador.contadorEntrenadores+"\tNombre: "+pepe2.getNombre()+"\tTipo: "+pepe2.getTipo());
       
       Entrenador pepe3= new Entrenador("Alberto","baloncesto");
       pepe3.getNombre();
       pepe3.getTipo();
       System.out.println("id: "+Entrenador.contadorEntrenadores+"\tNombre: "+pepe3.getNombre()+"\tTipo: "+pepe3.getTipo());
       
       Entrenador pepe4= new Entrenador("Maxi","hockey");
       pepe4.getNombre();
       pepe4.getTipo();
        System.out.println("id: "+Entrenador.contadorEntrenadores+"\tNombre: "+pepe4.getNombre()+"\tTipo: "+pepe4.getTipo());
        
        
        System.out.println("");
    }
    
}
