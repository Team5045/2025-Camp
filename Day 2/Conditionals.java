public class Conditionals {
    public static void main(String[] args){
        // This runs
        if(true){
            System.out.println("True");
        }
        // This does not run
        if(false){
            System.out.println("False");
        }

        // Let's bring back the original boolean examples
        boolean amIExcitedForSummerCamp = true;
        boolean amIExcitedForSchool = false;
        if(amIExcitedForSummerCamp){
            System.out.println("I am excited for summer camp!");
        }
        if(amIExcitedForSummerCamp && !amIExcitedForSchool){
            System.out.println("I am excited for camp but not excited to go back to school.");
        }

        if(amIExcitedForSchool){
            System.out.println("I am excited for school!");
        } else { 
            // Since we are not excited for school, run this block instead.
            System.out.println("I am not excited for school.");
        }

        if(amIExcitedForSchool){
            System.out.println("I am excited for school!");
        } else if(amIExcitedForSummerCamp) { 
            // Since we are not excited for school, but we are excited for summer camp, run this block instead.
            System.out.println("I am not excited for school, but I am excited for summer camp!");
        } else {
            // If we are not excited for school nor summer camp, run this block
            System.out.println("I am not excited for school or summer camp.");
        }
    }
}
