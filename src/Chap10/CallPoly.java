
package Chap10;
public class CallPoly {
    static void printBoatOwner(Boat boatObject){
        boatObject.showOwner();
    }
    public static void main(String[] args) {
        Boat bt = new Boat();
        printBoatOwner(bt);
        Boat rt = new Rowboat();
        printBoatOwner(rt);
    }
}
