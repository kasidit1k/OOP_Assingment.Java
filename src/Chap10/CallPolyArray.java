package Chap10;

public class CallPolyArray {

    static void printBoatOwner(Boat[] boatObject) {
        for (int i = 0; i < boatObject.length; i++) {
            boatObject[i].showOwner();
        }
    }
    
    public static void main(String[] args) {
        Boat[] bt = new Boat[2];
        bt[0] = new Boat();
        bt[1] = new Rowboat();
        printBoatOwner(bt);
    }
}
