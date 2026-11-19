// Klase para sa pag-check ng quiz
public class QuizGrader {
    // Dito nag-i-start tumakbo yung code
    public static void main(String[] args) {
        // Ito yung tamang sagot sa 10-item quiz
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        // Ito naman yung mga pinili ng estudyante
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        // Dito iipunin yung bilang ng tama, zero muna sa simula
        int correctCount = 0;
        // Header para sa mga sablay na sagot
        System.out.println("Missed Questions");

        // Iisa-isahin natin yung 10 tanong mula 0 hanggang dulo
        for (int i = 0; i < answerKey.length; i++) {
            // Nilalakihan natin yung letra para kahit naka-small letter sagot ng estudyante, okay pa rin
            char studentAns = Character.toUpperCase(studentAnswers[i]);
            // Sinisigurong naka-uppercase din yung nasa answer key bago ikumpara
            char correctAns = Character.toUpperCase(answerKey[i]);

            // Titingnan kung pareho yung sagot ng estudyante at yung tamang sagot
            if (studentAns == correctAns) {
                // Ayos, tama! Dagdag isang puntos
                correctCount++;
                // Kapag hindi nagtugma, ibig sabihin mali
            } else {
                // Sasabihin kung anong number yung mali, ano sagot niya, at ano dapat
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswers[i] + "', correct answer is '" + answerKey[i] + "'.");
                // Dulo ng if-else sa loob ng loop
            }
            // Tapos na i-check lahat ng tanong
        }

        // Kinukuha yung percentage; naka-double para hindi putol yung labas
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;

        // Header para sa final score
        System.out.println("Quiz Result");
        // Pinapakita kung ilan nakuha niya out of 10
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        // Pinapakita yung percentage ng score niya
        System.out.println("Score Percentage: " + scorePercentage + "%");

        // Kapag 70 pataas, pasado na 'yan
        if (scorePercentage >= 70.0) {
            // Lalabas PASS kapag abot sa passing grade
            System.out.println("Result: PASS");
            // Pag bumaba sa 70, bagsak muna
        } else {
            // Lalabas FAIL kapag hindi umabot
            System.out.println("Result: FAIL");
            // Dulo ng pass/fail check
        }
        // Dulo ng main method
    }
// Dulo ng program
}