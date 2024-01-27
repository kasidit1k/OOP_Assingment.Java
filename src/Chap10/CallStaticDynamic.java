
package Chap10;

public class CallStaticDynamic {
    public static void main(String[] args) {
        Boat bt = new Boat(); 
        System.out.println("Name : "+bt.owner);
        bt.showOwner();
        
        Boat rt = new Rowboat(); // Obj Polymorphism
        System.out.println("Name : "+rt.owner);  //static
        rt.showOwner(); //diinamic
    }
    
}
