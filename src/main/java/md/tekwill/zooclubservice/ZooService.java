package md.tekwill.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal cat001 = new Cat("Tom", 4);
        Dog dog001 = new Dog("Rex", 8);
        Lion lion001 = new Lion("Simba", 10);

        System.out.println("Name: " + lion001.getName() + " Age: " + lion001.getAge());
        lion001.makeSound();
        System.out.println("Name: " + cat001.getName() + " Age: " + cat001.getAge());
        cat001.makeSound();
        System.out.println("Name: " + dog001.getName() + " Age: " + dog001.getAge());
        dog001.makeSound();

    }
}
