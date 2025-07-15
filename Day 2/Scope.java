public class Scope {
    public static void main(String[] args){
        // We can denote scope using {}, no if/else/else if needed.
        {
            int myInt = 1;
            System.out.println(myInt); // okay
            {
                System.out.println(myInt); // also okay
            }
        }
        System.out.println(myInt); // not okay
    }
}
