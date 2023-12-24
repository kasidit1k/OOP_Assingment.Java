package Chap4;

public class OuterB {
    int out1 = 5;
    static int out2 = 10;
    void outerMethod1() { //non-static method
        System.out.println("outerMethod1");
    }
    static void outerMethod2() { // static method
        System.out.println("outerMethod2");
    }
    class Member {  
        int att1 = 20;
        int att2 = 30;
            
            void innerMethod1(){
                System.out.println("innerMethod1");
            }
            
            static void innerMethod2(){
                System.out.println("innerMethod2");
            }
    } 
} //
