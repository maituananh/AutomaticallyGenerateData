package maituananh.com.agd.jpanel;

import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;

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
