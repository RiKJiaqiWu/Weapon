import java.io.IOException;
import java.util.List;

public class Initialize {

    public static Bin dayBin = Bin.getInstance();

    public static void main(String[] args) throws IOException {

        dayBin.getInitialized();

        System.out.println(dayBin.dayList.get(14).location);
    }
}
