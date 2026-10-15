package com.jarod;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

/**
 * MainFrame
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 14.oct.2026
 */
public class MainFrame implements ActionListener {

    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newMenuItem;
    private JMenuItem saveMenuItem;
    private JMenuItem exitMenuItem;

    public MainFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("JMenu Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setLocationRelativeTo(null);

        // Change font size for Menu and MenuItem
        Font font = new Font("sans-serif", Font.PLAIN, 16);
        UIManager.put("Menu.font", font);
        UIManager.put("MenuItem.font", font);
        UIManager.put("CheckBoxMenuItem", font);
        UIManager.put("RadioButtonMenuItem  ", font);

        ImageIcon icon = new ImageIcon("images/new.gif");
        newMenuItem = new JMenuItem("New...");
        newMenuItem.setIcon(icon);
        newMenuItem.setIconTextGap(10);
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        newMenuItem.addActionListener(this);

        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setIconTextGap(10);
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        saveMenuItem.addActionListener(this);

        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setIconTextGap(10);
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        exitMenuItem.addActionListener(this);

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(new JRadioButtonMenuItem("RadioButton"));
        fileMenu.add(new JCheckBoxMenuItem("Checkbox"));

        JMenu subMenu = new JMenu("Sub Menu");

        JMenuItem openMenuItem = new JMenuItem("Open..");
        openMenuItem.addActionListener(this);

        JMenuItem settingsMenuItem = new JMenuItem("Settings...");
        settingsMenuItem.addActionListener(this);

        subMenu.add(openMenuItem);
        subMenu.add(settingsMenuItem);

        fileMenu.add(subMenu);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menuBar = new JMenuBar();
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

    }

    public void show() {
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JMenuItem) {
            JMenuItem item = (JMenuItem) e.getSource();
            String text = item.getText();
            System.out.println(text);
        }
    }
}
