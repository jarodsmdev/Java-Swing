package com.jarod;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MainFrame
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 12.oct.2026
 */
public class MainFrame {
    private JFrame frame;
    
    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setLayout(new BorderLayout(10,5));
        frame.setTitle("Java Swing JPanel Demo");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        
        panel.setBackground(Color.red);
        
        JButton button1 = new JButton("Button");
        panel.add(button1);
        
        JButton button2 = new JButton("Button");
        panel.add(button2);
        
        JButton button3 = new JButton("Button");
        panel.add(button3);
        
        panel.setPreferredSize(new Dimension(250, 100));
        
        frame.add(panel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
