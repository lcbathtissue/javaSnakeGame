import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Main {
    // game status
    static boolean gameOver = false;
    static int snakeLength = 1;
    static int score = 0;

    // current position
    static int x = 0;
    static int y = 0;

    // screen max coordinate values
    static final int xMin = 100;
    static final int xMax = 100;
    static final int yMin = 100;
    static final int yMax = 100;

    public static void StartGame(){
        // window and settings
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());

        // test text field
        JLabel textfield = new JLabel();
        textfield.setBackground(new Color(153, 153, 255));
        textfield.setForeground(new Color(255, 255, 255));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("text");
        textfield.setOpaque(true);
        frame.add(textfield);

        // test button
        JButton button = new JButton();
        frame.add(button);

        // show the window
        System.out.println("GAME-OVER: " + CheckGameOver());
        System.out.println("LENGTH: " + snakeLength);
        System.out.println("SCORE: " + CalcCurrentScore());
        frame.setVisible(true);
    }

    public static int CalcCurrentScore(){
        // add code here

        // always returns 0
        return 0;
    }

    public static boolean CheckGameOver(){
        // add code here

        // always returns false
        return false;
    }

    public static void main(String[] args){
        // run the program
        StartGame();
    }
}
