import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MainForm extends JFrame {
    
    /**
     * initialize form components
     */
    private void initComponents() {
        JMenuBar mainMenu = new JMenuBar();

        // File menu

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_X);
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.CTRL_DOWN_MASK));
        exitMenuItem.addActionListener(new ActionListener() { 
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Help menu

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);

        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.setMnemonic(KeyEvent.VK_A);
        aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke("F1"));
        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello there!", "About", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // setup menu
        
        fileMenu.add(exitMenuItem);
        mainMenu.add(fileMenu);
        
        helpMenu.add(aboutMenuItem);
        mainMenu.add(helpMenu);

        setJMenuBar(mainMenu);
    }

    /**
     * default constructor
     */
    public MainForm() {
        initComponents();

        setTitle("Hello");
        setSize(640, 480);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
