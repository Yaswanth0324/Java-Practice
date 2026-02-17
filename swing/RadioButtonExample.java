import javax.swing.*;

public class RadioButtonExample {
    RadioButtonExample() {
        JFrame f = new JFrame("RadioButton Example");

        // Create radio buttons
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 100, 100, 30);

        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(100, 150, 100, 30);
        JRadioButton rb3 = new JRadioButton("Trans");
        rb3.setBounds(100, 200, 100, 30);

        // Group the radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        // Add radio buttons to frame
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new RadioButtonExample();
    }
}
