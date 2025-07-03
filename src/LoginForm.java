import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel loginPanel;
    private JTextField userText;
    private JTextField passwordText;
    private JButton accesoButton;
    private JButton limpiarButton;

    public LoginForm() {
        setTitle("Login");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(loginPanel);
        setLocationRelativeTo(null);
        setVisible(true);

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String pass = passwordText.getText();
                if(!user.equals("ganchala") && !pass.equals("esfot123")){
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas","ERROR",JOptionPane.ERROR_MESSAGE);
                }else if(user.isEmpty() || pass.isEmpty() ){
                    JOptionPane.showMessageDialog(null,"Los campos son obligatorios","ERROR",JOptionPane.ERROR_MESSAGE);
                }else if(user.equals("ganchala") && pass.equals("esfot123")){
                    MenuForm menu = new MenuForm();
                    setVisible(true);
                    dispose();
                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passwordText.setText("");

            }
        });
    }
}
