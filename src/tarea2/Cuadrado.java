
package tarea2;

public class Cuadrado extends Figura{
    @Override
    public void AreaF(){
        System.out.println("Area del Cuadrado");
        
        lado = 4;
       
        Area = lado *lado;
        System.out.println("Lado: " +lado);
        
         System.out.println("El area del cuadrado es: " +Area);
    }
}
