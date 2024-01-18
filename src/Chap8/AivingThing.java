
package Chap8;

public class AivingThing {
    protected String name;
    
    public void grow(){
        System.out.println("grow");
    }
    
    public void reproduce(){
        System.out.println("reproduce");
    }
} //


// Subclass 
class Animal extends AivingThing{ // สัตว์
    private String color;
    protected int leg;
    
    public void move(){
        System.out.println("Move");
    }

    public String getColor() {
        return color;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
} // 

class Dog extends Animal{
     protected int leg = 5;

    @Override
    public void move() {
        System.out.println("Move เร็วอยู่");
    }
     public void bark(){
         System.out.println("Bark");
     }
 }

class Worm extends Animal{
//    public void eat(){}
}

class Bee extends Animal{
    
} 

class Plant extends AivingThing{ // พืช
    
} //


