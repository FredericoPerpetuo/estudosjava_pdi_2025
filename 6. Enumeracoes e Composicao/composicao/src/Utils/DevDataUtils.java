package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DevDataUtils {

    public static Date buildDtdiaMesAno(String data)  {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = sdf.parse(data);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return date;
    }
}
