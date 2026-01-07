package com.bridgelabz.day04.edumentor;

public class Quiz {
    private String[] questions;   // internal question bank
    private final String[] answers; // encapsulated (cannot change)
    private int score;
    private String difficulty;

    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
        this.score = 0;
    }

    public void submitQuiz(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
                score++;
            }
        }
    }

    public double calculatePercentage() {
        return (double) score / answers.length * 100;
    }
}
