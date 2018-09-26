package com.batista.roy;

public class Utils {

    public static Data fillDate(String dateNameOfFile) {
        String dia = dateNameOfFile.subSequence(0,2).toString();
        String mes = dateNameOfFile.subSequence(2,4).toString();
        String ano = dateNameOfFile.subSequence(4,8).toString();
        String hora = dateNameOfFile.subSequence(8,10).toString();
        String minuto = dateNameOfFile.subSequence(10,12).toString();
        String segundo = dateNameOfFile.subSequence(12,14).toString();
        return new Data(dia,mes,ano,hora,minuto,segundo);
    }

}
