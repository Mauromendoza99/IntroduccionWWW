
package laboratorio2;


public class Laboratorio2 {//Punto 1
    public static void main(String[] args) {
        Entrenador entrenador1= new Entrenador();//Punto 5.1
        entrenador1.asigEntrenador("Pepe", "natación");
        entrenador1.indicarEntrenamiento(null, null);//Punto 5.2
        System.out.println("La variable entrenador1: "+ entrenador1);//Punto 5.3
        Entrenador entrenador2= new Entrenador("Mauro", "fútbol");//Punto 5.4
        entrenador2.indicarEntrenamiento(null, null);//Punto 5.5
        System.out.println("La variable entrenador2:"+ entrenador2);//Punto 5.6
        
        
    }
    
}