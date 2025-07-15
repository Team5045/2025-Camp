public class Exercise1Solution2 {
    public static void main(String[] args){
        // Your task: for every n from 1-100:
        // if n is divisible by 3, print "Fizz" to the screen.
        // if n is divisible by 5, print "Buzz" to the screen.
        // if n is divisible by 3 and 5, print "FizzBuzz" to the screen.
        // Otherwise, print n directly back to the screen.
        // Try different ranges, like 1-1000, to check your code.
        for(int i = 0; i <= 100; i++){
            String result = "";
            if(i % 3 == 0){
                result = "Fizz";
            }
            if(i % 5 == 0){
                result = result + "Buzz";
            }

            if(result.equals("")){
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}
