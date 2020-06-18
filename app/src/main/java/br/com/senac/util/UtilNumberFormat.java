package br.com.senac.util;

import java.text.NumberFormat;

public class UtilNumberFormat {

    public static String deDecimalParaString(String decimal) {
        return NumberFormat.getInstance().format(decimal.toString());

    }

    public static String deDecimalParaString(Double decimal) {
        return NumberFormat.getInstance().format(decimal);
    }


    public static String deDecimalParaCelciusFormatado(Double decimal) {
       String formatado =  deDecimalParaString(decimal);

       String celciusFormatado = formatado+"C";
       return celciusFormatado;
    }

}
