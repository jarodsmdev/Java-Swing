package com.jarod;

import javax.swing.SwingUtilities;

/**
 * JFrameDemo
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 12.oct.2026
 * URL: https://youtu.be/4BRUmU-ETRk?si=Zwcs4htQEpFgkpGl
 * URL: https://github.com/JavaCodeJunkie/Swing/
 */
public class JFrameDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                JFrameOne frame1 = new JFrameOne();
                
                JFrameTwo frame2 = new JFrameTwo();
            }
        });
    }
}
