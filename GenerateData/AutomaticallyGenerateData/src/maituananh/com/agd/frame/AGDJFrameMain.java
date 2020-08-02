package maituananh.com.agd.frame;

import maituananh.com.agd.commonstatic.*;
import maituananh.com.agd.jpanel.*;

import javax.swing.*;
import java.awt.*;

public class AGDJFrameMain extends JFrame{
    private AGDJPanelMain panelMain;

    public AGDJFrameMain() {
        setSizeJFrameMain();
        addComponent();
        setLocationRelativeToJFrameMain();
        setTitleJFrameMain();
        setResizable();
        setVisibleJFrameMain();
    }

    private void setSizeJFrameMain() {
        this.setSize(AGDCommonNumberFinal.WIDTH, AGDCommonNumberFinal.HEIGHT);
    }

    private void setVisibleJFrameMain() {
        this.setVisible(true);
    }

    private void setLocationRelativeToJFrameMain() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    private void setTitleJFrameMain() {
        this.setTitle(AGDCommonStringFinal.TITLE);
    }

    private void addComponent() {
        panelMain = new AGDJPanelMain();
        this.add(panelMain.getJPanelMain(), BorderLayout.CENTER);
    }

    private void setResizable() {
        this.setResizable(false);
    }
}
