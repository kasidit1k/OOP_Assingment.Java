package Chap2;
//                              Encapsulation
public class Person {

    //Attribute
    String citizet;
    String name;
    String surname;
    String sex;
    int age;
    String address;

    void eat() {
        System.out.println("กินดีไหม");
    }

    void walk() {
        System.out.println("เดินดีไหม");
    }

    void run() {
        System.out.println("วิ่งดีไหม");
    }

    void showAttribute() { //show
        System.out.println("citizet : " + citizet);
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Sex : " + sex);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }

    void payment(String _baht) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void adCourse(String enlish) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void dropCourse(String korean) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
