package maituananh.com.agd.jpanel.parentsubjpanel;

import javax.swing.*;

public class AGDJScrollGenerateData {
    private JScrollPane jScrollPane;

    public AGDJScrollGenerateData() {
        AGDJPanelGenerateData agdJPanelGenerateData = new AGDJPanelGenerateData();
        jScrollPane = new JScrollPane(agdJPanelGenerateData);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

    public JScrollPane getJScrollPane() {
        return jScrollPane;
    }
}
