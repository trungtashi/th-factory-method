public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal cat = factoryAnimal.getAnimal("feline");
        System.out.println("cat sound: " + cat.makeSound());

        Animal dog = factoryAnimal.getAnimal("canine");
        System.out.println("dog sound: " + dog.makeSound());

    }
}
