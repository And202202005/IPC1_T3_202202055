
package tarea2;


public class Rectangulo extends Figura {
    @Override
    public void AreaF(){
        System.out.println("Area del Rectangulo");
        
        Base = 4;
        AltT = 3;
        Area = Base * AltT;
        System.out.println("Base: " +Base);
        System.out.println("Altura: " +AltT);
        
         System.out.println("EL area del Rectangulo es: " +Area);
    }
}
