package practice;

    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Calculator extends JFrame implements ActionListener {
        // Components of the Calculator
        private JTextField display;
        private String operator;
        private double firstNumber, secondNumber, result;

        public Calculator() {
            setTitle("Calculator");
            setSize(400, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a display field
            display = new JTextField();
            display.setFont(new Font("Arial", Font.BOLD, 24));
            display.setHorizontalAlignment(SwingConstants.RIGHT);
            display.setEditable(false);

            // Create buttons
            String[] buttonLabels = {
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", ".", "=", "+"
            };

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

            for (String label : buttonLabels) {
                JButton button = new JButton(label);
                button.setFont(new Font("Arial", Font.BOLD, 24));
                button.addActionListener(this);
                buttonPanel.add(button);
            }

            // Add components to the frame
            setLayout(new BorderLayout());
            add(display, BorderLayout.NORTH);
            add(buttonPanel, BorderLayout.CENTER);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                display.setText(display.getText() + command);
            } else if (command.equals("=")) {
                secondNumber = Double.parseDouble(display.getText());
                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        break;
                }
                display.setText(String.valueOf(result));
                operator = null;
            } else {
                firstNumber = Double.parseDouble(display.getText());
                operator = command;
                display.setText("");
            }
        }

        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        }
    }
