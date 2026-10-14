package com.jarod;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * MainFrame
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 14.oct.2026
 */
public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JTextField textField;
    private JButton button;
    
    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setTitle("Set Nimbus Look and Feel");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        panel = new JPanel();
        label = new JLabel("Enter some text");
        textField = new JTextField(20);
        button = new JButton("Click");
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        frame.add(panel, BorderLayout.CENTER);
    }
}
