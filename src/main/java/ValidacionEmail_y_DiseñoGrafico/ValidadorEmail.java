package ValidacionEmail_y_DiseñoGrafico;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.regex.Pattern;

public class ValidadorEmail extends JFrame {
    private JTextField campoEmail;
    private JLabel etiquetaValidacion;

    public ValidadorEmail() {
        campoEmail = new JTextField();
        etiquetaValidacion = new JLabel();

        campoEmail.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validar();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validar();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validar();
            }

            private void validar() {
                String email = campoEmail.getText();
                boolean esValido = Pattern.matches("^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[a-zA-Z]{2,})$", email);
                etiquetaValidacion.setText(esValido ? "Email válido" : "Email no válido");
                etiquetaValidacion.setForeground(esValido ? Color.GREEN : Color.RED);
            }
        });

        setLayout(new BorderLayout());
        add(campoEmail, BorderLayout.CENTER);
        add(etiquetaValidacion, BorderLayout.SOUTH);

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

