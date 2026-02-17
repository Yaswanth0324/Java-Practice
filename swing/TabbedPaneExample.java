import javax.swing.*;

public class TabbedPaneExample {
    JFrame f;

    TabbedPaneExample() {
        f = new JFrame();

        // Create a text area and add it to the first panel
        JTextArea ta = new JTextArea(10, 20); // rows, columns
        JPanel p1 = new JPanel();
        p1.add(ta);

        // Create empty panels for the other tabs
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Create tabbed pane and add tabs
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 200, 200);
        tp.add("Main", p1);
        tp.add("Visit", p2);
        tp.add("Help", p3);

        // Add tabbed pane to frame
        f.add(tp);

        // Frame settings
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneExample();
    }
}
