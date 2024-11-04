package md.tekwill.zooclubservice;

public class Lion extends Animal {

    public Lion(String nameOfTheLion, int age) {
        super(nameOfTheLion, age);
    }

    @Override
    public void eat() {
        System.out.println("Meat");

    }

    @Override
    public void makeSound() {
        System.out.println("Hrrr");
    }
}
