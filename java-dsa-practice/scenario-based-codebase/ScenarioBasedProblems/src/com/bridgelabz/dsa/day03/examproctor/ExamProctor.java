package com.bridgelabz.dsa.day03.examproctor;

import java.util.*;

class ExamProctor {

    Stack<Integer> navigation = new Stack<>();
    HashMap<Integer, String> answers = new HashMap<>();
    HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Constructor to store correct answer
    ExamProctor() {
      correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    // question visit
    void visitQuestion(int qId) {
        navigation.push(qId);
        System.out.println("Visited Question "+qId);
    }
    // Answer a question
    void answerQuestion(int qId, String answer) {
        answers.put(qId, answer);
        System.out.println("Answered Q" +qId+ "=" + answer);
    }

    // evaluate score
    int calculateScore() {
        int score = 0;
        for (int qId:correctAnswers.keySet()) {
            if (correctAnswers.get(qId).equals(answers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
