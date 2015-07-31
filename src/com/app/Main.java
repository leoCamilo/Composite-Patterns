package com.app;

import Composite.InterfaceComposite;
import functions.ButtomFileSearch;
import functions.ButtonShowMsg;

public class Main {

    public static void main(String[] args) {
        InterfaceComposite ic = new InterfaceComposite();
        ic.addTextField(20);
        ic.addTextArea(5, 40);

        ic.addButtom("butao 1");
        ic.addButtom("butao 2");
        ic.addButtom("butao 3");
        ic.addButtom("butao 4", new ButtomFileSearch());
        ic.addButtom("butao 5", new ButtonShowMsg("msg do botao"));

        ic.addLabel("---------------------------------------------------------- INTERFACE LINDA ----------------------------------------------------------");

        ic.showScreen();
    }
}
