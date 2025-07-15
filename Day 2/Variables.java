public class Variables {
    public static void main(String[] args) {
        int myFirstVariable = 5;
        System.out.println("My first variable is: " + myFirstVariable);
        int mySecondVariable = 5;
        mySecondVariable = 10;

        int myThirdVariable = 10;
        myThirdVariable = myThirdVariable + 5; // will now be 15

        myThirdVariable += 1; // will now be 16

        myThirdVariable++; // will now be 17
    }
}
