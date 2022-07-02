package animal;

public abstract class Animal {

     abstract String makeSound(String makeSound);

     public void eat(String animalName, String animalFood){
         System.out.println(animalName+" eats "+ animalFood);
     }
}
