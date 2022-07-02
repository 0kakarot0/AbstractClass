package animal;

public class Farm {

    public static void main(String[] args) {
        CowFoodFinder("Cow","Grass", "Moo");
    }

    public static void CowFoodFinder(String animalName, String animalFood, String makeSound){
        Animal animalProperties = new Cow(animalName,animalFood,makeSound);
        Cow getCow = (Cow) animalProperties;
        String getNameOfAnimal = getCow.getAnimalName();
        String getFoodOfAnimal = getCow.getAnimalFood();
        String getMakeSound = getCow.getMakeSound();
        animalProperties.eat(getNameOfAnimal,getFoodOfAnimal);
        System.out.println(getNameOfAnimal+" make sound " + getMakeSound);
    }
}
