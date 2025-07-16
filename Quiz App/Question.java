import java.util.Scanner;

class Question{
    private String questionContent;
    private Answer[] answers;

    public Question(String questionContent, Answer[] answers) {
        this.questionContent = questionContent;
        this.answers = answers;
    }

    public int askQuestion(){
        Scanner s = new Scanner(System.in);
        System.out.println(this.questionContent);
        for(int i = 0; i < this.answers.length; i++){
            System.out.println((i + 1) + ") " + this.answers[i].getAnswerContent());
        }
        int answer = s.nextInt() - 1;
        while(answer >= this.answers.length || answer < 0) {
            System.out.println("Number outside valid range, please try again.");
            answer = s.nextInt() - 1;
        }
        return this.answers[answer].getScoreValue();
    }
}