import javax.swing.*;

class TextFieldExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("TextField Example");

        // Create text fields
        JTextField t1, t2;

        t1 = new JTextField("Welcome to Javatpoint.");
        t1.setBounds(50, 100, 200, 30);

        t2 = new JTextField("AWT Tutorial");
        t2.setBounds(50, 150, 200, 30);

        // Add text fields to the frame
        f.add(t1);
        f.add(t2);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
