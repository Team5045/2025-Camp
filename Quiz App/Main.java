public class Main {
    public static void main(String[] args){
        Quiz q = new Quiz(new Question[] {
            new Question("What level math did you take in 8th grade?", new Answer[] {
                new Answer("Geometry", 4),
                new Answer("Algebra 1", 2),
                new Answer("Pre-Algebra", 0)
            }),
            new Question("Are you taking Algebra 2 over the summer?", new Answer[] {
                new Answer("Yes", 6),
                new Answer("No", 0)
            }),
            new Question("How many APs are you taking next year?", new Answer[] {
                new Answer("0 APs", 0),
                new Answer("1 AP", 1),
                new Answer("2 APs", 3),
                new Answer("3 APs", 6),
                new Answer("4 APs", 12)
            })
        }, new Result[] {
            new Result("You are super nerdy", 18 ,22),
            new Result("You are nerdy", 12, 17),
            new Result("You are kinda nerdy", 5, 11),
            new Result("You are not nerdy at all", 0, 4)
        });
        System.out.println("I bet I can guess how nerdy you are with this quiz!");
        q.play();
    }
}
