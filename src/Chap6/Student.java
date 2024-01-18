package Chap6;
class Student{
    private String id;
    private String name;
    private String surname;
    private String term;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTerm() {
        return term;
    }
    


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTerm(String term) {
        this.term = term;
    }    
}
    
class PrintGrade{   
    private String semester;
    private String courseCode;
    private String courseName; 
    private int credit;
    private String grade;
    

    public String getSemester(){
        return semester;
    }
    
    public String getCourseCode(){
        return courseCode;
    }
    
    public String getCorseName(){
        return courseName;
    }
    
    public int getCredit(){
        return credit;
    }
    
    public String getGrade(){
        return grade;
    }
    
    //Setter 
    public void setSemester(String semester){
        this.semester = semester;
    }
    
    public void setCourseCode(String courseCode){
        this.courseCode = courseCode;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public void setCredit(int credit){
        this.credit = credit;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }
}



