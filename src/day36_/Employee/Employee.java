package day36_.Employee;

public class Employee {
public String name;
public char gender;
public int age, id;
public String jobtitle;
public double salary;

    public void setInfo(String name, char gender, int age, int id, String jobtitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
