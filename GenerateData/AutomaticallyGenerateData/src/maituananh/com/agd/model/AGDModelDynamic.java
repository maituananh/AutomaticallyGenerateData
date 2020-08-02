package maituananh.com.agd.model;

import maituananh.com.agd.agdcomponents.*;

import javax.swing.*;

public class AGDModelDynamic {
    private JPanel mJPanelLine;
    private JPanel mJPanelLineButtons;
    private AGDJTextField mAGDJTextFieldColumnName;
    private AGDJCombobox mAGDJComboboxDataType;
    private AGDJTextField mAGDJTextFieldCharacterLength;
    private AGDJButton mAGDJButton;
    private JLabel mJLabelEmpty;
    private JPanel mJPanelLineEmpty;

    public AGDModelDynamic() {
    }

    public AGDModelDynamic(JPanel inJPanelLine, JPanel inJPanelLineButtons, JPanel inJPanelLineEmpty,
                           AGDJTextField inAGDJTextFieldColumnName, AGDJCombobox inAGDJComboboxDataType,
                           AGDJTextField inAGDJTextFieldCharacterLength, AGDJButton inAGDJButton, JLabel inJLabelEmpty) {
        this.mJPanelLine = inJPanelLine;
        this.mJPanelLineButtons = inJPanelLineButtons;
        this.mAGDJTextFieldColumnName = inAGDJTextFieldColumnName;
        this.mAGDJComboboxDataType = inAGDJComboboxDataType;
        this.mAGDJTextFieldCharacterLength = inAGDJTextFieldCharacterLength;
        this.mAGDJButton = inAGDJButton;
        this.mJLabelEmpty = inJLabelEmpty;
        this.mJPanelLineEmpty = inJPanelLineEmpty;
    }

    public JPanel getJPanelLine() {
        return mJPanelLine;
    }

    public JPanel getJPanelLineButtons() {
        return mJPanelLineButtons;
    }

    public AGDJTextField getAgdJTextFieldColumnName() {
        return mAGDJTextFieldColumnName;
    }

    public AGDJCombobox getAgdJComboboxDataType() {
        return mAGDJComboboxDataType;
    }

    public AGDJTextField getAgdJTextFieldCharacterLength() {
        return mAGDJTextFieldCharacterLength;
    }

    public AGDJButton getAgdJButton() {
        return mAGDJButton;
    }

    public JLabel getJLabelEmpty() {
        return mJLabelEmpty;
    }

    public JPanel getJPanelLineEmpty() {
        return mJPanelLineEmpty;
    }
}
