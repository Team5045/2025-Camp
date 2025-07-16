class Main {
    public static void main(String[] args) {
        int add = addTwoNums(1, 3);
        double addDouble = addTwoNums(5.5, 10.7);

        Dog rufus = new Dog("Rufus", 6, "golden brown", "golden retriever");
        System.out.println(rufus.getBreed());
        System.out.println(rufus.getName());

        Pet myPet = new Pet("mr big", 9, "black");
        myPet.makeSound(); // scratch scratch
        rufus.makeSound(); // Bark Bark
    }

    public static int addTwoNums(int num1, int num2){
        return num1 + num2;
    }
    public static double addTwoNums(double num1, double num2){
        return num1 + num2;
    }
}