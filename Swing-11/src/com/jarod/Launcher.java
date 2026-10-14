package com.jarod;

import java.awt.EventQueue;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Launcher
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 14.oct.2026
 * URL: https://youtu.be/tuN0SnLsBlI?si=QPAKoSqByymKDqj1
 */
public class Launcher {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                for (LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
                    if ("Nimbus".equals(info.getName())){
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }
                new MainFrame();
            }
        });
    }
}
