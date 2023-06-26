import javax.swing.*;

public class Text extends JLabel {

    public Text(String title,int x,int y,int width,int height) {
        this.setText(title);
        this.setLocation(x,y);
        this.setSize(width,height);
    }
}
