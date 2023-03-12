import java.util.Date;

public class Bin {

    private Bin(){
        int location;
        Date date;
        String strDate;
    }

    public static Bin daybin = new Bin();

    public static Bin getInstance(){
        return daybin;
    }

}
