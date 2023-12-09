package Chap2;

public class GraduateStuden extends Student {

    public String studyLevel; // ระดับการศึกษา
    public String thesisAdviser; //ที่ปรึกษาวิทยานิพนธ์

    public GraduateStuden(String studyLevel, String thesisAdviser) {
        this.studyLevel = studyLevel;
        this.thesisAdviser = thesisAdviser;
    }

    public GraduateStuden(String studyLevel, String thesisAdviser, String studentId, String studentName, String วิทยาศาสตร์, String itdi) {
        super(studentId, studentName, วิทยาศาสตร์, itdi);
        this.studyLevel = studyLevel;
        this.thesisAdviser = thesisAdviser;
    }

    @Override
    void showAttribute() {
        super.showAttribute();
        System.out.println("studyLevel = " + studyLevel);
        System.out.println("theseAdviser = " + thesisAdviser);

    }

    public void oralExamination(String studentId) {
        System.out.println("oralExamination : " + studentId);
    }

    public void thesisExamination(String studentId) {
        System.out.println("thesisExamination : " + studentId);

    }

    @Override
    public void payment(String studentId) { // ซ้ำกับ method แม่ 
        System.out.println("ชำระเงิน : " + studentId);
    }
}
