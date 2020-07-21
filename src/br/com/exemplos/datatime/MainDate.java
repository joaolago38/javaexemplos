package br.com.exemplos.datatime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainDate {
    public static void main(String[] argv) throws Exception {
        Date d = new Date();
        SimpleDateFormat simpDate;
        simpDate = new SimpleDateFormat("kk:mm:ss");
        System.out.println(simpDate.format(d));
    }
}
