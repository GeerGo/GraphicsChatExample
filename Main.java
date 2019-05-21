import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {

    public Main() {

        //Setting up the Frame
        super("First Frame");
        setSize(500, 300);
        setLocation(400, 300);

        // Menu bar
        JMenuBar jmb = new JMenuBar();
        JMenu jm1 = new JMenu("FILE");
        JMenu jm2 = new JMenu("Help");
        jmb.add(jm1);
        jmb.add(jm2);
        jm1.add(new JMenuItem("Open"));
        jm1.add(new JMenuItem("Save as"));

        //Bottom Panel
        JPanel jPanel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JTextField textField = new JTextField(10);
        JButton button1 = new JButton("Send");
        JButton button2 = new JButton("Reset");
        jPanel.add(label);
        jPanel.add(textField);
        jPanel.add(button1);
        jPanel.add(button2);

        // Text Area
        JTextArea textArea = new JTextArea();

        // P
        Container cp = getContentPane();
        cp.add(BorderLayout.SOUTH, jPanel);
        cp.add(BorderLayout.NORTH, jmb);
        cp.add(BorderLayout.CENTER, textArea);


        setVisible(true);
    }

    public static void main(String[] args) {
        Main mfgui = new Main();
        mfgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
