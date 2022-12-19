package day09_IfStatementsPractice;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection=9;
        if      (selection==1) {    System.out.println("Hello, thank you for your call");   }
        else if (selection==2) {    System.out.println("Hola, gracias para llamar");   }
        else if (selection==3) {    System.out.println("Merhaba, aradiginiz icin tesekkurler");   }
        else if (selection==4) {    System.out.println("Privet, spasibo za vas zvonok");   }
        else if (selection==5) {    System.out.println("Merci, pour vorte appel");   }
        else {System.out.println(selection+ " is not a number between 1 and 5!");}
    }
}
