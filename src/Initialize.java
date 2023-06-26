import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
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

//leftpanel Setup
        JPanel leftpanel = new JPanel();

        leftpanel.setOpaque(false);

        leftpanel.setPreferredSize(new Dimension(680,3000));

        leftpanel.setBorder(new EmptyBorder(5,5,5,5));

        leftpanel.setLayout(new MyLayout());

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

//RightPane Setup
        JPanel rightpanel = new JPanel();

        rightpanel.setPreferredSize(new Dimension(300,600));

        rightpanel.setOpaque(false);

        for(int i = 0;i < 3;i++){

            JLabel ColorIcon = new DayLabel("      ", ColorList.get(i));

            ColorIcon.setBounds(i*40,0,40,40);

            JLabel wordFrame_1 = new JLabel("小周期" + (i+1));

            wordFrame_1.setBounds(i*40,40,40,40);

            rightpanel.add(ColorIcon);

            rightpanel.add(wordFrame_1);

        }
        rightpanel.add(new Text("DailyText:",80,0,100,100));

        rightpanel.add(new DailyText(100,0,100,100));

//        ImageIcon imageIcon = new ImageIcon("usages/background.png");
//
//        JLabel background = new JLabel();
//
//        background.setIcon(imageIcon);
//
//        background.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
//
//        rightpanel.add(background);


//ScrollPane Setup
        JScrollPane scrollPane = new JScrollPane();

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        scrollPane.setViewportView(leftpanel);

//SplitPane Setup
        JSplitPane outline = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPane,rightpanel);

        outline.setOpaque(false);

        outline.setDividerLocation(680);

        outline.setContinuousLayout(true);

//MyFrame Setup
        MyFrame Init = new MyFrame("周期小帮手");

        Init.add(outline);

    }

}
