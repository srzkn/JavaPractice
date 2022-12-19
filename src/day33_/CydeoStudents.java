package day33_;

public class CydeoStudents {
    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public String batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

public void study(){
    System.out.println(name+" is studying");
}

public  void attendClass(){
    System.out.println(name + " is attending class");
}
public static void printSchoolName(){
    System.out.println(schoolName);
}

public static void printProgLanguage(){
    System.out.println(programmingLanguage);
}

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
