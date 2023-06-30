import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DailyText extends JTextArea {

    private StringBuilder dailytext = new StringBuilder(3000);

    String pathName = new String("usages/DailyLogFile/");

//    String fileName;

    public StringBuilder getFile(String fileName) throws IOException{

        File pathdir = new File(pathName);

        int flag = 0;

        File[] files = pathdir.listFiles();

        if(files != null && files.length > 0){

            for(File file:files){

                if(file.getName().equals(fileName)){
                    flag = 1;
                    FileInputStream inputStream = new FileInputStream(file);
                    dailytext = dailytext.append(inputStream.readAllBytes());
                }
            }
        }
        if(flag != 1){
            File newfile = new File(pathdir,fileName);
            newfile.createNewFile();
        }

        return dailytext;
    }

    public DailyText(){
        this.setText(dailytext.toString());
        this.setFont(new Font("monospaced", Font.PLAIN, 14));
        this.setLineWrap(true);
        this.setEditable(true);
//        JScrollPane scroll = new JScrollPane(this);
//        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.add(scroll);
//
//        final JFrame theFrame = new JFrame();
//        theFrame.setTitle("textTastico");
//        theFrame.setSize(1100, 1000);
//        theFrame.setLocation(550, 25);
//        theFrame.add(mainPanel); //add the panel to the frame
//        theFrame.setVisible(true);
        System.out.print(this.getText()); //double check output!!!

    }

}
