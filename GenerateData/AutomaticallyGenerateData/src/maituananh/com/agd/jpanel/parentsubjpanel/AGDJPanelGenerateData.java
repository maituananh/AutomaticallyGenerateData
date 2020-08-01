package maituananh.com.agd.jpanel.parentsubjpanel;

import maituananh.com.agd.actioncomponents.AGDActionButtonAddMain;
import maituananh.com.agd.actioncomponents.AGDActionButtonRemoveMain;
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
        actionComponents();
    }

    private void createLayout() {
        borderLayout = new BorderLayout();
    }

    private void setLayout() {
        this.setLayout(borderLayout);
    }

    private void createComponents() {
        panelTopGenerateData = new AGDJPanelTopGenerateData();
        panelCenterGenerateData = new AGDJPanelCenterGenerateData(this);
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

    private void actionComponents() {
        panelCenterGenerateData.getButtonAdd().addActionListener(new AGDActionButtonAddMain(this));
        panelCenterGenerateData.getButtonRemove().addActionListener(new AGDActionButtonRemoveMain(this));
    }
}
