package maituananh.com.agd.model;

import maituananh.com.agd.agdcomponents.*;

import javax.swing.*;

public class AGDModelDynamic {
    private JPanel jPanelLine;
    private JPanel jPanelLineButtons;
    private JLabel labelEmpty; // create space between 2 button
    private AGDJTextField agdJTextFieldColumnName;
    private AGDJCombobox agdJComboboxDataType;
    private AGDJTextField agdJTextFieldCharacterLength;
    private AGDJButton agdjButton;

    public AGDModelDynamic() {
    }

    public AGDModelDynamic(JPanel jPanelLine, JPanel jPanelLineButtons, JLabel labelEmpty,
                           AGDJTextField agdJTextFieldColumnName, AGDJCombobox agdJComboboxDataType,
                           AGDJTextField agdJTextFieldCharacterLength, AGDJButton agdjButton) {
        this.jPanelLine = jPanelLine;
        this.jPanelLineButtons = jPanelLineButtons;
        this.labelEmpty = labelEmpty;
        this.agdJTextFieldColumnName = agdJTextFieldColumnName;
        this.agdJComboboxDataType = agdJComboboxDataType;
        this.agdJTextFieldCharacterLength = agdJTextFieldCharacterLength;
        this.agdjButton = agdjButton;
    }

    public JPanel getJPanelLine() {
        return jPanelLine;
    }

    public JPanel getJPanelLineButtons() {
        return jPanelLineButtons;
    }

    public JLabel getJLabelEmpty() {
        return labelEmpty;
    }

    public AGDJTextField getAgdJTextFieldColumnName() {
        return agdJTextFieldColumnName;
    }

    public AGDJCombobox getAgdJComboboxDataType() {
        return agdJComboboxDataType;
    }

    public AGDJTextField getAgdJTextFieldCharacterLength() {
        return agdJTextFieldCharacterLength;
    }

    public AGDJButton getAgdJButton() {
        return agdjButton;
    }
}
