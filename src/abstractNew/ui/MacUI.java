package abstractNew.ui;
import abstractNew.Button;
import abstractNew.CheckBox;
import abstractNew.os.mac.MacButton;
import abstractNew.os.mac.MacCheckBox;

public class MacUI implements UI{

    @Override
    public CheckBox checkBoxCreation() {
        return new MacCheckBox();
    }

    @Override
    public Button buttonCreation() {
        return new MacButton();
    }
}
