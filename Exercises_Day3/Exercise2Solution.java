class Exercise2Solution {
    public static void main(String[] args) {
        // The task: Create a function called calculateMean()
        // It accepts one parameter: an integer array (int[])
        // The function needs to return the mean, or average, of the array (this should be returned as a double)
        // Ex: {8, 5, 3, 6} returns 5.5
        // Call this function in the main function at least 3 times with 3 different inputs
        int[] arr = {8, 5, 3, 6};
        System.out.println(calculateMean(arr));
    }
    public static double calculateMean(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}