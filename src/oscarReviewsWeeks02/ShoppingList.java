package oscarReviewsWeeks02;

public class ShoppingList {
    public static void main(String[] args) {
        String item1="Tomatoes", item2="Cheese", item3="Apples";
        double price1=5.5;
        double price2=3.5;
        double price3=6.3;
        double totalPrice = price1 + price2 + price3;
        System.out.print("price1 = " + price1);
        System.out.print("  price2 = " + price2);
        System.out.println("  price3 = " + price3);
        System.out.println("totalPrice = " + totalPrice);
        System.out.println();
        System.out.println("Item1: "+item1+":"+price1+" Item 2: "+item2+":"+price2+" Item 3:"+item3+""+price3);
        System.out.println("----------------");
        System.out.println("Total Price"+" :"+totalPrice);

    }
}
