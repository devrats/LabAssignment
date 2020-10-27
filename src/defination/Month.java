/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma
 *   Date: 27-10-2020
 *   Time: 10:59
 *   File: Month.java
 */

package defination;

public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int DAYS_IN_MONTH;

    Month(int daysInMonth) {
        this.DAYS_IN_MONTH = daysInMonth;
    }

    public int getDaysInMonth() {
        return DAYS_IN_MONTH;
    }
}
