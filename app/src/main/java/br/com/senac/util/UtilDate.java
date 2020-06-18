package br.com.senac.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class UtilDate {

    /**
     * Convertendo Data para String no Formato DD/MM/AAAA
     *
     * @param data
     * @return String
     * @throws Exception
     */
    public static String data(java.util.Date data)  {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return df.format(data);
    }
}
