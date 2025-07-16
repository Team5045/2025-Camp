public class Answer{
    private String content;
    private int scoreValue;

    public Answer(String content, int scoreValue){
        this.content = content;
        this.scoreValue = scoreValue;
    }

    public String getAnswerContent(){
        return this.content;
    }

    public int getScoreValue(){
        return this.scoreValue;
    }
}