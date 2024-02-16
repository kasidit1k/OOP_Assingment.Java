package Chap11;
public abstract class Plane {

    void takeoff() {
        System.out.println("takeoff");
    }
    
    void landing() {
        System.out.println("landing");
    }
    
    abstract void fly();
}


   /*----------------------*\
        -- Boeing --
   \*----------------------*/
class Boeing extends Plane{
    @Override
    void fly() {
        System.out.println("fly");
    }    
}

