import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main implements ActionListener{
    JFrame frame;
    JButton button;
    Random rand;

    Font myFont = new Font("Ubuntu Regular", Font.BOLD, 20);
    String[] answers = new String[20];

    Main(){
        frame = new JFrame("Magic 8-Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        button = new JButton("Ask a question");
        button.setFont(myFont);
        button.setBounds(95, 90, 200, 200);
        button.addActionListener(this);

        rand = new Random();
        setAnswers();
        frame.add(button);
        frame.setVisible(true);
    }
    public void setAnswers(){
        answers[0] = "It is certain";
        answers[1] = "It is decidedly so";
        answers[2] = "Without a doubt";
        answers[3] = "Yes definitely";
        answers[4] = "You may rely on it";
        answers[5] = "As I see it, yes";
        answers[6] = "Most likely";
        answers[7] = "Outlook good";
        answers[8] = "Yes";
        answers[9] = "Signs point to yes";
        answers[10] = "Reply hazy, try again";
        answers[11] = "Ask again later";
        answers[12] = "Better not tell you now";
        answers[13] = "Cannot predict now";
        answers[14] = "Concentrate and ask again";
        answers[15] = "Don't count on it";
        answers[16] = "My reply is no";
        answers[17] = "My sources say no";
        answers[18] = "Outlook not so good";
        answers[19] = "Very doubtful";
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("Eight ball time!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            int index = rand.nextInt(0,19);
            System.out.println(answers[index]);//for debugging
            showMessageDialog(frame, answers[index]
            );
        }
    }
}