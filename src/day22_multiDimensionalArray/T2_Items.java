package day22_multiDimensionalArray;

public class T2_Items {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (String[] d1 : items) {
            for (String item : d1) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        for (String[] d1 : items) {
            for (int i = d1.length - 1; i >= 0; i--) {
                System.out.print(d1[i]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        for (int i = items.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1<items[i].length; i1++) {
                System.out.print(items[i][i1]+"\t");
            }
            System.out.println();
        }








    }
}
