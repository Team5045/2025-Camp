class Return {
    public static void main(String[] args) {
        int myNum = 10;
        if(isEven(myNum)){
            System.out.println(myNum + " is even.");
        }

        System.out.println(getMyName());
        System.out.println(addTwoNumbers(11, 10));
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static String getMyName(){
        return "Clark";
    }
    public static int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }
}