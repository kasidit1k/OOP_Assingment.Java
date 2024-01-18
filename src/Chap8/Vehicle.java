package Chap8;
// Super Class

public class Vehicle {

    protected String color;
    protected String brand; //ยี่ห่อ
    protected String size = "1500cc";

    public Vehicle(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void pause() { // หยุดชั่วคราว
        System.out.println("Pause");
    }

    public void move() {
        System.out.println("Move");
    }
} //

// Subclass สามารถมี attribute / method ซ้ำกับ supper ได้
class Car extends Vehicle {

    public String series;
    public String size = "2000cc"; // shodow attribute

    public Car(String color, String brand) {
        super(color, brand);
    }

    public void changeGear() {
        System.out.println("changeGear");
    }

    @Override
    public void move() {
        System.out.println("Move : โครตเร็ว");
    }
} //

class Boat extends Vehicle {

    public Boat(String color, String brand) {
        super(color, brand);
    }

} //

class Plane extends Vehicle {  //เครื่องบิน

    public Plane(String color, String brand) {
        super(color, brand);
    }
} //
