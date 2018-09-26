package com.batista.roy;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.sql.Timestamp.*;

public class Data {
    private String dia;
    private String mes;
    private String ano;
    private String hora;
    private String minuto;
    private String segundo;

    public Data(String dia, String mes, String ano, String hora, String minuto, String segundo){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public LocalDateTime dateToTimestamp(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(toString(), format);
        LocalDateTime dateTime1 = dateTime;
        return dateTime1.toDa ;//.valueOf(dateTime.toString());
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto + ":" + segundo;
    }
}
