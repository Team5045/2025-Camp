public class Comparisons {
    public static void main(String[] args){
        int var1 = 5;
        int var2 = 7;
        int var3 = 5;
        String var4 = "Hello";
        String var5 = "Bye";
        String var6 = "Hello";

        System.out.println(var1 > 7); // false
        System.out.println(var2 > 7); // false
        System.out.println(var2 >= 7); // true
        System.out.println(var1 == var3); // true

        // Proper way to compare non-primitive types such as String
        System.out.println(var4.equals(var6)); // true
        System.out.println(var5.equals(var6)); // false
    }
}
