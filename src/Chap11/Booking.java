package Chap11;

public interface Booking {
    public boolean cancelBooking(int id);
    public void newBooking();   
    public boolean updateBooking(int id);
}

class HoteBooking extends Payment implements Booking{
    private String name;
    private String address;
    private String telephone;

    public String getName() {
        return name;
    }

    @Override
    public boolean cancelBooking(int id) {
        return true;
    }

    @Override
    public void newBooking() {
        System.out.println("newBooking");
    }

    @Override
    public boolean updateBooking(int id) {
        return true;
    }

    @Override
    void printReceipt() {
        System.out.println("printReceipt");
    }
}

abstract class Payment{
    abstract void  printReceipt();
}


