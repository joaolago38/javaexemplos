package br.com.exemplos.datatime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainTest {
    public static void main(String[] argv) throws Exception {
        String str1 = "dd-MMM-yy";
        Date d = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(str1, Locale.FRENCH);
        System.out.println(sdf.format(d));
        sdf = new SimpleDateFormat(str1, Locale.ENGLISH);
        System.out.println(sdf.format(d));
    }
}
