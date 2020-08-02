package maituananh.com.agd.agdutilscommon.impl;

import maituananh.com.agd.agdutilscommon.AGDUtilsCommonUI;

import javax.swing.*;
import java.awt.*;

public class AGDUtilsCommonUIImpl implements AGDUtilsCommonUI {

    @Override
    public void updateUI(Component component) {
        component.validate();
        component.repaint();
        component.revalidate();
    }

    @Override
    public void jScrollAutoScrollWayDown(JPanel inJPanel) {
        int height = (int)inJPanel.getPreferredSize().getHeight();
        Rectangle rect = new Rectangle(0,height,10,10);
        inJPanel.scrollRectToVisible(rect);
    }
}
