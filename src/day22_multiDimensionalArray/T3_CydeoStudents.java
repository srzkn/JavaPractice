package day22_multiDimensionalArray;

import java.util.Arrays;

public class T3_CydeoStudents {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};
String[][]batch25Groups= {batch25Group1,batch25Group2,batch25Group3};

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        String[][]batch24Groups={batch24Group1,batch24Group2,batch24Group3};
String[][][]CydeoStudents={batch24Groups,batch25Groups};
        for (String[][] d2 : CydeoStudents) {
            for (String[] d1 : d2) {
                for (String s : d1) {
                    System.out.print(s+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
