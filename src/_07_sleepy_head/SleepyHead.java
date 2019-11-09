package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
    
        int weekdayResponse = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head v1.0", JOptionPane.YES_NO_OPTION);
        // note: for showConfirmDialog, no = 1 and yes = 0
        int vacationResponse = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head v1.0", JOptionPane.YES_NO_OPTION);

        isWeekday = weekdayResponse == 0;
        isVacation = vacationResponse == 0;
        
        /*
         * Print “sleep in! if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones! If it is a weekday, and we are on vacation,
         * print “sleep in!
         */
        
        if(isWeekday && !isVacation) {
        	JOptionPane.showMessageDialog(null, "Get up lazybones!");
        } else {
        	JOptionPane.showMessageDialog(null, "You can sleep in!");
        }
    }
}
