package day38.AnimalTask;

public class Eagle extends Animal{
    public Eagle(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }
    public void eat(){
        System.out.println(name+" eats snake");
    }
}
