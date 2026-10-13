package com.jarod;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MainFrame
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 12.oct.2026
 */
public class MainFrame {
    
    private JFrame frame;
    private JPanel panel;
    
    public MainFrame(){
        initialize();
    }
    
    private void initialize(){
        frame = new JFrame();
        frame.setTitle("GridLayout Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        
        // Establecer el tamaño de la ventana
        frame.setSize(800, 500);
        
        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);
        
        panel = new JPanel(new GridLayout());
        
        for(int i = 1; i <= 5; i++){
            JButton button = new JButton("Button " + Integer.toString(i));
            panel.add(button);
        }
        
        // Agregar el panel al frame
        frame.add(panel);
        
        frame.pack();
    }

    public void show() {
        frame.setVisible(true);
    }

}
