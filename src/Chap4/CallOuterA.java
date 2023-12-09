package Chap4;
public class CallOuterA {
    public static void main(String[] args) {
        OuterA oa = new OuterA(); //Object Outer
        
        OuterA.innerClass inObj = new OuterA.innerClass(); // Create Object inner
        inObj.att1 = 20; //เรียกใช้ non-static variable
        OuterA.innerClass.innerMethod2(); //เรียกใช้ static method
    }
} //...
