package com.jarod;

import javax.swing.SwingUtilities;

/**
 * Launcher
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 14.oct.2026
 * URL: https://youtu.be/ObVnyA8ar6Q?si=EeLwq4c2baXo1KaP
 */
public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.show();
            }
        
        });
    }
}
