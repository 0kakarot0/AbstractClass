package animal;

public class Cow extends Animal{
    String animalFood;
    String animalName;
    String makeSound;


    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Cow(String animalName, String animalFood){
        setAnimalName(animalName);
        setAnimalFood(animalFood);
    }



    @Override
    String makeSound(String makeSound) {
        return makeSound;
    }
}
