


import org.junit.Test;

import javax.swing.*;

public class Outline {

    public static void main(String[] args) {

        getFrame();
    }

    @Test
    public static void getFrame(){
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1920,1080);

        frame.setVisible(true);

        frame.setTitle("周期小帮手");

        JPanel root = new JPanel();

        frame.setContentPane(root);

        JButton button = new JButton();

        root.add(button);
    }

    public static void getPanel(){
        JPanel panel = new JPanel();


    }



}



