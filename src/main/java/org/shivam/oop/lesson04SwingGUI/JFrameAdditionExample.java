package main.java.org.shivam.oop.lesson04SwingGUI;

import javax.swing.*;
import java.awt.*;

public class JFrameAdditionExample {

    public static void main(String[] args) {
        // CREATE WINDOW =================================================
        JFrame myWindow = new JFrame("My Window");
        myWindow.setLayout(new FlowLayout());

        // CREATE ICON ===================================================
        //Icon myIcon = new ImageIcon(JFrameAdditionExample.class.getResource("shivam.jpg"));
        Icon myIcon = new ImageIcon("shivam.jpg");

        // CREATE LABEL ==================================================
        JLabel myLabel = new JLabel("My Label");
        myLabel.setToolTipText("This is my label");
        myLabel.setForeground(Color.RED);

        JLabel iconLabel = new JLabel("Icon Label", myIcon, SwingConstants.CENTER);
        iconLabel.setIcon(myIcon);

        // CREATE TEXT FIELD ==============================================
        JTextField tf1 = new JTextField("Enter Your Name", 20);



        myWindow.add(myLabel);
        myWindow.add(iconLabel);
        myWindow.add(tf1);

        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setSize(300, 500);
        myWindow.setAlwaysOnTop(true);
        myWindow.getContentPane().setBackground(Color.GREEN);
        myWindow.setResizable(false);
        myWindow.setLocationRelativeTo(null);

        myWindow.setVisible(true);
    }
}
