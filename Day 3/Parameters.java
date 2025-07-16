class Parameters {
    public static void main(String[] args) {
        addTwoNumbers(29, 38);

        iterateArray(new int[] {1, 2, 3, 4, 5});
    }
    public static void addTwoNumbers(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void iterateArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}