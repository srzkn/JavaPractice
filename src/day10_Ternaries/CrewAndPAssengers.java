package day10_Ternaries;

public class CrewAndPAssengers {
    public static void main(String[] args) {
        int number = 50;
        int crew, passengers;
        String s = "";
        if (number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                crew = 20;
                passengers = 30;
            } else if (number == 75) {
                crew = 25;
                passengers = 50;
            } else {
                crew = 30;
                passengers = 70;
            }
            s = crew + " crew, " + passengers + " passengers";
        } else
            s = "Not valid Number";
        System.out.println(s);
    }
}
