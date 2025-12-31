import java.util.*;
public class OnlineQuiz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] questions = {
            "1. What is the size of int in Java?",
            "2. Which keyword is used to create an object?",
            "3. Which loop is best when number of iterations is known?",
            "4. Which symbol is used for single-line comment?",
            "5. Which method is the entry point of Java program?"
        };
		char[] answers = {'b' , 'a' , 'c' , 'd' , 'b'};	
		int score = 0;

	for(int i = 0; i<5 ; i++){
		System.out.println("\n" + questions[i]);
		
		switch (i){
			case 0:
				 System.out.println("a) 2 bytes");
				 System.out.println("b) 4 bytes");
				 System.out.println("c) 8 bytes");
				 System.out.println("d) Depends on OS");
				 break;
			case 1:
				 System.out.println("a) new");
                 System.out.println("b) create");
                 System.out.println("c) object");
                 System.out.println("d) class");
                 break;
		     case 2:
                    System.out.println("a) while");
                    System.out.println("b) do-while");
                    System.out.println("c) for");
                    System.out.println("d) foreach");
                    break;

			case 3:
                    System.out.println("a) /* */");
                    System.out.println("b) #");
                    System.out.println("c) <!-- -->");
                    System.out.println("d) //");
                    break;

			case 4:
                    System.out.println("a) start()");
                    System.out.println("b) main()");
                    System.out.println("c) run()");
                    System.out.println("d) init()");
                    break;
	 System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            // Check answer using switch
            switch (userAnswer) {

                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong!");
                    }
                    break;

                default:
                    System.out.println(" Invalid option!");
            }
        }
        System.out.println("\n Quiz Finished!");
        System.out.println("Your Score: " + score + " / " + questions.length);

        sc.close();
    }
}