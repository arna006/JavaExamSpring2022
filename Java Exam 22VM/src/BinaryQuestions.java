public class BinaryQuestions implements Quiz {

  private String question;
  char correctAnswer;

  void Question1() {
    question = "The same server serves the whole game.";
    correctAnswer = 'y';
  }

  void Question2() {
    question = "Only the serving team can win a point.";
    correctAnswer = 'n';
  }

  void Question3() {
    question = "First attempt is allowed to get the serve into the correct box.";
    correctAnswer = 'n';
  }

  void Question4() {
    question = "If the ball hits the net, and goes into the correct box, the serve is repeated.";
    correctAnswer = 'y';
  }

  void binaryQuestions() {
    int min = 1;
    int max = 4;
    int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

    if (random_int == 1) {
      Question1();
    } else if (random_int == 2) {
      Question2();
    } else if (random_int == 3) {
      Question3();
    } else if (random_int == 4) {
      Question4();
    }
  }

  @Override
  public String showQuestions() {
    return question;
  }

  @Override
  public char isCorrectAnswer() {
    return correctAnswer;
  }
}
