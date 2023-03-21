import javax.swing.*;
import java.awt.*;

public class DayLabel extends JLabel {
    public DayLabel(String text,Color labelColor){
        this.setText(text);
        this.setOpaque(true);
        this.setBackground(labelColor);
//        this.setPreferredSize(new Dimension(40,40));
    }
}
