package Chap6;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrade1 {

    static void showmenu() {
        System.out.println("-------- Menu --------");
        System.out.println("0 : Exit");
        System.out.println("1 : Student Entry");
        System.out.println("2: Grade Entry");
        System.out.println("3 : GPA Summary");
        System.out.println("-------------------------");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        ArrayList<Student> studentlist = new ArrayList<>();
        ArrayList<PrintGrade> gradeList = new ArrayList<>();

        do {
            showmenu();
            System.out.print("Please Enter Menu [0-3] : ");
            menu = sc.nextInt();
            if (menu == 1) {
                System.out.print("Enter Id : ");
                String id = sc.next();
                System.out.print("Enter Name : ");
                String name = sc.next();
                System.out.print("Enter Surname : ");
                String surname = sc.next();
                System.out.print("Enter Term : ");
                String term = sc.next();

                Student stu = new Student();
                stu.setId(id);
                stu.setName(name);
                stu.setSurname(surname);
                stu.setTerm(term);
                studentlist.add(stu);

            } else if (menu == 2) {
                System.out.print("Enter เทอม : ");
                String semester = sc.next();
                System.out.print("Enter รหัสวิชา : ");
                String courseCode = sc.next();
                System.out.print("Enter ชื่อวิชา : ");
                String courseName = sc.next();
                System.out.print("Enter หน่วยกิต : ");
                int credit = sc.nextInt();
                System.out.print("Enter เกรด : ");
                String grade = sc.next();

                PrintGrade pg = new PrintGrade();
                pg.setSemester(semester);
                pg.setCourseCode(courseCode);
                pg.setCourseName(courseName);
                pg.setCredit(credit);
                pg.setGrade(grade);
                gradeList.add(pg);

            } else if (menu == 3) {
                System.out.println("GPA Summary");

                for (Student student : studentlist) {
                    Object targetStudentId = "0";
                    if (student.getId().equals(targetStudentId)) {
                        System.out.println("ID : " + student.getId());
                        System.out.println("Name : " + student.getName());
                        System.out.println("Surname : " + student.getSurname());
                        System.out.println("Term : " + student.getTerm());
                        System.out.println("รหัสวิชา       ชื่อวิชา       หน่วยกิต      เกรด");

                        double totalCredits = 0;
                        double totalPoints = 0;

                        for (PrintGrade grade : gradeList) {
                            if (!grade.getSemester().equalsIgnoreCase(student.getTerm())) {
                                System.out.println(grade.getCourseCode()+ "\t" + grade.getCorseName()+ "\t" + grade.getCredit()+ "\t" + grade.getGrade());
                                
                                
                                int gradePoints = getGradePoints(grade.getGrade());
                                totalPoints += gradePoints * grade.getCredit();
                                totalCredits += grade.getCredit();
                            }
                        }

                   
                        double gpa = totalPoints / totalCredits;
                        System.out.printf("GPA : %.2f%n", gpa);
                        break; 
                    }
                }
            }
        } while (menu != 0 && menu < 3);
    }

    public static int getGradePoints(String grade) {
        switch (grade) {
            case "A":
                return 4;
            case "B":
                return 3;
            case "C":
                return 2;
            case "D":
                return 1;
            default:
                return 0; 
        }
    }
}
