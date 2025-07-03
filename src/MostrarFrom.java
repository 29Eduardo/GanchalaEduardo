import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MostrarFrom extends JFrame {
    private JPanel mostrarPanel;
    private JButton regresarButton;
    private JLabel codigoLabel;
    private JLabel nombreLabel;
    private JLabel detalleLabel;
    private JLabel stocksActualLabel;

    public MostrarFrom() {
        setTitle("Mostrar Productos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setContentPane(mostrarPanel);
        setVisible(true);


        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuForm menu = new MenuForm();
                menu.setVisible(true);
                dispose();
            }
        });
    }
}
