package com.jarod;

import javax.swing.SwingUtilities;

/**
 * Launcher
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 15.oct.2026
 * URL: https://youtu.be/Z8E9fWti41U?si=FT2JUn9DJyk1u17H
 */
public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.show();
            }
        });
    }
}
