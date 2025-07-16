import java.util.Scanner;

class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What is your name");
        String name = s.next(); // gets a String
        System.out.println("Hello " + name);

        System.out.println("What is your age");
        int age = s.nextInt();
        System.out.println("Your age is " + age);
    }
}