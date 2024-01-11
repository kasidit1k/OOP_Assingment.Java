package Chap7;
public class CallStudent{
    
    public static void main(String[] args) {
        Student std = new Student();
        std.setStudentId("654295001");
        std.setStudentName("Kasidit Nunkhong");
        std.setConusellor(new Counsellor("185", "Nalinee Inthamano ", "0889551234"));
        std.setParent(new Parent("Somphong", "264 Moo.4", "0630281356"));
        
        std.printDetails();
    }
}