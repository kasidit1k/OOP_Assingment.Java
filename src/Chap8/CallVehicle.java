
package Chap8;


public class CallVehicle {
    public static void main(String[] args) {
        Car c = new Car("Bule", "Lamborghini");
//        c.color = "Blue";
//        c.brand = "Lamborghini";

        
        System.out.println("  ===== Atttribute ==== ");
        System.out.println("Color : "+c.color);
        System.out.println("Brand : "+c.brand);
        System.out.println("Size : "+c.size);
        
        System.out.println(" ===== Method ===== ");
        c.start();
        c.stop();
        c.pause();
        c.move();
        
        System.out.println("----------------- ||| ------------------");
        
        Plane p = new Plane("Black", "Airbus");
//        p.color  = "Black";
//        p.brand = "Airbus";

        
        System.out.println("===== Atttribute =====");
        System.out.println("Color : "+p.color);
        System.out.println("Brand : "+p.brand);
        System.out.println("Size : "+p.size);
        
        System.out.println("====== Method ======");
        p.start();
        p.stop();
        p.pause();
        p.move();
    }
}
