package com.bridgelabz.day04.edumentor;

public class EduMentorMain {

	    public static void main(String[] args) {

	        Learner learner = new Learner("Riya", "riya@mail.com", 501);

	        String[] questions = {"Java is OOP?", "Interface supports multiple inheritance?"};
	        String[] answers = {"Yes", "Yes"};

	        Quiz quiz = new Quiz(questions, answers, "Easy");

	        String[] userAnswers = {"Yes", "Yes"};
	        quiz.submitQuiz(userAnswers);

	        System.out.println("Quiz Percentage: " + quiz.calculatePercentage() + "%");

	        learner.generateCertificate("short");
	    }
	


}
