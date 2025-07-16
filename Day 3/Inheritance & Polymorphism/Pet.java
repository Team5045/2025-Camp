class Pet {
    protected String name;
    protected int age;
    protected String furColor;

    public Pet(String name, int age, String furColor){
        this.name = name;
        this.age = age;
        this.furColor = furColor;
    }

    public void makeSound(){
        System.out.println("scratch scratch");
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getFurColor(){
        return this.furColor;
    }

}