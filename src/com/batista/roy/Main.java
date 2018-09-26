package com.batista.roy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\roybatista\\Desktop\\Prepaid_Terminated_MSISDN_01052018060024.dat");
        Scanner scnr = null;
        try {
            scnr = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<ItemMSISDN> listaItens = new ArrayList<ItemMSISDN>();


        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            ItemMSISDN item = new ItemMSISDN();
            item.setMsisdn("6"+line);
            item.setFileName(file.getName());
            item.setData(Utils.fillDate(file.getName().split(".dat")[0].split("_")[3]));
            listaItens.add(item);
        }

        System.out.println(listaItens.get(0).getData().dateToTimestamp().toString());
        System.out.println(listaItens.size());




    }
}
