package maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd;

import maituananh.com.agd.actioncomponents.AGDActionButtonAddDynamic;
import maituananh.com.agd.actioncomponents.AGDActionButtonRemoveDynamic;
import maituananh.com.agd.agdcomponents.*;
import maituananh.com.agd.jpanel.parentsubjpanel.AGDJPanelGenerateData;
import maituananh.com.agd.model.AGDModelDynamic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AGDJPanelCenterGenerateData extends JPanel {
    private JButton mJButtonAdd;
    private JButton mJButtonRemove;
    private JLabel mJLabelEmpty;
    private JPanel mJPanelLine;
    private JPanel mJPanelLineButtons;
    private AGDModelDynamic mAGDModelDynamicAtStart;
    private AGDJPanelGenerateData mAGDJPanelGenerateData;
    private ArrayList<AGDModelDynamic> mAGDModelDynamicList;
    private JScrollPane mJScrollPane;

    public AGDJPanelCenterGenerateData(AGDJPanelGenerateData inAGDJPanelGenerateData) {
        this.mAGDJPanelGenerateData = inAGDJPanelGenerateData;
        setBackground();
        createComponents();
        createLayout();
        setLayout(mAGDModelDynamicAtStart);
        setSizeComponents(mAGDModelDynamicAtStart);
        addComponents(mAGDModelDynamicAtStart);
        setButtonAdd(mAGDModelDynamicAtStart);
        setButtonRemove(mAGDModelDynamicAtStart);
        setJPanelLineButtons(mAGDModelDynamicAtStart);
        setJPanelLine(mAGDModelDynamicAtStart);
        setJLabelEmpty(mAGDModelDynamicAtStart);
    }

    private void setBackground() {
        this.setBackground(Color.black);
    }

    private void setLayout(AGDModelDynamic inAGDModelDynamic) {
        inAGDModelDynamic.getJPanelLine().setLayout(new BoxLayout(inAGDModelDynamic.getJPanelLine(), BoxLayout.X_AXIS));
    }

    private void createLayout() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private void createComponents() {
        mAGDModelDynamicList = new ArrayList<>();
        mAGDModelDynamicAtStart = new AGDModelDynamic(new JPanel(), new JPanel(), new JLabel(), new AGDJTextField(),
                new AGDJCombobox(), new AGDJTextField(), new AGDJButton());
        mAGDModelDynamicList.add(mAGDModelDynamicAtStart);
        mJScrollPane = new JScrollPane(this);
        mJScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        mJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

    public JScrollPane getScroll() {
        return mJScrollPane;
    }

    private void addComponents(AGDModelDynamic inAGDModelDynamic) {
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJTextFieldColumnName());
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJComboboxDataType());
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJTextFieldCharacterLength());
        inAGDModelDynamic.getJPanelLineButtons().add(inAGDModelDynamic.getAgdJButton().getButtonAdd());
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

    public void setJLabelEmpty(AGDModelDynamic inJLabel) {
        mJLabelEmpty = inJLabel.getJLabelEmpty();
    }

    public JLabel getJLabelEmpty() {
        return mJLabelEmpty;
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
        aGDModelDynamicAtClick.getAgdJButton().getButtonAdd().addActionListener(
                new AGDActionButtonAddDynamic(aGDModelDynamicAtClick, this));
    }

    private AGDModelDynamic setUpNewJPanelLine() {
        AGDModelDynamic aGDModelDynamicAtClick = new AGDModelDynamic(new JPanel(), new JPanel(), new JLabel(),
                new AGDJTextField(), new AGDJCombobox(), new AGDJTextField(), new AGDJButton());
        mAGDModelDynamicList.add(aGDModelDynamicAtClick);
//        setRowGridLayout();
        setLayout(aGDModelDynamicAtClick);
        addComponents(aGDModelDynamicAtClick);
        setSizeComponents(aGDModelDynamicAtClick);
        return aGDModelDynamicAtClick;
    }

    public ArrayList<AGDModelDynamic> getAGDModelDynamicList() {
        return mAGDModelDynamicList;
    }
}
