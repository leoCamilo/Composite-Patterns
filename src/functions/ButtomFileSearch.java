package functions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtomFileSearch implements ActionListener {
    private JFileChooser fileChooser = new JFileChooser();

    @Override
    public void actionPerformed(ActionEvent e) {
        int retorno = fileChooser.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            // do things here
        } else {
            // do others things here
        }
    }
}
