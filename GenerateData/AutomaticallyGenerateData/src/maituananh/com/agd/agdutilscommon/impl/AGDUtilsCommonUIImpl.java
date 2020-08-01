package maituananh.com.agd.agdutilscommon.impl;

import maituananh.com.agd.agdutilscommon.AGDUtilsCommonUI;

import java.awt.*;

public class AGDUtilsCommonUIImpl implements AGDUtilsCommonUI {

    @Override
    public void updateUI(Component component) {
        component.validate();
        component.repaint();
    }
}
