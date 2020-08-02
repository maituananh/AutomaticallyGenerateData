package maituananh.com.agd.actioncomponents.jbutton;

import maituananh.com.agd.agdutilscommon.AGDUtilsCommonUI;
import maituananh.com.agd.agdutilscommon.impl.AGDUtilsCommonUIImpl;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelCenterGenerateData;
import maituananh.com.agd.model.AGDModelDynamic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AGDActionButtonAddMain implements ActionListener {
    private AGDUtilsCommonUI mAGDUtilsCommonUI;
    private AGDJPanelCenterGenerateData mAGDJPanelCenterGenerateData;
    private AGDModelDynamic mAGDModelDynamic;

    public AGDActionButtonAddMain(AGDJPanelCenterGenerateData inAGDJPanelCenterGenerateData, AGDModelDynamic inAGDModelDynamic) {
        this.mAGDJPanelCenterGenerateData = inAGDJPanelCenterGenerateData;
        this.mAGDUtilsCommonUI = new AGDUtilsCommonUIImpl();
        this.mAGDModelDynamic = inAGDModelDynamic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mAGDJPanelCenterGenerateData.createPanelLine();
        mAGDModelDynamic.getAgdJButton().getButtonAdd().setVisible(false);
        mAGDModelDynamic.getJLabelEmpty().setVisible(true);
        mAGDUtilsCommonUI.updateUI(mAGDJPanelCenterGenerateData);
        mAGDUtilsCommonUI.jScrollAutoScrollWayDown(mAGDJPanelCenterGenerateData);
    }
}
