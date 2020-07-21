package br.com.exemplos.datatime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        SimpleDateFormat f = new SimpleDateFormat("MMM");
        SimpleDateFormat f1 = new SimpleDateFormat("dd");
        SimpleDateFormat f2 = new SimpleDateFormat("a");
        int h;

        if (Calendar.getInstance().get(Calendar.HOUR) == 0) h = 12;
        else h = Calendar.getInstance().get(Calendar.HOUR);

        String filename = "Current Date is :"
                + f1.format(new Date())
                + f.format(new Date())
                + h + f2.format(new Date());
        System.out.println(filename);

    }
}
