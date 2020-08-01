package maituananh.com.agd.actioncomponents;

import maituananh.com.agd.agdutilscommon.AGDUtilsCommonUI;
import maituananh.com.agd.agdutilscommon.impl.AGDUtilsCommonUIImpl;
import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelCenterGenerateData;
import maituananh.com.agd.model.AGDModelDynamic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AGDActionButtonRemoveDynamic implements ActionListener {
    private AGDModelDynamic mAGDModelDynamic;
    private AGDJPanelCenterGenerateData mAGDJPanelCenterGenerateData;
    private AGDJPanelGenerateData mAGDJPanelGenerateData;
    private AGDUtilsCommonUI mAGDUtilsCommon;

    public AGDActionButtonRemoveDynamic(AGDModelDynamic inAGDModelDynamic, AGDJPanelGenerateData inAGDJPanelGenerateData,
                                        AGDJPanelCenterGenerateData inAGDJPanelCenterGenerateData) {
        this.mAGDJPanelCenterGenerateData = inAGDJPanelCenterGenerateData;
        this.mAGDModelDynamic = inAGDModelDynamic;
        this.mAGDJPanelGenerateData = inAGDJPanelGenerateData;
        mAGDUtilsCommon = new AGDUtilsCommonUIImpl();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (mAGDJPanelGenerateData.getPanelCenterGenerateData().getAGDModelDynamicList().size() >= 2) {
            String lastJPanel = mAGDJPanelCenterGenerateData.getAGDModelDynamicList().get(mAGDJPanelCenterGenerateData.
                    getAGDModelDynamicList().size() - 1).getJPanelLine().toString();
            // if remove last line then line above enable button add
            if (mAGDModelDynamic.getJPanelLine().toString().equals(lastJPanel)) {
                mAGDJPanelCenterGenerateData.getAGDModelDynamicList().get(mAGDJPanelCenterGenerateData.
                        getAGDModelDynamicList().size() - 2).getAgdJButton().getButtonAdd().setVisible(true);
                mAGDJPanelCenterGenerateData.getAGDModelDynamicList().get(mAGDJPanelCenterGenerateData.
                        getAGDModelDynamicList().size() - 2).getJLabelEmpty().setPreferredSize(new Dimension(20, 30));
            }
            // Remove in UI
            mAGDJPanelGenerateData.getPanelCenterGenerateData().remove(mAGDModelDynamic.getJPanelLine());
            // Remove in List
            this.mAGDJPanelCenterGenerateData.getAGDModelDynamicList().remove(mAGDModelDynamic);
            mAGDUtilsCommon.updateUI(mAGDJPanelGenerateData);
        }
    }
}
