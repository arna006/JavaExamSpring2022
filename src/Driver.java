import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] user = new String[200];
    String[] topic = new String[200];
    int[] score = new int[200];

    for (int i = 0; i < score.length; i++) {
      score[i] = 0;
    }

    MCQs m = new MCQs();
    BinaryQuestions bq = new BinaryQuestions();
    int i = 0, x = 0;
    char ans;

    while (i < 200) {
      System.out.println("\n\nEnter your name to sign up: ");
      user[i] = sc.next();
      for (int j = x; j < 999; j++) {
        user[j] = user[i];
        user[i + 1] = user[i];
        System.out.println("\n\nEnter the topic from the given list. ");
        System.out.println("f for FOOTBALL for MCQS. ");
        System.out.println("t for TENNIS for Binary Questions. ");
        ans = sc.next().charAt(0);

        if (ans == 'f') {
          topic[j] = "FootBall";
          System.out.println("\n\nChoose from (a, b, c, d)\nWrong input will be considered as 0.");

          for (int k = 0; k < 4; k++) {
            m.mcqs();
            System.out.println("\n\n\n" + m.showQuestions() +"\na) " + m.showAns1() + "\nb)" + m.showAns2() +"\nc)" + m.showAns3() +"\nd)" + m.showAns4()
            );
            ans = sc.next().charAt(0);

            if (ans == m.isCorrectAnswer()) {
              System.out.println("Congratulations the answer is correct.");
              score[j]++;
            }
          }

          System.out.println("\n\n\nThis user: " + user[j] + "\nHas scored: " + score[i] + "\n For topic: " + topic[i]);

        } else if (ans == 't') {
          topic[j] = "Tennis";
          System.out.println("\n\n\nChoose from y for yes and n for no\nWrong input will be considered as 0.");

          for (int k = 0; k < 4; k++) {
            bq.binaryQuestions();
            System.out.println("\n\n\n" + bq.showQuestions());
            ans = sc.next().charAt(0);
            if (ans == bq.isCorrectAnswer()) {
              System.out.println("Congratulations the answer is correct.");
              score[j]++;
            }
          }
          System.out.println("This user: " + user[j] + "\nHas scored: " + score[i] + "\nFor topic: " + topic[i]);
        }
        System.out.println("\n\n\nThe score board history is: ");

        for (int k = 0; k <= j; k++) {
          System.out.println("User: " + user[k] + ", Score: " + score[k] + ", Topic: " + topic[k]);
        }
        System.out.println("\n\n\nEnter q to quit the game and any other character to play the game again:");
        ans = sc.next().charAt(0);
        i++;

        if (ans == 'q') {
          x = j + 1;
          System.out.println("\n\n\nThanks " + user[i] + " for playing the game.");
          break;
        }
      }
    }
  }
}
