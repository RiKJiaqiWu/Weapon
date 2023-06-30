import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DayLabel extends JButton implements ActionListener {

    JButton button = new JButton();

    String Text = null;
    public DayLabel(String text,Color labelColor){
        this.setText(text);
        super.setHorizontalAlignment(JButton.CENTER);
        this.setMargin(new Insets(0,0,0,0));
        this.setOpaque(true);
        this.setBackground(labelColor);
        this.addActionListener(this);
        Text = text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
            System.out.println(Text);
        }
    }
}
