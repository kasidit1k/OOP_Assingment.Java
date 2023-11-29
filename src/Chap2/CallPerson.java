package Chap2;

public class CallPerson {

    public static void main(String[] args) {
        // Kasidit 
        Person kasidit = new Person();
        kasidit.citizet = "1937003466953";
        kasidit.name = "Kasidit";
        kasidit.surname = "Nunkong";
        kasidit.sex = "M";
        kasidit.age = 20;
        kasidit.address = "211 Phatthalung";
        
        
        //Object Nawakon
        Person nawakon = new Person();
        nawakon.citizet = "1937046646923";
        nawakon.name = "Nawakorn";
        nawakon.surname = "Madang";
        nawakon.sex = "M"; 
        nawakon.age = 20;
        nawakon.address = "21 Songkhla";

        //เรียกใช้ Student 
        Student kasiditStd = new Student();
        kasiditStd.studentId = "654295001";
        kasiditStd.studentName = "Kasidit";
        kasiditStd.faculty = "เทคโนโลยีสารสนเทศและนวัฒกรรมดิจิทัล";
        kasiditStd.major = "วิทยาศาสตร์เทคโนโลยีและเทคโนโลยี";
        System.out.println("****************** Student ****************");

        //เรียกใช้ method
        kasiditStd.enrollment("654295012");
        kasiditStd.payment("25450");
        kasiditStd.addCourse("AI");
        kasiditStd.dropCourse("Database System");
        System.out.println("****************** Nawakon ******************");

        //GraduateStuden
        GraduateStuden kasiditGstd = new GraduateStuden();
        kasiditGstd.oralExamination("BewBon");
        kasiditGstd.thesisExamination("Mr.Son");
        kasiditGstd.studentName = "Kasidit";
        kasiditGstd.faculty = "เทคโนโลยีสารสนเทศและนวัฒกรรมดิจิทัล";
        kasiditGstd.major = "วิทยาศาสตร์และเทคโนโลยี";
        kasiditGstd.enrollment("654295001");
        kasiditGstd.payment("25000");
        kasiditGstd.addCourse("Database system");
        kasiditGstd.dropCourse("OOP");

        nawakon.showAttribute();
        System.out.println("******************** Kasidit *******************");
        kasidit.showAttribute();
        System.out.println("************************************************");

        kasidit.eat(); // nameObject => namemethod
        kasidit.walk();
        kasidit.run();
        System.out.println("********************************************");
        nawakon.eat();
        nawakon.walk();
        nawakon.run();
    }
}
