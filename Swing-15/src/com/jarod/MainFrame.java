package com.jarod;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * MainFrame
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 15.oct.2026
 */
public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JCheckBox checkbox;
    
    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setTitle("JCheckBox Demo");
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        Font font = new Font("sans-serif", Font.PLAIN, 24);
        UIManager.put("CheckBox.font", font);
        
        panel = new JPanel();
        
        checkbox = new JCheckBox();
        checkbox.setText("CheckBox");
        System.out.println(checkbox.getText());
        checkbox.setMnemonic(KeyEvent.VK_C);
        
        panel.add(checkbox);
        
        frame.add(panel);
        
    }
    
    public void show(){
        frame.setVisible(true);
    }
}
