package maituananh.com.agd.agdcomponents;

import maituananh.com.agd.commonstatic.AGDCommonStringFinal;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AGDJButton {
    private JButton mButtonAdd;
    private JButton mButtonRemove;

    public AGDJButton() {
        setUpIcon(AGDCommonStringFinal.PATH_ICON_ADD, AGDCommonStringFinal.PATH_ICON_REMOVE);
    }

    private void setUpIcon(String inPathIcon1, String inPathIcon2) {
        try {
            BufferedImage buttonIcon1 = ImageIO.read(new File(inPathIcon1));
            BufferedImage buttonIcon2 = ImageIO.read(new File(inPathIcon2));
            createButtonIcon(buttonIcon1, buttonIcon2);
            setContentAreaFilledForButton();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createButtonIcon(BufferedImage buttonIcon1, BufferedImage buttonIcon2) {
        this.mButtonAdd = new JButton(new ImageIcon(buttonIcon1));
        this.mButtonRemove = new JButton(new ImageIcon(buttonIcon2));
    }

    private void setContentAreaFilledForButton() {
        //this.buttonAdd.setBorder(BorderFactory.createEmptyBorder());
        //this.buttonRemove.setBorder(BorderFactory.createEmptyBorder());
        this.mButtonAdd.setContentAreaFilled(false);
        this.mButtonRemove.setContentAreaFilled(false);
    }

    public JButton getButtonAdd() {
        return this.mButtonAdd;
    }
    public JButton getButtonRemove() {
        return this.mButtonRemove;
    }

}
