import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DailyText extends JTextArea {

//    StringBuffer dailyText = new StringBuffer();

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
    }
}
