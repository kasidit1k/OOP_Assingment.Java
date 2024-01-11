package Chap7;
//  Case
class Case{
    String name;
    
    public Case(String name) {
        this.name = name;
    }

    @Override
    public String toString() { // mt.
        return "Case{" + "name=" + name + '}';
    }
}

// Monitor
 class Monitor{
    String name;

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monior{" + "name=" + name + '}';
    }  
}

// Keyboard
class Keyboard{
    String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Keyboard{" + "name=" + name + '}';
    }
}

// Mouse
class Mouse{
    String name;
    
    public Mouse(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Mouse " + "name = " + name;
    }
}

// Speaker
class Speaker{
    String name;

    public Speaker(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Speaker " + " name = " + name;
    }
}

// Computer
class Computer{
   private Case ccase; // nameclass -> nameObject
   private Monitor monitor; 
   private Keyboard key;
   private Mouse mou;
   private Speaker speaker;

   // Getter
    public Case getCcase() {
        return ccase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Keyboard getKey() {
        return key;
    }

    public Mouse getMou() {
        return mou;
    }

    public Speaker getSpeaker() {
        return speaker;
    }
   
    // Setter
    public void setCcase(Case ccase) {
        this.ccase = ccase;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setKey(Keyboard key) {
        this.key = key;
    }

    public void setMou(Mouse mou) {
        this.mou = mou;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }
}



