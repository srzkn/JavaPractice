package day38.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Cat cat=new Cat("mavis", "tuylu",2,'M',"small", "white");
        Dog dog=new Dog("karabass", "karabas",5,'F',"medium", "white&black");
        Eagle eagle=new Eagle("kartal", "American",5,'M',"small", "gray");
        Tiger tiger=new Tiger("kaplan", "Zulu",10,'M',"huge", "orange");
        System.out.println("cat = " + cat);
        System.out.println("dog = " + dog);
        System.out.println("eagle = " + eagle);
        System.out.println("tiger = " + tiger);
        System.out.println("---------------------------------");
        cat.eat();
        dog.eat();
        eagle.eat();
        tiger.eat();
    }
}
