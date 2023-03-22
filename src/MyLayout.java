import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyLayout extends LayoutAdapter {

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
        int x = 30;
        int y = 30;
        int width = parent.getWidth();
        int height = parent.getHeight();
        Component[] labels = parent.getComponents();

        int flag = 0;
        for(int i = 0;i < list.size();i++){
            Component l = labels[i];
            l.setBounds(x,y,80,40);
            flag++;
            x += 90;
            if(flag == 7){
                flag = 0;
                y += 50;
                x = 30;
            }
        }
    }

}
