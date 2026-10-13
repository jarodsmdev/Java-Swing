package com.jarod;

import javax.swing.JFrame;

/**
 * JFrameOne
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 12.oct.2026
 */
public class JFrameOne extends JFrame{
    
    public JFrameOne(){
        initialize();
    }
    
    public void initialize(){
        setTitle("JFrameOne");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
