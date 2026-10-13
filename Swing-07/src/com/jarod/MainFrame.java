package com.jarod;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
    private JButton button;

    public MainFrame() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("JButton Demo");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        button = createButton();

        panel = new JPanel();
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
    }

    public void show() {
        frame.setVisible(true);
    }

    private JButton createButton() {
        JButton button = new JButton("Print");
        button.setFocusable(false);

        ImageIcon printIcon = new ImageIcon("print.png");
        button.setIcon(printIcon);

        button.setIconTextGap(10);

        button.setToolTipText("Some awesome text for the print button");

        button.setFont(new Font("Arial", Font.PLAIN, 16));

        button.setMargin(new Insets(10, 30, 10, 30));

        button.setMnemonic(KeyEvent.VK_P);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Print button has been clicked",
                        "Print Button",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

        });
        
        //button.setEnabled(false);
        
        //button.doClick();
        
        //button.setVerticalTextPosition(SwingConstants.BOTTOM);
        //button.setHorizontalTextPosition(SwingConstants.CENTER);

        button.setVerticalTextPosition(SwingConstants.CENTER);
        button.setHorizontalTextPosition(SwingConstants.LEFT);
        
        button.setPreferredSize(new Dimension(200, 75));
        
        return button;
    }
}
