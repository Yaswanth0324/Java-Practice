import javax.swing.*;

public class ComboBoxExample {
    JFrame f;

    ComboBoxExample() {
        f = new JFrame("ComboBox Example");

        // Define the list of countries
        String country[] = {"India", "Aus", "U.S.A", "England", "Newzealand"};

        // Create ComboBox
        JComboBox<String> cb = new JComboBox<>(country);
        cb.setBounds(50, 50, 90, 20);

        // Add ComboBox to the frame
        f.add(cb);

        // Frame settings
        f.setLayout(null);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
