package maituananh.com.agd.jpanel;

import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;
<<<<<<< HEAD
=======
import maituananh.com.agd.jpanel.parentsubjpanel.AGDJScrollGenerateData;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelBottomGenerateData;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelCenterGenerateData;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelTopGenerateData;
>>>>>>> b446b90fe3173f9f2cb3fa96e24e4bd41b9a5f61

import javax.swing.*;
import java.awt.*;

public class AGDJPanelMain extends JPanel {

    public AGDJPanelMain() {
        setLayout();
        addComponents();
    }

    private void setLayout() {
        this.setLayout(new BorderLayout());
    }

    private void addComponents() {
        AGDJPanelGenerateData panelGenerateData = new AGDJPanelGenerateData();
        this.add(panelGenerateData.getJPanelGenerateData());
    }

    public JPanel getJPanelMain() {
        return this;
    }
}
