package Chap7;

public class CallComputer {

    public static void main(String[] args) {
        Computer com = new Computer();
        com.setCcase(new Case("All in one"));
        com.setKey(new Keyboard("Lenovo"));
        com.setMonitor(new Monitor("Gamming"));
        com.setMou(new Mouse("Lenovo"));
        com.setSpeaker(new Speaker("JBL"));
        
        System.out.println(com.getCcase());
        System.out.println(com.getKey());
        System.out.println(com.getMonitor());
        System.out.println(com.getMou());
        System.out.println(com.getSpeaker());
    }
}
