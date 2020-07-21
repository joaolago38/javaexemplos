package br.com.exemplos.datatime;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("h");
        System.out.println("hour in h format : " + sdf.format(date));
    }


}
