package maituananh.com.agd.actioncomponents;

import maituananh.com.agd.agdutilscommon.AGDUtilsCommonUI;
import maituananh.com.agd.agdutilscommon.impl.AGDUtilsCommonUIImpl;
import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AGDActionButtonAddMain implements ActionListener {
    private AGDJPanelGenerateData agdjPanelGenerateData;
    private AGDUtilsCommonUI mAGDUtilsCommonUI;

    public AGDActionButtonAddMain(AGDJPanelGenerateData inAGDJPanelGenerateData) {
        this.agdjPanelGenerateData = inAGDJPanelGenerateData;
        mAGDUtilsCommonUI = new AGDUtilsCommonUIImpl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        agdjPanelGenerateData.getPanelCenterGenerateData().createPanelLine();
        agdjPanelGenerateData.getPanelCenterGenerateData().getButtonAdd().setVisible(false);
        agdjPanelGenerateData.getPanelCenterGenerateData().getJLabelEmpty().setPreferredSize(new Dimension(52, 30));
        mAGDUtilsCommonUI.updateUI(agdjPanelGenerateData);
    }
}
