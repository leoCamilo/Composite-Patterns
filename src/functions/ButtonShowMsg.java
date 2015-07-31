package functions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonShowMsg implements ActionListener {
    JOptionPane msg;
    String text;

    @Override
    public void actionPerformed(ActionEvent e) {
        msg.showMessageDialog(null, text);
    }

    public ButtonShowMsg(String text){
        this.text = text;
        msg = new JOptionPane();
    }
}
