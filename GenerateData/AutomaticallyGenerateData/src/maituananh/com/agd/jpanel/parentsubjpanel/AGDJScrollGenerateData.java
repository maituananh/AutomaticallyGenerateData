package maituananh.com.agd.jpanel.parentsubjpanel;

import javax.swing.*;

public class AGDJScrollGenerateData {
    private JScrollPane jScrollPane;

    public AGDJScrollGenerateData() {
        AGDJPanelGenerateData agdJPanelGenerateData = new AGDJPanelGenerateData();
        jScrollPane = new JScrollPane(agdJPanelGenerateData,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    }

    public JScrollPane getJScrollPane() {
        return jScrollPane;
    }
}
