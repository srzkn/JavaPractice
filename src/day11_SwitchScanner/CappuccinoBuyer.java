package day11_SwitchScanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti", message;
        int calories;
        double price;

        if (size == "tall" || size == "grande" || size == "venti") {
            if (size == "tall") {
                price = 3.69;
                calories = 90;
            } else if (size == "grande") {
                price = 3.99;
                calories = 120;
            } else {
                price = 4.29;
                calories = 150;
            }
            message = "price is $" + price + "\n" + calories + " calories";
        } else {
            message = "Invalid Size";
        }
        System.out.println(message);
        System.out.println("-------------------------------------------");
        switch (size)
        {
            case "tall":
                price = 3.69;
                calories = 90;
                message = "price is $" + price + "\n" + calories + " calories";
                break;
            case "grande":
                price = 3.99;
                calories = 120;
                message = "price is $" + price + "\n" + calories + " calories";
                break;
            case "venti":
                price = 4.29;
                calories = 150;
                message = "price is $" + price + "\n" + calories + " calories";
                break;
            default:
                message = "Invalid Size";
        }
        System.out.println(message);
        System.out.println("---------------------------------");
        if (size=="tall" || size=="grande" || size=="venti")
        {
            switch (size)
            {
                case "tall":
                    price = 3.69;
                    calories = 90;
                    message = "price is $" + price + "\n" + calories + " calories";
                    break;
                case "grande":
                    price = 3.99;
                    calories = 120;
                    message = "price is $" + price + "\n" + calories + " calories";
                    break;
                default:
                    price = 4.29;
                    calories = 150;
                    message = "price is $" + price + "\n" + calories + " calories";
                    break;
            }
        }
        else
        {message = "Invalid Size";}
        System.out.println(message);
    }
}
