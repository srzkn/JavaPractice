package day36_.Employee;

public class EmployeeObjects {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.setInfo("coder ali", 'M',40, 01,"developer", 160000);
        System.out.println(developer);
        developer.work();
        developer.coding();
        developer.fixingBugs();


    }
}
