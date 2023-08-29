package abstractNew.os.mac;

import abstractNew.Button;

public class MacButton implements Button {
    @Override
    public void point() {
        System.out.println("Mac button");
    }
}
