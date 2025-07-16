public class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String furColor, String breed){
        super(name, age, furColor);
        this.breed = breed;
    }
    public Dog(String name, int age, String furColor){
        super(name, age, furColor);
        this.breed = "german shepherd";
    }

    @Override
    public void makeSound(){
        System.out.println("Bark Bark");
    }

    public String getBreed(){
        return this.breed;
    }
}