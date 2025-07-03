import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame{
    private JPanel menuPanel;
    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    public MenuForm() {
        setTitle("Menu De Opciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setContentPane(menuPanel);
        setVisible(true);


        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroFrom registro = new RegistroFrom();
                registro.setVisible(true);
                dispose();
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentasForm ventas = new VentasForm();
                ventas.setVisible(true);
                dispose();
            }
        });
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarFrom mostrar = new MostrarFrom();
                mostrar.setVisible(true);
                dispose();
            }
        });
    }
}
