import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentasForm extends JFrame {
    private JPanel ventasPanel;
    private JButton calcularButton;
    private JButton regresarButton;
    private JTextField codigoText;
    private JTextField productoText;
    private JTextField precioText;
    private JTextField cantidadText;
    private JLabel totalLabel;
    private JLabel subtotalLabel;

    public VentasForm() {
        setTitle("Ventas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setContentPane(ventasPanel);
        setLocationRelativeTo(null);
        setVisible(true);


        calcularButton.addActionListener(new ActionListener() {
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
