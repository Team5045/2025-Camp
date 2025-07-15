public class Arrays {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5}; // An array of integers
        String[] names = {"John", "Adam", "Steve"}; // An array of strings

        System.out.println(intArray[0]); // 1
        System.out.println(intArray[1]); // 2

        intArray[4] = 10; // Change the 5th element in the array to 10
        intArray[0]++; // Increase the 1st element by 1

        System.out.println(names.length); // 3
    }
}
