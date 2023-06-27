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

        int x,y;

        x = 20;

        int edge = 20;

        int width = parent.getWidth();

        int height = parent.getHeight();

        Component[] labels = parent.getComponents();

        for(int i = 0;i < 6;i++){

            Component l = labels[i];

//            x = (width-edge)/2+(i-1)*80-30;
            x += i*20;

            l.setBounds(x,30,edge,edge);

            i++;

            l = labels[i];

            l.setBounds(x+20,30,edge*2,10);
        }



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
