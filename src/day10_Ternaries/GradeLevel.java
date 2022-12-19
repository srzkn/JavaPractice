package day10_Ternaries;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 89;
        String mes = "";
        if (gradeLevel >= 1 && gradeLevel <= 18) {
            mes = (gradeLevel < 6) ? "Elementary school" : (gradeLevel < 8) ? "Middle school"
                    : (gradeLevel < 13) ? "High School" : (gradeLevel < 17) ? "College" : "Grad School";

        } else {
            mes = "Invalid grade level given";
        }
        System.out.println(mes);
    }
}
