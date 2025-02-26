/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Aplicacion extends JFrame {

    public Aplicacion() {
        // Configuración de la ventana
        setTitle("Sistema de Gestión de Biblioteca");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Agregar un mensaje de bienvenida
        add(new JLabel("¡Bienvenido al sistema!", JLabel.CENTER));
    }

    public static void iniciar() {
        SwingUtilities.invokeLater(() -> {
            Aplicacion app = new Aplicacion();
            app.setVisible(true);
        });
    }
}
