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
        int x = 50;
        int y = 50;
        int width = parent.getWidth();
        int height = parent.getHeight();
        Component[] labels = parent.getComponents();

        for(int i = 0;i < list.size();i++){
            Component l = labels[i];
            if(x>(width-50)){
                x = 50;
                y += 50;
            }
            l.setBounds(x,y,80,40);
            x += 90;

        }

    }
}
