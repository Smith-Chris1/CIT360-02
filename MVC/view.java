package MVCPatterns;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.*;

public class view extends JFrame {
    private model model;
    public JButton CloseButton = new JButton("Close");

    public  view(model model) throws HeadlessException {
        this.model = model;
        JFrame frame = new JFrame();

        frame.setSize(600, 200);
        frame.setTitle("Open the view");

        JPanel panel = new JPanel();
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JButton("Close the view"));
        JLabel textLine  = new JLabel("I'm the view and I have the model: " + model);

        panel.add(textLine);
        panel.add(CloseButton);
        frame.add(panel);
        frame.setVisible(true);
    }

    void CloseButtonListener(ActionListener listenForCloseButton){

        CloseButton.addActionListener(listenForCloseButton);

    }



}