import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class LoginForm extends JDialog {
    private JTextField txEmail;
    private JPasswordField txPassword;
    private JButton btnIniciar;
    private JButton btnCancelar;
    private JPanel LoginPanel;
    private JButton homeButton;

    public LoginForm(JFrame parent){
         super (parent);
         setTitle("Inicia Sesión");
         setContentPane(LoginPanel);
         setMinimumSize(new Dimension(450,474));
         setModal(true);
         setLocationRelativeTo(parent);

        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = txEmail.getText();
                String password = String.valueOf(txPassword.getPassword());



                usuario = VerificarUsuario(email,password);
                if(usuario!=null){
                    dispose();
                    new ReservacionHotel().setVisible(true);
                    //invocar nueva ventana

                }else{
                    JOptionPane.showMessageDialog(LoginForm.this,"Correo o Contraseña Invalidos",
                                                   "Intentalo de nuevo",
                                                     JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

    }

    public Usuario usuario;
    private Usuario VerificarUsuario(String email, String password) {
         Usuario usuario = null;
         final String URL="jdbc:mysql://localhost/hotel?serverTimezone=UTC";
         final String USER="cris";
         final String PASSWORD="123456";

         try {
             Connection con = DriverManager.getConnection(URL,USER,PASSWORD);

             Statement stat = con.createStatement();
             String sql ="SELECT * FROM users WHERE correo=? AND password=?";
             PreparedStatement preparedStatement = con.prepareStatement(sql);
             preparedStatement.setString(1,email);
             preparedStatement.setString(2,password);

             ResultSet resultSet = preparedStatement.executeQuery();

             if(resultSet.next()){


                   //  new ReservacionHotel().setVisible(true);



                 usuario = new Usuario();
                 usuario.nombre = resultSet.getString("nombre");
                 usuario.email = resultSet.getString("correo");
                 usuario.telefono = resultSet.getString("telefono");
                 usuario.direccion = resultSet.getString("domicilio");
                 usuario.password = resultSet.getString("password");

                // Usuario ReservacionHotel = new Usuario();
                // return ReservacionHotel;

             }

             stat.close();
             con.close();

         }catch(Exception e){
             e.printStackTrace();
         }

         return usuario;

        // String usuario = txEmail.getText();
      //  String contrasena = String.valueOf(txPassword.getPassword());

      //  if(usuario.isEmpty() || contrasena.isEmpty() ){
      //      JOptionPane.showMessageDialog(this,"Necesario completar datos",
     //               "Intentelo de nuevo",JOptionPane.ERROR_MESSAGE);
        }



    public static void main(String[] args) {
        LoginForm form1 = new LoginForm(null);
        Usuario usuario1 = form1.usuario;

        if(usuario1!=null){
            System.out.println("Datos correctos Bienvenido:"+usuario1.nombre);
            System.out.println("             Correo: " + usuario1.email);
            System.out.println("             Telefono: " + usuario1.telefono);
            System.out.println("             Correo: "+ usuario1.direccion);
        }else{
            System.out.println("Inicio de sesion cancelado");
        }
    }
}
