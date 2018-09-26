package com.batista.roy;

public class ItemMSISDN {
    private String msisdn;
    private String fileName;
    private Data data;
    private int numeroClube;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public int getNumeroClube() {
        return numeroClube;
    }

    public void setNumeroClube(int numeroClube) {
        this.numeroClube = numeroClube;
    }

    @Override
    public String toString() {
        return "MSISDN: " + msisdn + "\nFILENAME: " + fileName + "\nDATA: " + data.toString();
    }
}
