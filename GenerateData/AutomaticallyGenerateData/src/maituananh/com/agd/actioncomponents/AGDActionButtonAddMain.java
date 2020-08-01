package maituananh.com.agd.actioncomponents;

import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AGDActionButtonAddMain implements ActionListener {
    private AGDJPanelGenerateData agdjPanelGenerateData;

    public AGDActionButtonAddMain(AGDJPanelGenerateData inAGDJPanelGenerateData) {
        this.agdjPanelGenerateData = inAGDJPanelGenerateData;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Create new record
        agdjPanelGenerateData.getPanelCenterGenerateData().createPanelLine();
        // Remove red button
//        agdjPanelGenerateData.getPanelCenterGenerateData().getJPanelLineButtons().
//                remove(agdjPanelGenerateData.getPanelCenterGenerateData().getButtonAdd());
        // Reset UI
        agdjPanelGenerateData.validate();
        agdjPanelGenerateData.repaint();
    }
}
