package maituananh.com.agd.jpanel.parentsubjpanel;

import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelBottomGenerateData;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelCenterGenerateData;
import maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd.AGDJPanelTopGenerateData;

import javax.swing.*;
import java.awt.*;

public class AGDJPanelGenerateData extends JPanel {
    private AGDJPanelTopGenerateData panelTopGenerateData;
    private AGDJPanelCenterGenerateData panelCenterGenerateData;
    private AGDJPanelBottomGenerateData panelBottomGenerateData;
    private BorderLayout borderLayout;

    public AGDJPanelGenerateData() {
        createLayout();
        setLayout();
        createComponents();
        addComponents();
        setSizeComponents();
        setGap();
    }

    private void createLayout() {
        borderLayout = new BorderLayout();
    }

    private void setLayout() {
        this.setLayout(borderLayout);
    }

    private void createComponents() {
        panelTopGenerateData = new AGDJPanelTopGenerateData();
        panelCenterGenerateData = new AGDJPanelCenterGenerateData();
        panelBottomGenerateData = new AGDJPanelBottomGenerateData();
    }

    private void addComponents() {
        this.add(panelTopGenerateData.getTopPanel(), BorderLayout.NORTH);
        this.add(panelCenterGenerateData.getScroll(), BorderLayout.CENTER);
        this.add(panelBottomGenerateData.getBottomPanel(), BorderLayout.SOUTH);
    }

    private void setSizeComponents() {
        panelTopGenerateData.setPreferredSize(new Dimension(0, 50));
        panelBottomGenerateData.setPreferredSize(new Dimension(0, 50));
    }

    private void setGap() {
        borderLayout.setVgap(10);
    }

    public AGDJPanelCenterGenerateData getPanelCenterGenerateData() {
        return panelCenterGenerateData;
    }

    public JPanel getJPanelGenerateData() {
        return this;
    }
}
