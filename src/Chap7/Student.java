package Chap7;
public class Student{
    private String studentId;
    private String studentName;
    private Counsellor conusellor;
    private Parent parent;
    
    //Getter
    public String getSudentId(){
        return studentId;
    }
    
    public String getStudentName(){
        return studentName;
    }

    public Counsellor getConusellor() {
        return conusellor;
    }
    
    public Parent getParent(){
        return parent;
    }
    
    //Setter 
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setConusellor(Counsellor conusellor) {
        this.conusellor = conusellor;
    }
    
    public void setParent(Parent parent){
        this.parent = parent;
    }
    
    
    void printDetails(){
        System.out.println("StudentId : "+studentId);
        System.out.println("StudentName : "+studentName);
        System.out.println("Counsellor Id : "+conusellor.getCounsellorId());
        System.out.println("Counsellor Name : "+conusellor.getCounsellorName());
        System.out.println("Telephone : "+conusellor.getTelephoneNo());
        System.out.println("Parent name : "+parent.getParentName());
        System.out.println("Address : "+parent.getAddress());
        System.out.println("Telephone : "+parent.getTelephoneNo());
        
    }
}

class Counsellor{
    private String counsellorId;
    private String counsellorName;
    private String telephoneNo;
    
    
    //Constructor Overloading
    public Counsellor(String counsellorId, String counsellorName, String telephoneNo){
        this.counsellorId = counsellorId;
        this.counsellorName = counsellorName;
        this.telephoneNo = telephoneNo;
    }
    
    // Getter 
    public String getCounsellorId(){
        return counsellorId;
    }
    
    public String getCounsellorName(){
        return counsellorName;
    }
    
    public String getTelephoneNo(){
        return telephoneNo;
    }
    
    //Setter Method
    
    public void setCounsellorId(String counsellorId){
        this.counsellorId = counsellorName;
    }
    
    public void setCounsellorName(String counsellorName){
        this.counsellorName = counsellorName;
    }
    
    public void setTelephone(String telephoneNo){
        this.telephoneNo = telephoneNo;
    }
}

class Parent{
    private String parentName;
    private String address;
    private String telephoneNo;
    
    //ConStructor Overloading
    public Parent(String parentName, String address, String telephoneNo){
        this.parentName = parentName;
        this.address = address;
        this.telephoneNo = telephoneNo;
    }
    
    //getter method
    public String getParentName(){
        return parentName;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getTelephoneNo(){
        return telephoneNo;
    }
    
    //Setter
    public void setParentName(String parentName){
        this.parentName = parentName;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setTelephoneNo(String telephoneNo){
        this.telephoneNo = telephoneNo;
    }
}

