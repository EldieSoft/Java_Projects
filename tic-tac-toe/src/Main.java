import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.*;
import java.awt.event.*;



public class Main implements ActionListener{

    JFrame frame;
    JButton[] gridButtons = new JButton[9];
    Font myFont = new Font("Ubuntu Regular", Font.BOLD, 50);
    JPanel panel;

    boolean oTurn = true;

    Main(){
        frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);


        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(3,3,10,10));
        panel.setBackground(Color.blue);

        for (int i = 0; i < 9; i++){
            gridButtons[i] = new JButton("");
            gridButtons[i].addActionListener(this);
            gridButtons[i].setFont(myFont);
            gridButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 9; i++){
            panel.add(gridButtons[i]);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }

    public void logic(){
        //win conditions
        //horizontal
        if ((gridButtons[0].getText() == gridButtons[1].getText()) && (gridButtons[1].getText() == gridButtons[2].getText()) && gridButtons[0].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[0].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
        if ((gridButtons[3].getText() == gridButtons[4].getText()) && (gridButtons[4].getText() == gridButtons[5].getText()) && gridButtons[3].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[3].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
        if ((gridButtons[6].getText() == gridButtons[7].getText()) && (gridButtons[7].getText() == gridButtons[8].getText()) && gridButtons[6].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[6].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
        //vertical
        if ((gridButtons[0].getText() == gridButtons[3].getText()) && (gridButtons[3].getText() == gridButtons[6].getText()) && gridButtons[0].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[0].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
        if ((gridButtons[1].getText() == gridButtons[4].getText()) && (gridButtons[4].getText() == gridButtons[7].getText()) && gridButtons[1].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[1].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
        if ((gridButtons[2].getText() == gridButtons[5].getText()) && (gridButtons[5].getText() == gridButtons[8].getText()) && gridButtons[2].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[2].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
        //diagonal
        if ((gridButtons[0].getText() == gridButtons[4].getText()) && (gridButtons[4].getText() == gridButtons[8].getText()) && gridButtons[0].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[0].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
        if ((gridButtons[2].getText() == gridButtons[4].getText()) && (gridButtons[4].getText() == gridButtons[6].getText()) && gridButtons[2].getText() != "") {
            System.out.println("Excuse me, I do declare that there seems to be a winner in these here parts.");
            showMessageDialog(frame, gridButtons[2].getText()+ " wins!");
            for (int i = 0; i < 9; i++){
                gridButtons[i].setEnabled(false);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++){
            if (e.getSource() == gridButtons[i]){
                if (gridButtons[i].getText() == ""){
                    if (oTurn){
                        gridButtons[i].setText("O");
                        oTurn = false;
                    }
                    else{
                        gridButtons[i].setText("X");
                        oTurn = true;
                    }
                }
                logic();
            }
        }

    }
}