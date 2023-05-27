import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class HomePantallaPrincipal extends JDialog {
    private JButton iniciarSesiònButton;
    private JButton registroButton;
    private JButton cancelarButton;
    private JPanel JHomePanel;

    public HomePantallaPrincipal(JFrame parent) {
        super (parent);
        setTitle("Pantalla principal");
        setContentPane(JHomePanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
    registroButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

                dispose();
                RegistroForm FormularioRegistro = new RegistroForm(null);
                FormularioRegistro.setVisible(true);



            //RegistroForm FormularioRegistro = new RegistroForm(null);
            //FormularioRegistro.setVisible(true);
        }
    });
        iniciarSesiònButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                LoginForm form1 = new LoginForm(null);
                form1.setVisible(true);
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        HomePantallaPrincipal Home = new HomePantallaPrincipal(null);
        Home.setVisible(true);

     }
}
