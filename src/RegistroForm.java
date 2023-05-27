import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class RegistroForm extends JDialog{
    private JTextField txNombre;
    private JTextField txCorreo;
    private JTextField txTelefono;
    private JTextField txDomicilio;
    private JPasswordField txPassword;
    private JPasswordField txConfirmPass;
    private JButton btnRegistro;
    private JButton btnCancelar;
    private JPanel PanelRegistro;

    public RegistroForm(JFrame parent){

        super(parent);
        setTitle("Crear nuevo usuario");
        setContentPane(PanelRegistro);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnRegistro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroUsuario();
            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void RegistroUsuario() {
              String nombre =txNombre.getText();
              String email = txCorreo.getText();
              String telefono= txTelefono.getText();
              String direccion =txDomicilio.getText();
              String password = String.valueOf(txPassword.getPassword());
              String Confirmarpassword = String.valueOf(txConfirmPass.getPassword());

              if(nombre.isEmpty() || email.isEmpty() || telefono.isEmpty() ||direccion.isEmpty() || password.isEmpty() || Confirmarpassword.isEmpty()){
                  JOptionPane.showMessageDialog(this,
                          "Complete los campos vacios ",
                          "Intentalo de nuevo",
                          JOptionPane.ERROR_MESSAGE);
                  return;
              }
              if(!password.equals(Confirmarpassword)){
                  JOptionPane.showMessageDialog(this,
                                                  "La contraseña no coincide",
                                                   "Intentalo de nuevo",
                                                    JOptionPane.ERROR_MESSAGE);
                  return;
              }

              usuario = AgregarUsuarioDB(nombre,email,telefono,direccion,password);


              if(usuario!=null){
                  dispose();
              }else{
                  JOptionPane.showMessageDialog(this,
                                       "Error al registrar usuario","Intentalo de nuevo",
                                           JOptionPane.ERROR_MESSAGE);
              }
    }

    public Usuario usuario;
    private Usuario AgregarUsuarioDB(String nombre, String email, String telefono, String direccion, String password) {
        Usuario usuario = null;
        final String Url = "jdbc:mysql://localhost/hotel?serverTimezone=UTC";
        final String USUARIO ="cris";
        final String PASSWORD ="123456";

        try {
            Connection con = DriverManager.getConnection(Url,USUARIO,PASSWORD);

            Statement stat = con.createStatement();
            String sql = "INSERT INTO users(nombre,correo,telefono,domicilio,password)VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,telefono);
            preparedStatement.setString(4,direccion);
            preparedStatement.setString(5,password);

            int actualizaTabla = preparedStatement.executeUpdate();
            if(actualizaTabla>0){
                usuario= new Usuario();
                usuario.nombre=nombre;
                usuario.email=email;
                usuario.telefono=telefono;
                usuario.direccion=direccion;
                usuario.password=password;
            }
            stat.close();
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return usuario;
    }

    public static void main(String[] args) {
        RegistroForm FormularioRegistro = new RegistroForm(null);
        Usuario usuario1 =FormularioRegistro.usuario;
        if(usuario1 != null){
            System.out.println("Registro exitoso");
        }else{
            System.out.println("Registro Fallido");
        }
        
    }
}
