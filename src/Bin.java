import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Bin {

    List<Day> dayList = new ArrayList<Day>();

    public static Bin dayBin = new Bin();

    public static Bin getInstance(){
         return dayBin;
    }


    class Day {

        int location;
        String strDate;
        String logName;

        boolean workdayflag;

        private Day(int temp_location, String temp_strdate,String temp_workdayflag) {
            this.location = temp_location;
            this.strDate = temp_strdate;
            this.logName = temp_strdate + "_logFile";
            if(Integer.valueOf(temp_workdayflag)==0) {
                this.workdayflag = false;
            }else{
                this.workdayflag = true;
            }
            System.out.println(this.workdayflag);
        }
    }

    @Test
    public void getInitialized() throws IOException {

        workdayMapping Mapping2023 = new workdayMapping();

        List<String> workDayList = Mapping2023.getMapping_ver1p0();

        int i = 0;

        for(String temp : workDayList) {
            if(i == 36 ){
                i = 0;
            }
            String[] temp_string = temp.split(",");
            dayBin.dayList.add(new Day(i,temp_string[0],temp_string[1]));
            i++;
        }
    }

}
