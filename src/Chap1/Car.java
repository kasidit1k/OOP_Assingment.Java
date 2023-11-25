package Chap1;
public class Car {
      String name;
      String serie; //รุ่น
      String brand;
      int seat; //กี่ที่นั่ง 
      int wheel; // กี่ล้อ
      int engine; //เครื่องยนต์
      double price;
      

      static void move(int speed){ //method เคลื่อนไหว ความเร็ว
            System.out.println("Move : "+speed);
      } 
      static void forward(int speed){
            System.out.println("forward : "+speed);
      }
      static void backward(int speed){
            System.out.println("backward : "+speed);
      }
      static void filloil(int lite){ //method เติมน้ำมัน
            System.out.println("filloil : "+lite);
      }
      static void carbreak(boolean dobreak){
            System.out.println("carbreak : "+dobreak);
      }
      static void carry(double person){
            System.out.println("Carry : "+person);
      }
      public static void main(String[] args) {
            Car myCar = new Car(); // สร้าง object
            System.out.println("Object : "+myCar);
            myCar.name = "Ferrari";
            System.out.println("Name " + myCar.name);
            myCar.serie = "812 Superfast";
            System.out.println("Serie : "+myCar.serie);
            myCar.brand = "Scuderia";
            System.out.println("Brand : "+myCar.brand);
            myCar.seat = 4;
            System.out.println("seat : "+myCar.seat);
            myCar.wheel = 4;
            System.out.println("Wheel : "+myCar.wheel);
            myCar.engine = 8;
            System.out.println("Engine : "+myCar.engine);
            myCar.price = 2500000;
            System.out.println("Price : "+myCar.price);

            move(200);
            forward(1200); 
            backward(2000);
            filloil(95);
            carbreak(true);
            carry(46.45);              
      }
}
