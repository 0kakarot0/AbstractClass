package animal;

public class Farm {

    public static void main(String[] args) {
        CowFoodFinder("Cow","Grass");
    }

    public static void CowFoodFinder(String animalName, String animalFood){
        Animal animalProperties = new Cow(animalName,animalFood);
        Cow getCow = (Cow) animalProperties;
        String nameOfAnimal = getCow.getAnimalName();
        String foodOfAnimal = getCow.getAnimalFood();
        animalProperties.eat(nameOfAnimal,foodOfAnimal);
        System.out.println(nameOfAnimal+" make sound " + animalProperties.makeSound("Moo"));
    }
}
