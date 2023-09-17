public class MCQs implements Quiz {

  private String question, ans1, ans2, ans3, ans4;
  char correctAnswer;

  void Question1() {
    question = "**Football is a game played with?**:";
    ans1 = "hands";
    ans2 = "foot";
    ans3 = "belly";
    ans4 = "arms";
    correctAnswer = 'b';
  }

  void Question2() {
    question = "**How many players are there in a football team?**";
    ans1 = "6";
    ans2 = "7";
    ans3 = "11";
    ans4 = "9";
    correctAnswer = 'c';
  }

  void Question3() {
    question = "**How many penalties are in shoot-out?**";
    ans1 = "1";
    ans2 = "3";
    ans3 = "5";
    ans4 = "12";
    correctAnswer = 'c';
  }

  void Question4() {
    question = "**Winner of Football World Cup Final in 1998**:";
    ans1 = "France";
    ans2 = "Brazil";
    ans3 = "Wales";
    ans4 = "Portugal";
    correctAnswer = 'a';
  }

  void mcqs() {
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

  public String showAns1() {
    return ans1;
  }

  public String showAns2() {
    return ans2;
  }

  public String showAns3() {
    return ans3;
  }

  public String showAns4() {
    return ans4;
  }

  @Override
  public char isCorrectAnswer() {
    return correctAnswer;
  }
}
