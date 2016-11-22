package projeto;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste
{
    private JPanel contentPane;
    private FormInicial panel;
    private FormInserir panel2;

    private void displayGUI()
    {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(
            BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new CardLayout());
        panel = new FormInicial(contentPane);
        panel2 = new FormInserir();
        contentPane.add(panel, "Panel 1"); 
        contentPane.add(panel2, "Panel 2");
        frame.setContentPane(contentPane);
        frame.pack();   
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Teste().displayGUI();
            }
        });
    }
}