package abstractNew;

import abstractNew.ui.MacUI;
import abstractNew.ui.UI;
import abstractNew.ui.WinUI;

public class Application {
    public static void main(String[] args) {
        UI mac = new MacUI();
        mac.buttonCreation().point();

        UI win = new WinUI();
        win.checkBoxCreation().point();
    }
}
