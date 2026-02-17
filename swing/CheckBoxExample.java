import javax.swing.*;

public class CheckBoxExample {
    CheckBoxExample() {
        JFrame f = new JFrame("CheckBox Example");

        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 50, 50);

        JCheckBox checkBox2 = new JCheckBox("Java");
        checkBox2.setBounds(100, 250, 100, 100);

        f.add(checkBox1);
        f.add(checkBox2);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new CheckBoxExample();
    }
}
