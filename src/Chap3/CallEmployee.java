package Chap3;

public class CallEmployee {

    public static void main(String[] args) {
        Employee.work();
        System.out.println("ID : "+Employee.id);

        Employee em = new Employee();
        System.out.println("Name : "+em.name);
        System.out.println("Age : "+em.age);
        em.getSalary();
    }
}
