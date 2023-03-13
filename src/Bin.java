import org.junit.Test;

import java.io.IOException;
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


        private Day(int temp_location, String temp_strdate) {
            this.location = temp_location;
            this.strDate = temp_strdate;
            this.logName = temp_strdate + "_logFile";
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
            dayBin.dayList.add(new Day(i,temp));
            i++;
        }
    }

}
