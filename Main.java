import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {

    public Main() {

        //Setting up the Frame
        super("Chat Application");
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

        // Text Area
        final JTextArea textArea = new JTextArea();

        //Make sure you can't edit the actual chat box
        textArea.setEditable(false);

        //Bottom Panel
        JPanel jPanel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        final JTextField textField = new JTextField(10);
        JButton button1 = new JButton("Send");

        // Method for sending a message
        // An Action Listener listens for action (i.e. if it's clicked)
        button1.addActionListener(new ActionListener() {
                                      @Override
                                      // This method performs an action once the button is clicked
                                      public void actionPerformed(ActionEvent e) {
                                          // We add the text from the text field in one line
                                          textArea.append(textField.getText() + "\n");
                                          // We erase the text field to add something new
                                          textField.setText("");
                                      }
                                  });

        // Method for resetting the chat box
        JButton button2 = new JButton("Reset");
        button2.addActionListener(new ActionListener() {
                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          // Set the text area to blank
                                          textArea.setText("");
                                      }
                                  });

        // Adding all the elements to the panel
        jPanel.add(label);
        jPanel.add(textField);
        jPanel.add(button1);
        jPanel.add(button2);



        // Adding the various areas to the overall container
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
