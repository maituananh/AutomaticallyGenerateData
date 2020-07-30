package maituananh.com.agd.agdcomponents;

import maituananh.com.agd.commonstatic.AGDCommonDataCombobox;

import javax.swing.*;

public class AGDJCombobox extends JComboBox {
    public AGDJCombobox() {
        for (int i = 0; i < AGDCommonDataCombobox.DATA_CBB.length; i++) {
            this.addItem(AGDCommonDataCombobox.DATA_CBB[i]);
        }
    }
}
