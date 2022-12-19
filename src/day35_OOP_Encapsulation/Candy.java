package day35_OOP_Encapsulation;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

public String getBrand(){
    return brand;
}

public void setBrand(String brand){
    if (brand.isBlank()) return; this.brand=brand;
}
public int getQuantity(){
    return quantity;
}

public void setQuantity(int quantity){
    if (quantity<1) return; this.quantity=quantity;
}

public double getPrice(){
    return price;
}

public void setPrice(double price){
    if (price<0) return; this.price=price;
}

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanuts = hasPeanuts;
    }

    public String toString() {
    if (price==0) {
        return "Candy{" +
                "brand='" + getBrand() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + " free"  +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
    else return "Candy{" +
                "brand='" + getBrand() + '\'' +
                ", quantity=" + getQuantity() +
                ", price=" + getPrice() +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
