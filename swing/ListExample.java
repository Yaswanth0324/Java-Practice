import javax.swing.*;

public class ListExample {
    ListExample() {
        JFrame f = new JFrame();

        // Create list model and add items
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");

        // Create JList with the model
        JList<String> list = new JList<>(l1);
        list.setBounds(100, 100, 75, 75);

        // Add to frame
        f.add(list);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new ListExample();
    }
}
