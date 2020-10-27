/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma
 *   Date: 27-10-2020
 *   Time: 10:59
 *   File: MyCalender.java
 */

package defination;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class MyCalender {
    public void numberOfDaysLeftInMonth() {
        Date date = new Date();
        String[] monthNames = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        Year year = Year.now();
        Calendar calendar = Calendar.getInstance();
        int todayDate = Integer.parseInt(calendar.getTime().toString().split(" ")[2]);
        int monthNumber = calendar.get(Calendar.MONTH);
        Month month = Month.valueOf(monthNames[monthNumber]);
        switch (month) {
            case JANUARY:
            case FEBRUARY:
            case MARCH:
            case APRIL:
            case MAY:
            case JULY:
            case JUNE:
            case AUGUST:
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                if (year.isLeap() && month == Month.FEBRUARY) {
                    todayDate++;
                }
                System.out.println("Today's Date is: " + todayDate);
                System.out.println(month + " have " + month.getDaysInMonth() + " days");
                System.out.println("Days left in month is: " + (month.getDaysInMonth() - todayDate));
        }
    }
}
