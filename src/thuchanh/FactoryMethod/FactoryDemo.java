package thuchanh.FactoryMethod;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory=new AnimalFactory();

        Animal animal1=animalFactory.getAnimal("feline");
        System.out.println("aninmal1 sounds: "+animal1.makeSound());

        Animal animal2=animalFactory.getAnimal("canine");
        System.out.println("animal2 sounds: "+animal2.makeSound());
    }
}
