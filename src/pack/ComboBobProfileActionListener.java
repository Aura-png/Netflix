package pack;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ComboBobProfileActionListener implements ActionListener {

    private JFrame closeFrame;
    private JFrame openFrame;
    private JComboBox<String> jcombo;
    public ComboBobProfileActionListener(JComboBox<String> j,JFrame open,JFrame close) {
        this.jcombo=j;
        this.closeFrame=close;
        this.openFrame=open;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice= (String) jcombo.getSelectedItem();
        switch (Objects.requireNonNull(choice)){
            case "Sign out":
            {
                this.closeFrame.setVisible(false);
                this.openFrame.setVisible(true);
                break;
            }
            case "Account":
            {
                break;
            }
            case "Settings":
            {
                break;
            }
            default:
            {
                break;
            }
        }

    }
}
