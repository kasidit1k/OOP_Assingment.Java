package Chap10;

public class Boat { //SuperClass
   String owner = "someone";
   void showOwner(){
       System.out.println("Boat : owner = " +owner);
   }
}//


class Rowboat extends Boat{ // subclass
    String owner = "Joey"; //attribute shadow
    @Override
    void showOwner() {
        System.out.println("RowBoat : owner = "+owner);
    }
}//


class Submarince extends Boat{ //subclass
    String owner = "Peter";
    void move(){
        System.out.println("Submarince : owner = "+owner);
    }
}//
