import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Initialize {

    public static Bin dayBin = Bin.getInstance();
    public static void main(String[] args) throws IOException {

        List<Color> ColorList = new ArrayList<>();

        ColorList.add(new Color(51,102,255));
        ColorList.add(new Color(245,184,0));
        ColorList.add(new Color(102,255,51));
        ColorList.add(new Color(122,122,122));

        dayBin.getInitialized();

        System.out.println(dayBin.dayList.get(3).workdayflag);

        MyFrame Init = new MyFrame("周期小帮手");

        JPanel root = new JPanel();

        JScrollPane scrollPane = new JScrollPane();

        JPanel leftpanel = new JPanel();

        MyLayout LayOut = new MyLayout();

        JPanel rightpanel = new JPanel();

        rightpanel.setPreferredSize(new Dimension(300,600));

        JSplitPane outline = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPane,rightpanel);

        outline.setDividerLocation(500);

        outline.setContinuousLayout(true);

//        Init.setContentPane(outline);

        leftpanel.setBorder(new EmptyBorder(5,5,5,5));

        leftpanel.setLayout(LayOut);

//        scrollPane.add(leftpanel);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        scrollPane.setViewportView(leftpanel);

//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        int j = 0;

        for(int i = 0;i < dayBin.dayList.size();i++){

            int index = j % 12;

            index = index/4;

            if(dayBin.dayList.get(i).workdayflag) {

                leftpanel.add(new DayLabel(dayBin.dayList.get(i).strDate, ColorList.get(index)));

                j++;

            }else{

                leftpanel.add(new DayLabel(dayBin.dayList.get(i).strDate, ColorList.get(3)));
            }

        }

        leftpanel.setPreferredSize(new Dimension(680,LayOut.y+40));

        Init.add(outline);

//        scrollPane.setViewportView(root);
//
//        root.add(scrollPane,BorderLayout.CENTER);

    }

}
