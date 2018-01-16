package com.zisal.arisancounter;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created on 1/16/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class Main {

    public static void main(String args []) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd-MM-yyyy");
        int nPlayer = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Input Number of Player"));
        String startTime = JOptionPane.showInputDialog(null, "Please Input Date Start");
        int nContribution = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Input Number of Contribution"));

        Date dateStart = null;
        try {
            dateStart = inputFormat.parse(startTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int earnSingle = (nPlayer * nContribution);
        int earnAll = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Input Number of Your Player"));
        Date finishedTime = addNWeeksToDate(nPlayer, dateStart);
        System.out.println("Finished Time : " + inputFormat.format(finishedTime));
        System.out.println("Earn :" + earnSingle);
        System.out.println("Earn All :" + (earnSingle * earnAll));
    }

    public static Date addNWeeksToDate(int p_NumberOfWeeksToAdd, Date p_DateToModify){
        Calendar c = Calendar.getInstance();
        c.setTime(p_DateToModify);
        c.add(Calendar.WEEK_OF_MONTH, p_NumberOfWeeksToAdd);
        return c.getTime();
    }
}
