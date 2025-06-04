package funcionamento_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdfDiaMesAno = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfDiaMesAnoHoraMinSeg = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdfGmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data1 = new Date();
        Date data2 = new Date(System.currentTimeMillis());
        Date data3 = new Date(0L);
        Date data4 = new Date(1000L * 60L * 60L * 5L);

        System.out.println("FORMATO PADRÃO DE DATAS NO JAVA");
        System.out.println("Data 1 = " + data1);
        System.out.println("Data 2 = " + data2);
        System.out.println("Data 3 = " + data3);
        System.out.println("Data 4 = " + data4);

        System.out.println("\nFORMATO dd/MM/yyyy");
        System.out.println("Data 1 = " + sdfDiaMesAno.format(data1));
        System.out.println("Data 2 = " + sdfDiaMesAno.format(data2));
        System.out.println("Data 3 = " + sdfDiaMesAno.format(data3));
        System.out.println("Data 4 = " + sdfDiaMesAno.format(data4));

        System.out.println("\ndd/MM/yyyy HH:mm:ss");
        System.out.println("Data 1 = " + sdfDiaMesAnoHoraMinSeg.format(data1));
        System.out.println("Data 2 = " + sdfDiaMesAnoHoraMinSeg.format(data2));
        System.out.println("Data 3 = " + sdfDiaMesAnoHoraMinSeg.format(data3));
        System.out.println("Data 4 = " + sdfDiaMesAnoHoraMinSeg.format(data4));

        System.out.println("\ndd/MM/yyyy HH:mm:ss");
        System.out.println("Data 1 = " + sdfGmt.format(data1));
        System.out.println("Data 2 = " + sdfGmt.format(data2));
        System.out.println("Data 3 = " + sdfGmt.format(data3));
        System.out.println("Data 4 = " + sdfGmt.format(data4));

        //Intanciação de datas utilizando Strings como argumentos
        Date data5 = sdfDiaMesAno.parse("25/11/2024");
        Date data6 = sdfDiaMesAnoHoraMinSeg.parse("25/11/2024 10:30:15");
        Date data7 = Date.from(Instant.parse("2024-11-25T10:30:15Z"));
        System.out.println("\ndd/MM/yyyy HH:mm:ss");
        System.out.println("Data 5 = " + sdfDiaMesAnoHoraMinSeg.format(data5));
        System.out.println("Data 6 = " + sdfDiaMesAnoHoraMinSeg.format(data6));
        System.out.println("Data 7 = " + sdfDiaMesAnoHoraMinSeg.format(data7));
    }
}