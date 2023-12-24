package Chap4;

public class CallOuterB {

    public static void main(String[] args) {
        OuterB outObj = new OuterB(); // non-static
        OuterB.Member innerObj = outObj.new Member();
        innerObj.innerMethod1();
    }
}
