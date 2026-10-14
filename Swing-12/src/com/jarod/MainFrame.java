package com.jarod;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

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
    
    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setTitle("MigLayout Demo");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
        panel = new JPanel(new MigLayout("wrap, insets 10, fill, debug", "[]10[]10[]", "[]10[]10[]"));
        
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 5"));
        panel.add(new JButton("Button 6"));
        panel.add(new JButton("Button 7"));
        panel.add(new JButton("Button 8"));
        panel.add(new JButton("Button 9"));
        
        frame.add(panel, BorderLayout.CENTER);
        
        frame.pack();       
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
