package maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd;

import maituananh.com.agd.actioncomponents.AGDActionButtonRemoveDynamic;
import maituananh.com.agd.agdcomponents.*;
import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;
import maituananh.com.agd.model.AGDModelDynamic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AGDJPanelCenterGenerateData extends JPanel {
    private GridLayout mGridLayout;
    private JButton mJButtonAdd;
    private JButton mJButtonRemove;
    private JPanel mJPanelLine;
    private JPanel mJPanelLineButtons;
    private AGDModelDynamic mAGDModelDynamicAtStart;
    private AGDJPanelGenerateData mAGDJPanelGenerateData;
    private ArrayList<AGDModelDynamic> mAGDModelDynamicList;

    public AGDJPanelCenterGenerateData(AGDJPanelGenerateData inAGDJPanelGenerateData) {
        this.mAGDJPanelGenerateData = inAGDJPanelGenerateData;
        setBackground();
        createLayout();
        createComponents();
        setLayout(mAGDModelDynamicAtStart);
        setSizeComponents(mAGDModelDynamicAtStart);
        addComponents(mAGDModelDynamicAtStart);
        setButtonAdd(mAGDModelDynamicAtStart);
        setButtonRemove(mAGDModelDynamicAtStart);
        setJPanelLineButtons(mAGDModelDynamicAtStart);
        setJPanelLine(mAGDModelDynamicAtStart);
    }

    public JPanel getCenterPanel() {
        return this;
    }

    private void setBackground() {
        this.setBackground(Color.black);
    }

    private void setLayout(AGDModelDynamic inAGDModelDynamic) {
        inAGDModelDynamic.getJPanelLine().setLayout(mGridLayout);
    }

    private void createLayout() {
        mGridLayout = new GridLayout(1, 4, 10, 10);
    }

    private void createComponents() {
        mAGDModelDynamicList = new ArrayList<>();
        mAGDModelDynamicAtStart = new AGDModelDynamic(new JPanel(), new JPanel(), new JLabel(), new AGDJTextField(),
                new AGDJCombobox(), new AGDJTextField(), new AGDJButton());
        mAGDModelDynamicList.add(mAGDModelDynamicAtStart);
    }

    private void addComponents(AGDModelDynamic inAGDModelDynamic) {
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJTextFieldColumnName());
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJComboboxDataType());
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJTextFieldCharacterLength());
        inAGDModelDynamic.getJPanelLineButtons().add(mAGDModelDynamicAtStart.getAgdJButton().getButtonAdd());
        inAGDModelDynamic.getJPanelLineButtons().add(inAGDModelDynamic.getJLabelEmpty());
        inAGDModelDynamic.getJPanelLineButtons().add(inAGDModelDynamic.getAgdJButton().getButtonRemove());
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getJPanelLineButtons());
        this.add(inAGDModelDynamic.getJPanelLine());
    }

    private void setSizeComponents(AGDModelDynamic inAGDModelDynamic) {
        inAGDModelDynamic.getAgdJTextFieldColumnName().setPreferredSize(new Dimension(155, 30));
        inAGDModelDynamic.getAgdJComboboxDataType().setPreferredSize(new Dimension(155, 30));
        inAGDModelDynamic.getAgdJTextFieldCharacterLength().setPreferredSize(new Dimension(155, 30));
        inAGDModelDynamic.getAgdJButton().getButtonAdd().setPreferredSize(new Dimension(30, 22));
        inAGDModelDynamic.getAgdJButton().getButtonRemove().setPreferredSize(new Dimension(30, 22));
        inAGDModelDynamic.getJLabelEmpty().setPreferredSize(new Dimension(18, 0));
    }

    public void setButtonAdd(AGDModelDynamic inJButton) {
        mJButtonAdd = inJButton.getAgdJButton().getButtonAdd();
    }

    public JButton getButtonAdd() {
        return mJButtonAdd;
    }

    public void setButtonRemove(AGDModelDynamic inJButton) {
        mJButtonRemove = inJButton.getAgdJButton().getButtonRemove();
    }

    public JButton getButtonRemove() {
        return mJButtonRemove;
    }

    public void setJPanelLineButtons(AGDModelDynamic inJPanelLineButtons) {
        mJPanelLineButtons = inJPanelLineButtons.getJPanelLineButtons();
    }

    public JPanel getJPanelLineButtons() {
        return mJPanelLineButtons;
    }

    public void setJPanelLine(AGDModelDynamic inJPanelLine) {
        mJPanelLine = inJPanelLine.getJPanelLine();
    }

    public JPanel getJPanelLine() {
        return mJPanelLine;
    }

    public void createPanelLine() {
        AGDModelDynamic aGDModelDynamicAtClick = setUpNewJPanelLine();
        aGDModelDynamicAtClick.getAgdJButton().getButtonRemove().addActionListener(
                new AGDActionButtonRemoveDynamic(aGDModelDynamicAtClick, mAGDJPanelGenerateData, this));
    }

    private AGDModelDynamic setUpNewJPanelLine() {
        this.mAGDModelDynamicAtStart.getJPanelLineButtons().remove(getButtonAdd());
        AGDModelDynamic aGDModelDynamicAtClick = new AGDModelDynamic(new JPanel(), new JPanel(), new JLabel(),
                new AGDJTextField(), new AGDJCombobox(), new AGDJTextField(), new AGDJButton());
        mAGDModelDynamicList.add(aGDModelDynamicAtClick);
        setLayout(aGDModelDynamicAtClick);
        addComponents(aGDModelDynamicAtClick);
        setSizeComponents(aGDModelDynamicAtClick);
        return aGDModelDynamicAtClick;
    }

    public ArrayList<AGDModelDynamic> getAGDModelDynamicList() {
        return mAGDModelDynamicList;
    }
}
