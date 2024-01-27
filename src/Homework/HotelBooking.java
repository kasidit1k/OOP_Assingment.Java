
package Homework;


public class HotelBooking  extends Booking{
    private String name;
    private String address;
    private String telephone;
    
    public String getName(){
        return name;
    }

    @Override
    public boolean updateBooking(int id) {
        return true;
    }

    @Override
    public void newBooking() {
        
    }

    @Override
    public boolean cancelBooking(int id) {
        return true;
    }
}
