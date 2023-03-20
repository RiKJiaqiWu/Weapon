import javax.swing.*;
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

        Init.setContentPane(root);

        root.setLayout(new MyLayout());

        for(int i = 0;i < dayBin.dayList.size();i++){

            int index = i % 12;

            index = index/4;

            if(dayBin.dayList.get(i).workdayflag) {

                root.add(new DayLabel(dayBin.dayList.get(i).strDate, ColorList.get(index)));

            }else{

                root.add(new DayLabel(dayBin.dayList.get(i).strDate, ColorList.get(3)));
            }

        }

//        root.add(new DayLabel("1", Color.cyan));
//        root.add(new DayLabel("2", Color.cyan));
//        root.add(new DayLabel("3", Color.cyan));
//        root.add(new DayLabel("4", Color.cyan));
//        root.add(new DayLabel("5", Color.cyan));
//        root.add(new DayLabel("6", Color.cyan));
    }
}
