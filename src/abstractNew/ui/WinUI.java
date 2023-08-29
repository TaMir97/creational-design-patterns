package abstractNew.ui;

import abstractNew.Button;
import abstractNew.CheckBox;
import abstractNew.os.win.WinButton;
import abstractNew.os.win.WinCheckBox;

public class WinUI implements UI{
    @Override
    public CheckBox checkBoxCreation() {
        return new WinCheckBox();
    }

    @Override
    public Button buttonCreation() {
        return new WinButton();
    }
}
