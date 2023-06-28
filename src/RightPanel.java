import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RightPanel extends LayoutAdapter {

    List<Component> list = new ArrayList<>();

    @Override
    public void addLayoutComponent(Component comp, Object constraints) {
        list.add(comp);
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        list.remove(comp);
    }

    @Override
    public void layoutContainer(Container parent) {

        int x = 20;

        int y = 20;

        int edge = 20;

        int width = parent.getWidth();

        int height = parent.getHeight();

        Component[] labels = parent.getComponents();

        for(int i = 0;i < 6;i++){

            Component l = labels[i];

//            x = (width-edge)/2+(i-1)*80-30;
            if(i != 0) {
                x += 80;
            }

            l.setBounds(x,y,edge,edge);

            i++;

            l = labels[i];

            l.setBounds(x+20,y+5,edge*3,10);
        }

        Component title = labels[6];

        title.setBounds(20,60,60,10);

        Component text = labels[7];

        text.setBounds(20,80,300,300);



//        int x = 30;
//        int y = 30;
//        int width = parent.getWidth();
//        int height = parent.getHeight();
//        Component[] labels = parent.getComponents();
//
//        int flag = 0;
//        for(int i = 0;i < list.size();i++){
//            Component l = labels[i];
//            l.setBounds(x,y,width,height);
//            flag++;
//            x += 90;
//            if(flag == 7){
//                flag = 0;
//                y += 50;
//                x = 30;
//            }
//        }
    }

}
