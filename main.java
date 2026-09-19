import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Login");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(400,400);
            ventana.setLocationRelativeTo(null);

            JPanel panelPrincipal = new JPanel(new GridLayout(15,15));
            panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

            JLabel titulo = new JLabel("Iniciar Sesion");
            titulo.setHorizontalAlignment(SwingConstants.CENTER);

            JLabel usuario = new JLabel("Usuario:");
            JTextField usuarioText = new JTextField();

            JLabel contraseña = new JLabel("Contraseña:");
            JPasswordField contraseñaText = new JPasswordField();

            JCheckBox mostrarContraseña =
                    new JCheckBox("Mostrar contraseña");
            mostrarContraseña.setSelected(false);

            JButton Login = new JButton("Iniciar Sesion");

            JButton Cancelar = new JButton("Cancelar");

            panelPrincipal.add(titulo);
            panelPrincipal.add(new JLabel(""));

            panelPrincipal.add(usuario);
            panelPrincipal.add(new JLabel(""));

            panelPrincipal.add(usuarioText);
            panelPrincipal.add(new JLabel(""));

            panelPrincipal.add(contraseña);
            panelPrincipal.add(new JLabel(""));

            panelPrincipal.add(contraseñaText);
            panelPrincipal.add(new JLabel(""));


            panelPrincipal.add(mostrarContraseña);
            panelPrincipal.add(new JLabel(""));

            panelPrincipal.add(Login);
            panelPrincipal.add(new JLabel(""));
            panelPrincipal.add(Cancelar);

            ventana.add(panelPrincipal);
            ventana.setVisible(true);

        });
    }

}
