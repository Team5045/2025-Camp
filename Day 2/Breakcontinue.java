public class Breakcontinue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if(i == 5){
                break; // Ends execution of loop early. Only use in conditional statements.
            }
            System.out.println(i);
        }
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue; // Continues to the next iteration early. Only use in conditional statements.
            }
            System.out.println(i);
        }
    }
}
