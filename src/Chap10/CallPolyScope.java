package Chap10;

public class CallPolyScope {
    public static void main(String[] args) {
        Boat st = new Submarince();
        st.showOwner();
        
//        Submarince smr = (Submarince) st;
//        smr.move();
        ((Submarince ) st) .move();
    }
}
