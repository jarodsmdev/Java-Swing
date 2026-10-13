package com.jarod;

import javax.swing.SwingUtilities;

/**
 * Launcher
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 12.oct.2026
 * URL: https://youtu.be/impJtkTcQ94?si=zrFfJ3WCd3cr8tLG
 * URL: https://github.com/JavaCodeJunkie/Swing/
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
