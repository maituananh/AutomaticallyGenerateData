package maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd;

import maituananh.com.agd.commonstatic.AGDCommonStringFinal;

import javax.swing.*;
import java.awt.*;

public class AGDJPanelTopGenerateData extends JPanel {
    private GridLayout gridLayout;
    private JLabel jLabelColumnName;
    private JLabel jLabelDataType;
    private JLabel jLabelCharacterLength;
    private JLabel jLabelAction;

    public AGDJPanelTopGenerateData() {
        createLayout();
        setLayout();
        setBackground();
        createComponents();
        addComponents();
        setTextJLabel();
        setHorizontalAlignment();
    }

    private void setBackground() {
        this.setBackground(Color.LIGHT_GRAY);
    }

    private void setLayout() {
        this.setLayout(gridLayout);
    }

    private void createLayout() {
        gridLayout = new GridLayout(0, 4, 5, 0);
    }

    private void createComponents() {
        jLabelColumnName = new JLabel();
        jLabelDataType = new JLabel();
        jLabelCharacterLength = new JLabel();
        jLabelAction = new JLabel();
    }

    private void addComponents() {
        this.add(jLabelColumnName);
        this.add(jLabelDataType);
        this.add(jLabelCharacterLength);
        this.add(jLabelAction);
    }

    private void setHorizontalAlignment() {
        jLabelColumnName.setHorizontalAlignment(JLabel.CENTER);
        jLabelDataType.setHorizontalAlignment(JLabel.CENTER);
        jLabelCharacterLength.setHorizontalAlignment(JLabel.CENTER);
        jLabelAction.setHorizontalAlignment(JLabel.CENTER);
    }

    private void setTextJLabel() {
        jLabelColumnName.setText(AGDCommonStringFinal.COLUMN_NAME);
        jLabelDataType.setText(AGDCommonStringFinal.DATA_TYPE);
        jLabelCharacterLength.setText(AGDCommonStringFinal.CHARACTER_LENGTH);
        jLabelAction.setText(AGDCommonStringFinal.ACTION);
    }

    public JPanel getTopPanel() {
        return this;
    }
}
