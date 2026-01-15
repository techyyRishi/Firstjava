import javax.swing.*;
import java.util.Random;

public class gameui {

    int userScore = 0;
    int compScore = 0;
    Random rand = new Random();

    JLabel resultLabel;
    JLabel scoreLabel;

    public gameui () {
        JFrame frame = new JFrame("By: Rishikesh");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        resultLabel = new JLabel("Choose Rock, Paper or Scissor");
        resultLabel.setBounds(50, 40, 300, 30);

        scoreLabel = new JLabel("You: 0  Computer: 0");
        scoreLabel.setBounds(50, 80, 300, 30);

        JButton rockBtn = new JButton("Rock");
        JButton paperBtn = new JButton("Paper");
        JButton scissorBtn = new JButton("Scissor");

        rockBtn.setBounds(50, 180, 90, 30);
        paperBtn.setBounds(150, 180, 90, 30);
        scissorBtn.setBounds(250, 180, 90, 30);

        rockBtn.addActionListener(e -> playGame(0));
        paperBtn.addActionListener(e -> playGame(1));
        scissorBtn.addActionListener(e -> playGame(2));

        frame.add(resultLabel);
        frame.add(scoreLabel);
        frame.add(rockBtn);
        frame.add(paperBtn);
        frame.add(scissorBtn);

        frame.setVisible(true);
    }

    void playGame(int userChoice) {
        int compChoice = rand.nextInt(3);
        String[] choices = {"Rock", "Paper", "Scissor"};

        String resultText = "Computer chose " + choices[compChoice] + ". ";

        if (userChoice == compChoice) {
            resultText += "It's a Draw!";
        } else if (
                (userChoice == 0 && compChoice == 2) ||
                        (userChoice == 1 && compChoice == 0) ||
                        (userChoice == 2 && compChoice == 1)
        ) {
            resultText += "You Win!";
            userScore++;
        } else {
            resultText += "Computer Wins!";
            compScore++;
        }

        resultLabel.setText(resultText);
        scoreLabel.setText("You: " + userScore + "  Computer: " + compScore);
    }

    public static void main(String[] args) {
        new gameui();
    }
}
