import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyButton extends JButton {

    public MyButton(String text, Color buttonColor){
        this.setText(text);
        this.setOpaque(true);
        this.setBackground(buttonColor);
//        this.setPreferredSize(new Dimension(40,40));
    }

    @Override
    public ActionListener[] getActionListeners() {
        return super.getActionListeners();
    }
}
