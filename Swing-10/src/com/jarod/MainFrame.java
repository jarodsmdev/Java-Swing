package com.jarod;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class MainFrame implements ActionListener{
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
        frame.setTitle("ActionListener Demo");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));
        frame.setLocationRelativeTo(null);
        
        panel = new JPanel();
        label = new JLabel("Enter your name");
        textField = new JTextField(20);
        button = new JButton("Save");
        
        button.addActionListener(this);
        
        /*
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });
        */
        
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        frame.add(panel, BorderLayout.CENTER);
    }
    
    public void show(){
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(textField.getText());
    }
}
