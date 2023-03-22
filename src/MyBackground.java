import javax.swing.*;

public class MyBackground {

    private String filepath;

    private Icon icon;

    public MyBackground(String temp_filepath,Icon temp_icon){
        this.filepath = temp_filepath;
        this.icon = temp_icon;
    }

    public Icon getIcon(){
        return icon;
    }
}
