public class Quiz{
    private Question[] questions;
    private int score;
    private Result[] results;

    public Quiz(Question[] questions, Result[] results){
        this.questions = questions;
        this.results = results;
        this.score = 0;
    }

    public void play(){
        for(int i = 0; i < this.questions.length; i++){
            score += this.questions[i].askQuestion();
        }
        for(int i = 0; i < this.results.length; i++){
            if(results[i].checkIfInLimit(score)){
                System.out.println("You got: " + results[i].getResult() + "!");
                System.out.println("Congratulations");
                break;
            }
        }
    }
}