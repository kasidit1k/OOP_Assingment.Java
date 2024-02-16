package Chap11;

public abstract class ElectricAppliance {
    abstract void on();
    abstract void off();
    abstract void work();
}

abstract class Fan1 extends ElectricAppliance{
    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }
}

class Fan2 extends Fan1{
    @Override
    public void work() {
        System.out.println("work");
    }
}
