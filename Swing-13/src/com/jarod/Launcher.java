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
 * URL: https://youtu.be/bMBsqqFHvJo?si=_46e4Q_M9IrxdhE9
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
