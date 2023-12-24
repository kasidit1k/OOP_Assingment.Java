// อโนนิมัสคลาส
package Chap4;

class Printer{
    void print(){
        System.out.println("Printer : print");
    }
} 
public class OuterD {
    static void printReport(Printer pnt){
        pnt.print();
    }
    
    public static void main(String[] args) {
        printReport(new Printer() { 
            @Override
            void print() {
                System.out.println("Anonymous Object1");
            }
        });
        
        printReport(new Printer() { 
            @Override
            void print() {
                System.out.println("Anonymous Object2");
            }
        });
    }
}