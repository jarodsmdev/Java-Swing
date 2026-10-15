package com.jarod;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

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
    private JLabel label;
    private JPasswordField passwordField;
    private JButton button;
    
    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setTitle("JPasswordField Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));
        
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        layout.setHgap(10);
        layout.setVgap(10);
        
        frame.setLayout(layout);
        
        label = new JLabel("Enter Password: ");
        passwordField = new JPasswordField(20);
        //passwordField.setText("letmecomein");
        passwordField.setEchoChar('#');
        
        button = new JButton("Check");
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] pf = passwordField.getPassword();
                String value = new String(pf);
                JOptionPane.showMessageDialog(null, value);
            }
            
        });
        
        frame.add(label);
        frame.add(passwordField);
        frame.add(button);
        
    }
    
    public void show(){
        frame.setVisible(true);
    }
}
