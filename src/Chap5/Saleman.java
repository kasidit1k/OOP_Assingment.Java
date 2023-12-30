package Chap5;

class Saleman {
    private String id;
    private String name;
    private String surname;
    private int saleclass;
    private double saletotal;
    
    //  Getter Method
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSaleclass() {
        return saleclass;
    }

    public double getSaletotal() {
        return saletotal;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    // Setter Method
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSaleclass(int saleclass) {
        this.saleclass = saleclass;
    }

    public void setSaletotal(double saletotal) {
        this.saletotal = saletotal;
    }
}
