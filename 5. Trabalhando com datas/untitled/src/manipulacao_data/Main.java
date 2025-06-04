package manipulacao_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data = sdf.parse("25/11/2024 12:15:00");

        System.out.println(sdf.format(data));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.HOUR_OF_DAY, 4);
        data = calendar.getTime();

        System.out.println(sdf.format(data));
        System.out.println("Minutos:" + calendar.get(Calendar.MINUTE));
        //O mês vai de 0 a 11, por isso é necessário adicinar 1 para correção
        System.out.println("Mês:" + (1 + calendar.get(Calendar.MONTH)));
    }
}
