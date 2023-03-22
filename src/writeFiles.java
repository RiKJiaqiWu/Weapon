import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class writeFiles {

    public static void main(String[] args) {

        writeFiles log = new writeFiles();

        log.writelog();
    }

    int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

    public void writelog() {

        StringBuffer stringBuffer = new StringBuffer();
        int day = 7;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < month[i]; j++) {
                if( day>=6 ){
                    stringBuffer.append("2023-" + (i + 1) + "-" + (j + 1)).append(",0").append('\n');
                }else {
                    stringBuffer.append("2023-" + (i + 1) + "-" + (j + 1)).append(",1").append('\n');
                }
                day+=1;
                if(day>7){
                    day = 1;
                }
            }
        }
        System.out.println(stringBuffer);
        Path filePath = Paths.get("usages/LogFiles2023","Mapping2023.txt");
        try {
            if (Files.notExists(filePath, LinkOption.NOFOLLOW_LINKS)) {
                Files.createFile(filePath);
            }
                Files.writeString(filePath,stringBuffer.toString(),StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        File file = new File("src/LogFiles2023");  //地址
//        PrintStream ps = new PrintStream(new FileOutputStream(file));
//        FileOutputStream fos = new FileOutputStream(file);
//        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//        ps.println(new String(stringBuffer.toString().getBytes(), "utf-8"));
//        try {
//            osw.write(stringBuffer.toString());
//            osw.flush();
//            osw.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
