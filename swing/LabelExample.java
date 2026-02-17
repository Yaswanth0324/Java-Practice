import javax.swing.*;

class LabelExample {
    public static void main(String args[]) {
        JFrame f = new JFrame("Label Example");

        // Text Labels
        JLabel l1 = new JLabel("First Label.");
        l1.setBounds(50, 50, 100, 30);

        JLabel l2 = new JLabel("Second Label.");
        l2.setBounds(50, 100, 100, 30);

        // Image Label
        ImageIcon icon = new ImageIcon("srivalli.jpeg");
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(50, 150, icon.getIconWidth(), icon.getIconHeight());

        // Add labels to frame
        f.add(l1);
        f.add(l2);
        f.add(imageLabel);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
