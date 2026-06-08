public class Main {
    public static void main(String[] args) {
        AnimalMaker animalMaker=new AnimalMaker();
        Animal dog=animalMaker.makeAnimal("dog");
        Animal cat=animalMaker.makeAnimal("cat");
        Animal notAnimal=animalMaker.makeAnimal(null);
        dog.makeSound();
        cat.makeSound();
        notAnimal.makeSound();
    }
}
