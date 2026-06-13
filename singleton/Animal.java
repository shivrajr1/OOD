public class Animal {

    private static volatile Animal animal;
    private  Animal(){}

    public static Animal getAnimal(){
        if(animal==null){
            synchronized(Animal.class){
                if(animal==null){
                    animal= new Animal();
                    return animal;
                }else{
                    return animal;
                }
            }
        }
        return animal;
    }
}
