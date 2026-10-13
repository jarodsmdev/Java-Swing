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
 * URL: https://youtu.be/1vVJPzVzaK8?si=0hKrfYvq9stCJTFb
 * URL: https://github.com/JavaCodeJunkie/Swing/
 */
public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                MainWindow main = new MainWindow();
                main.show();
            }
        });
    }
}
