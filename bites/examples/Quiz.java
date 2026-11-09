package bites.examples;

public class Quiz {
    String questionOne;
    String questionTwo;

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz("what is the capital of Burkina Faso?", "What is the capital of Bhutan?");
        System.out.println(myQuiz.getQuestionOne());
        System.out.println(myQuiz.getQuestionTwo());
    }

    public Quiz(String q1, String q2) {
        this.questionOne = q1;
        this.questionTwo = q2;
    }

    public String getQuestionOne() {
        return this.questionOne;
    }

    public String getQuestionTwo() {
        return this.questionTwo;
    }
}
