class Result{
    private String result;
    private int lowerLimit;
    private int upperLimit;

    public Result(String result, int lowerLimit, int upperLimit){
        this.result = result;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public String getResult(){
        return this.result;
    }

    public boolean checkIfInLimit(int score){
        return score >= lowerLimit && score <= upperLimit;
    }
}