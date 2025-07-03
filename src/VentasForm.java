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
                String codigo = codigoText.getText();
                String nombre = productoText.getText();
                double precio = Integer.parseInt(precioText.getText().trim());
                int cantidad = Integer.parseInt(cantidadText.getText().trim());
                double subtotal = 0;
                subtotal += Double.parseDouble(precioText.getText().trim());
                double impuestos = subtotal * 0.15;
                double total = impuestos + subtotal;
                subtotalLabel.setText(" $" + impuestos);
                totalLabel.setText(" $" + total);

                if (codigo.equals("")|| nombre.equals("")|| precio==0||cantidad==0) {
                    JOptionPane.showMessageDialog(null, "Ingrese todos los campos son obligatorios","ERROR",JOptionPane.ERROR_MESSAGE);
                }else{

                }
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
