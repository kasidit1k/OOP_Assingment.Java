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
//        Person nawakon = new Person();
//        nawakon.citizet = "1937046646923";
//        nawakon.name = "Nawakorn";
//        nawakon.surname = "Madang";
//        nawakon.sex = "M"; 
//        nawakon.age = 20;
//        nawakon.address = "21 Songkhla";

        //เรียกใช้ Student 
          System.out.println("****************** Student ****************");
          Student kasiditStd = new Student("654295001" , "Kasidit" , "วิทยาศาสตร์" , "ITDI");
             kasiditStd.showAttribute();
//           kasiditStd.payment("11,000 baht");
//           kasiditStd.adCourse("Enlish");
//           kasiditStd.dropCourse("Aline");
        
        
     
        //เรียกใช้ method
//        kasiditStd.enrollment("654295001");
//        kasiditStd.payment("25450");
//        kasiditStd.addCourse("AI");
//        kasiditStd.dropCourse("Database System");


        System.out.println("****************** Nawakon ******************");
        //GraduateStuden
        GraduateStuden kasiditGstd = new GraduateStuden("ป.ตรี", "Mr.son", "654295001", "studentName", "วิทยาศาสตร์", "itdi");
        kasiditGstd.showAttribute();
//        kasiditGstd.oralExamination("BewBon");
//        kasiditGstd.thesisExamination("Mr.Son");
//        kasiditGstd.studentName = "Kasidit";
//        kasiditGstd.faculty = "เทคโนโลยีสารสนเทศและนวัฒกรรมดิจิทัล";
//        kasiditGstd.major = "วิทยาศาสตร์และเทคโนโลยี";
//        kasiditGstd.enrollment("654295001");
//        kasiditGstd.payment("25000");
//        kasiditGstd.addCourse("Database system");
//        kasiditGstd.dropCourse("OOP");




//        nawakon.showAttribute();
//        System.out.println("******************** Kasidit *******************");
//        kasidit.showAttribute();
//        System.out.println("************************************************");
//
//        kasidit.eat(); // nameObject => namemethod
//        kasidit.walk();
//        kasidit.run();
//        System.out.println("********************************************");
//        nawakon.eat();
//        nawakon.walk();
//        nawakon.run();
    }
}
