package day36_.Phone;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.setInfo("Apple", "Iphone 14 max pro", "large", 1450, "gray");
        System.out.println(iphone);

    Samsung samsung=new Samsung();
    samsung.setInfo("Samsung", "S21 Plus", "large", 1200, "black");
        System.out.println(samsung);
    }
}
