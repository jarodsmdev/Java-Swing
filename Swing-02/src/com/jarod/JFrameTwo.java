package com.jarod;

import javax.swing.JFrame;

/**
 * JFrameTwo
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 12.oct.2026
 */
public class JFrameTwo {
    
    private JFrame frame;
    
    public JFrameTwo(){
        initialize();
    }
    
    public void initialize(){
        frame = new JFrame();
        this.frame.setTitle("JFrameTwo");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
    }

}
