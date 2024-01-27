package Chap10;

public class UpDowCastingWithException {

    static void print(Boat[] boat) {
        for (int i = 0; i < boat.length; i++) {
            boat[i].showOwner();
            if (boat[i] instanceof Submarince) {
                ((Submarince) boat[i]).move();
            }
        }
    }
    public static void main(String[] args) {
        Boat bt[] = new Boat[2];
        bt[0] = new Boat();
        bt[1] = new Submarince();
        print(bt);
    }
}
