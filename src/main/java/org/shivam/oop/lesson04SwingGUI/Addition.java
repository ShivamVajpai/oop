package main.java.org.shivam.oop.lesson04SwingGUI;

import javax.swing.UIManager.*;
import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        try {
            String firstNumber = JOptionPane.showInputDialog("Enter 1st Integer");
            String secondNumber = JOptionPane.showInputDialog("Enter 2nd Integer");

            int num1 = Integer.parseInt(firstNumber);
            int num2 = Integer.parseInt(secondNumber);

            int sum = num1 + num2;

            JOptionPane.showMessageDialog(null, "The sum is : " + sum, "Sum of 2 Integers", JOptionPane.PLAIN_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Incorrect Values Entered", "Entry Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
