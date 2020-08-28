package maituananh.com.agd.jpanel.parentsubjpanel.subjpanelgd;

import maituananh.com.agd.actioncomponents.jbutton.AGDActionButton;
import maituananh.com.agd.actioncomponents.jbuttonimpl.AGDActionButtonAddMain;
import maituananh.com.agd.actioncomponents.jbuttonimpl.AGDActionButtonRemoveMain;
import maituananh.com.agd.agdcomponents.*;
import maituananh.com.agd.commonstatic.AGDCommonStringFinal;
import maituananh.com.agd.model.AGDModelDynamic;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AGDJPanelCenterGenerateData extends JPanel {
    private JPanel mJPanelEmptyForFistRecord;
    private AGDModelDynamic mAGDModelDynamicAtStart;
    private ArrayList<AGDModelDynamic> mAGDModelDynamicList;
    private JScrollPane mJScrollPane;
    private JPanel jPanelTableName;
    private JLabel jLabelTableName;
    private JTextField jTextFieldTableName;
    private FlowLayout fLowLayoutTableName;

    public AGDJPanelCenterGenerateData() {
        createComponents();
        createLayout();
        setScrollBarPolicy();
        setLayout(mAGDModelDynamicAtStart);
        setSizeComponents(mAGDModelDynamicAtStart);
        addComponents(mAGDModelDynamicAtStart);
        actionComponents(mAGDModelDynamicAtStart);
    }

    private void actionComponents(AGDModelDynamic inAGDModelDynamic) {
        AGDActionButton actionButton = new AGDActionButtonAddMain(this, inAGDModelDynamic);
        inAGDModelDynamic.getAgdJButton().getButtonAdd().addActionListener(actionButton);
        actionButton = new AGDActionButtonRemoveMain(this, inAGDModelDynamic);
        inAGDModelDynamic.getAgdJButton().getButtonRemove().addActionListener(actionButton);
    }

    private void setLayout(AGDModelDynamic inAGDModelDynamic) {
        if (this.getAGDModelDynamicList().size() == 1) {
            fLowLayoutTableName = new FlowLayout(FlowLayout.LEFT);
            jPanelTableName.setLayout(fLowLayoutTableName);
        }
        inAGDModelDynamic.getJPanelLine().setLayout(new BoxLayout(inAGDModelDynamic.getJPanelLine(), BoxLayout.X_AXIS));
    }

    private void createLayout() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private void createComponents() {
        mAGDModelDynamicList = new ArrayList<>();
        mAGDModelDynamicAtStart = new AGDModelDynamic(new JPanel(), new JPanel(), new JPanel(), new AGDJTextField(),
                new AGDJCombobox(), new AGDJTextField(), new AGDJButton(), new JLabel());
        mAGDModelDynamicList.add(mAGDModelDynamicAtStart);
        mJScrollPane = new JScrollPane(this);
        mJPanelEmptyForFistRecord = new JPanel();
        jPanelTableName = new JPanel();
        jLabelTableName = new JLabel(AGDCommonStringFinal.TABLE_NAME);
        jTextFieldTableName = new JTextField();
    }

    private void setScrollBarPolicy() {
        mJScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        mJScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mJScrollPane.setAutoscrolls(true);
    }

    public JScrollPane getScroll() {
        return mJScrollPane;
    }

    private void addComponents(AGDModelDynamic inAGDModelDynamic) {
        if (this.getAGDModelDynamicList().size() == 1) {
            this.add(Box.createRigidArea(new Dimension(0, 7)));
            fLowLayoutTableName.setHgap(10);
            jPanelTableName.add(jLabelTableName);
            jPanelTableName.add(jTextFieldTableName);
            this.add(jPanelTableName);
        }
        inAGDModelDynamic.getJPanelLine().add(Box.createRigidArea(new Dimension(10, 0)));
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJTextFieldColumnName());
        inAGDModelDynamic.getJPanelLine().add(Box.createRigidArea(new Dimension(10, 0)));
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJComboboxDataType());
        inAGDModelDynamic.getJPanelLine().add(Box.createRigidArea(new Dimension(10, 0)));
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getAgdJTextFieldCharacterLength());
        inAGDModelDynamic.getJPanelLine().add(Box.createRigidArea(new Dimension(10, 0)));
        inAGDModelDynamic.getJPanelLineButtons().add(inAGDModelDynamic.getAgdJButton().getButtonAdd());
        inAGDModelDynamic.getJPanelLineButtons().add(inAGDModelDynamic.getJLabelEmpty());
        inAGDModelDynamic.getJLabelEmpty().setVisible(false);
        inAGDModelDynamic.getJPanelLineButtons().add(inAGDModelDynamic.getAgdJButton().getButtonRemove());
        inAGDModelDynamic.getJPanelLine().add(inAGDModelDynamic.getJPanelLineButtons());
        if (this.getAGDModelDynamicList().size() == 1) {
            this.add(this.mJPanelEmptyForFistRecord);
        }
        this.add(inAGDModelDynamic.getJPanelLine());
        this.add(inAGDModelDynamic.getJPanelLineEmpty());
    }

    private void setSizeComponents(AGDModelDynamic inAGDModelDynamic) {
        if (this.getAGDModelDynamicList().size() == 1) {
            jPanelTableName.setMaximumSize(new Dimension(Short.MAX_VALUE, 35));
            jTextFieldTableName.setPreferredSize(new Dimension(200, 30));
        }
        this.mJPanelEmptyForFistRecord.setMaximumSize(new Dimension(Short.MAX_VALUE, 10));
        inAGDModelDynamic.getJPanelLineEmpty().setMaximumSize(new Dimension(Short.MAX_VALUE, 10));
        inAGDModelDynamic.getJPanelLine().setMaximumSize(new Dimension(Short.MAX_VALUE, 30));
        inAGDModelDynamic.getAgdJComboboxDataType().setPreferredSize(new Dimension(160, 30));
        inAGDModelDynamic.getAgdJTextFieldColumnName().setPreferredSize(new Dimension(160, 30));
        inAGDModelDynamic.getAgdJTextFieldCharacterLength().setPreferredSize(new Dimension(160, 30));
        inAGDModelDynamic.getJPanelLineButtons().setPreferredSize(new Dimension(130, 30));
        inAGDModelDynamic.getAgdJButton().getButtonAdd().setPreferredSize(new Dimension(30, 25));
        inAGDModelDynamic.getAgdJButton().getButtonRemove().setPreferredSize(new Dimension(30, 25));
        inAGDModelDynamic.getJLabelEmpty().setPreferredSize(new Dimension(30, 22));
    }

    private AGDModelDynamic setUpNewJPanelLine() {
        AGDModelDynamic aGDModelDynamicAtClick = new AGDModelDynamic(new JPanel(), new JPanel(), new JPanel(),
                new AGDJTextField(), new AGDJCombobox(), new AGDJTextField(), new AGDJButton(), new JLabel());
        mAGDModelDynamicList.add(aGDModelDynamicAtClick);
        setLayout(aGDModelDynamicAtClick);
        addComponents(aGDModelDynamicAtClick);
        setSizeComponents(aGDModelDynamicAtClick);
        return aGDModelDynamicAtClick;
    }

    public ArrayList<AGDModelDynamic> getAGDModelDynamicList() {
        return mAGDModelDynamicList;
    }

    public void createPanelLine() {
        AGDModelDynamic aGDModelDynamicAtClick = setUpNewJPanelLine();
        actionComponents(aGDModelDynamicAtClick);
    }
}
