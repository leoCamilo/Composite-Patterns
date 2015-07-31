package Composite;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InterfaceComposite {
    private JFrame screen;
    private JPanel organizer;
    private JOptionPane msg;
    private JFileChooser fileChooser = new JFileChooser();

    private ArrayList<JComponent> componentList;

    public void showMsg(String text){
        msg.showMessageDialog(null, text);
    }

    public void openFileSearch() {
        int retorno = fileChooser.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            msg.showMessageDialog(null, "abriu");
        } else {
            msg.showMessageDialog(null, "nao abriu");
        }
    }

    public void showScreen(){
        for(int i = (componentList.size() - 1); i >= 0; i--){
            organizer.add(componentList.get(i));
        }

        screen.add(organizer);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.pack();
        screen.setSize(600,600);
        screen.setVisible(true);
    }

    public void addButtom(String text){
        componentList.add(new JButton(text));
    }

    public void addButtom(String text, ActionListener function){
        JButton tempButton = new JButton(text);
        tempButton.addActionListener(function);
        componentList.add(tempButton);
    }

    public void addTextField(int size){
        componentList.add(new JTextField(size));
    }

    public void addLabel(String text){
        componentList.add(new JLabel(text));
    }

    public void addTextArea(int line, int column){
        componentList.add(new JTextArea(line, column));
    }

    public InterfaceComposite(){
        msg = new JOptionPane();
        screen = new JFrame("Composite Frame");
        organizer = new JPanel();
        fileChooser = new JFileChooser();
        componentList = new ArrayList<>();
    }
}
