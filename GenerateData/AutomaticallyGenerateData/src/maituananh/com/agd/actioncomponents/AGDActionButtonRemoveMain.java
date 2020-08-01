package maituananh.com.agd.actioncomponents;

import maituananh.com.agd.agdutilscommon.AGDUtilsCommonUI;
import maituananh.com.agd.agdutilscommon.impl.AGDUtilsCommonUIImpl;
import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AGDActionButtonRemoveMain implements ActionListener {
    private AGDJPanelGenerateData agdjPanelGenerateData;
    private AGDUtilsCommonUI mAGDUtilsCommon;

    public AGDActionButtonRemoveMain(AGDJPanelGenerateData inAGDJPanelGenerateData) {
        this.agdjPanelGenerateData = inAGDJPanelGenerateData;
        mAGDUtilsCommon = new AGDUtilsCommonUIImpl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (agdjPanelGenerateData.getPanelCenterGenerateData().getAGDModelDynamicList().size() >= 2) {
            agdjPanelGenerateData.getPanelCenterGenerateData().remove(
                    agdjPanelGenerateData.getPanelCenterGenerateData().getJPanelLine());
            agdjPanelGenerateData.getPanelCenterGenerateData().getAGDModelDynamicList().remove(0);
            mAGDUtilsCommon.updateUI(agdjPanelGenerateData);
        }
    }
}
