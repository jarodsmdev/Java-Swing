package com.jarod;

import java.awt.BorderLayout;
import java.awt.Color;
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
    private JPanel panel;
    
    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setTitle("FlowLayout Demo");
        
        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.PINK);
        
        for(int i = 1; i <= 5; i++){
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }
        
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        frame.add(panel, BorderLayout.CENTER);
    }
    
    public void show(){
        frame.setVisible(true);
    }
}
