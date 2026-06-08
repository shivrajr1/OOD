public class AnimalMaker {
    public Animal makeAnimal(String name){
        if(name==null)return new NullAnimal();
        switch (name.toLowerCase()) {
            case "dog":return new Dog();
            case "cat":return new Cat();
            default:return new Dog();
        }
    }
}
