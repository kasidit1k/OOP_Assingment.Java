package Chap3;

public class Employee {

    static int id = 5001;
    String name = "Kasidit";
    int age = 20;

    static void work() { 
        System.out.println("work()");
    }
    void getSalary() {
        System.out.println("getSalary");
    }

    public static void main(String[] args) { // โปรแกรมหลัก
        // static 
        System.out.println("ID : " + id); //เรียกใช้ arrtribute
        work();
        //non static 
        Employee emp = new Employee();
        System.out.println("Name : " + emp.name); // เรียกใช้ attribute
        System.out.println("AGE : "+emp.age);  
        emp.getSalary(); //เรียกใช้ method
    }
}
