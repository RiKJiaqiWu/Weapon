import javax.swing.*;
public class MyFrame extends JFrame {

    int width = 1100;

    int height = 600;

    public MyFrame(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(width,height);

        this.setVisible(true);

//        JPanel Bottom = new JPanel();
//
//        Bottom.setOpaque(false);

        ImageIcon imageIcon = new ImageIcon("usages/background.png");

        JLabel background = new JLabel();

        background.setIcon(imageIcon);

        background.setBounds(0, 0, this.width, this.height);

        super.getLayeredPane().add(background,new Integer(Integer.MIN_VALUE));
    }

}
