import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroFrom extends JFrame {
    private JPanel registroPanel;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JTextField codigoText;
    private JTextField nombreText;
    private JTextField detalleText;
    private JTextField precioText;
    private JTextField stockText;
    private JButton regresarButton;

    public RegistroFrom() {
        setTitle("Registro de ventas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setContentPane(registroPanel);
        setVisible(true);

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = codigoText.getText();
                String nombre = nombreText.getText();
                String detalle = detalleText.getText();
                double precio = Double.parseDouble(precioText.getText());
                int stock = Integer.parseInt(stockText.getText());


                if (codigo.equals("")||nombre.equals("")||detalle.equals("")||precio==0||stock==0) {
                    JOptionPane.showMessageDialog(null,"Los campos son obligatorios","Error",JOptionPane.ERROR_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Registro guardado exitosamente");
                    MostrarFrom mostrar = new MostrarFrom(codigo,nombre, detalle,stock);
                    codigoText.setText("");
                    nombreText.setText("");
                    detalleText.setText("");
                    precioText.setText("");
                    stockText.setText("");
                }
                if(precio > 1000){
                    JOptionPane.showMessageDialog(null,"Precio no puede ser mayor que 1000");
                }else if (stock > 100){
                    JOptionPane.showMessageDialog(null,"Stock no puede ser mayor que 100");
                }

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoText.setText("");
                nombreText.setText("");
                detalleText.setText("");
                precioText.setText("");
                stockText.setText("");

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
