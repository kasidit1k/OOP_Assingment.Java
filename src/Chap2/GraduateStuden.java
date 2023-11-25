package Chap2;

public class GraduateStuden extends Student {

    public String studyLevel; // ระดับการศึกษา
    public String thesisAdviser; //ที่ปรึกษาวิทยานิพนธ์

    public void oralExamination(String studentId) {
        System.out.println("oralExamination : " + studentId);
    }

    public void thesisExamination(String studentId) {
        System.out.println("thesisExamination : " + studentId);

    }

    public void payment(String studentId) {
        System.out.println("ชำระเงิน : " + studentId);

    }

    public static void main(String[] args) { //โปรแกรมหลัก

    }
}
