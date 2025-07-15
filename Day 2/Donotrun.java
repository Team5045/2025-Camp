// DO NOT RUN THIS FILE
// This is just to demonstrate examples of infinite loops
public class Donotrun {
    public static void main(String[] args) {
        // Risky as the loop cannot be exited without break keyword.
        // More on this later
        while(true){
            System.out.println("I can't escape!");
        }

        int i = 0;
        while(i < 5){
            System.out.println(i);
            // No i++!
            // i never increments so i can never be greater than 5.
            // This is also an infinite loop.
        }
    }
}
