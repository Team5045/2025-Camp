public class Exercise1Solution {
    public static void main(String[] args){
        // Your task: for every n from 1-100:
        // if n is divisible by 3, print "Fizz" to the screen.
        // if n is divisible by 5, print "Buzz" to the screen.
        // if n is divisible by 3 and 5, print "FizzBuzz" to the screen.
        // Otherwise, print n directly back to the screen.
        // Try different ranges, like 1-1000, to check your code.
        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
