package maituananh.com.agd.actioncomponents.jbutton;

import maituananh.com.agd.agdutilscommon.AGDUtilsCommonUI;
import maituananh.com.agd.agdutilscommon.impl.AGDUtilsCommonUIImpl;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelCenterGenerateData;
import maituananh.com.agd.model.AGDModelDynamic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AGDActionButtonRemoveMain implements ActionListener {
    private AGDJPanelCenterGenerateData mAGDJPanelGenerateData;
    private AGDUtilsCommonUI mAGDUtilsCommon;
    private AGDModelDynamic mAGDModelDynamic;

    public AGDActionButtonRemoveMain(AGDJPanelCenterGenerateData inAGDJPanelGenerateData, AGDModelDynamic inAGDModelDynamic) {
        this.mAGDJPanelGenerateData = inAGDJPanelGenerateData;
        this.mAGDUtilsCommon = new AGDUtilsCommonUIImpl();
        this.mAGDModelDynamic = inAGDModelDynamic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        List<AGDModelDynamic> modelDynamicList = mAGDJPanelGenerateData.getAGDModelDynamicList();
        if (modelDynamicList.size() >= 2) {
            // Check when last red button clicked
            if (mAGDModelDynamic.toString().equals(modelDynamicList.get(modelDynamicList.size() - 1).toString())) {
                // Disable red button above
                modelDynamicList.get(modelDynamicList.size() - 2).getAgdJButton().getButtonAdd().setVisible(true);
                // Hidden JLabelEmpty between red button and green button
                modelDynamicList.get(modelDynamicList.size() - 2).getJLabelEmpty().setVisible(false);
            }
            mAGDJPanelGenerateData.remove(mAGDModelDynamic.getJPanelLine());
            mAGDJPanelGenerateData.getAGDModelDynamicList().remove(mAGDModelDynamic);
            mAGDJPanelGenerateData.remove(mAGDModelDynamic.getJPanelLineEmpty());
            mAGDUtilsCommon.updateUI(mAGDJPanelGenerateData);
        }
    }
}
