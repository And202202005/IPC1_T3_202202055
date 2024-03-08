
package tarea2;


public class Triangulo extends Figura{
    @Override
    public void AreaF(){
        System.out.println("Area del Triangulo");
        
        Base = 4;
        AltT = 3;
        Area = (Base * AltT)/2;
        System.out.println("Base: " +Base);
        System.out.println("Altura: " +AltT);
        
         System.out.println("EL area del triangulo es: " +Area);
    }
}
