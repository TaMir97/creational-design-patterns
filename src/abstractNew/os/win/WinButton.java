package abstractNew.os.win;


import abstractNew.Button;

public class WinButton implements Button {
    @Override
    public void point() {
        System.out.println("Windows Button");
    }
}
