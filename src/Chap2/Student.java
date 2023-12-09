package Chap2;

public class Student {

    protected String studentId; // กำหนด Attribue
    protected String studentName;
    protected String faculty;
    protected String major;

    public Student() { //default constructor
        System.out.println("Default Constructor");

    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentName, String วิทยาศาสตร์, String itdi) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void enrollment(String studentID) { //method ลงทะเบียน 
        System.out.println("Enrollment : " + studentID);
    }

    public void payment(String studentID) { //method ชำระเงิน
        System.out.println("payment : " + studentID);
    }

    public void addCourse(String studentID) { // method เพิ่มวิชาเรียน
        System.out.println("addCourse : " + studentID);
    }

    public void dropCourse(String studenID) { // method ยกเลิกวิชาเรียน
        System.out.println("dropCourse : " + studenID);
    }

    void showAttribute() {
        System.out.println("studentId = " + studentId);
        System.out.println("studentName = " + studentName);
        System.out.println("faculty = " + faculty);
        System.out.println("major = " + major);
    }
}
