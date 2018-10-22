package date;
/**
 * @author Gabe Walsh
 * Date class shows the day month year
 */

public class Date {
    public int month;
    public int day;
    public int year;

    /**
     * constcutor method for date class
     *
     * @param day
     * @param month
     * @param year
     */
    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);

    }


    /**
     * getter method for month
     *
     * @return
     */
    public int getMonth() {
        return month;
    }

    /***
     * set method for month
     * @param month
     */

    public void setMonth(int month) {
        if (month > 12) {
            this.month = 1;
        } else {
            this.month = month;
        }

    }

    /**
     * getter method for day
     *
     * @return
     */
    public int getDay() {
        return day;
    }

    /**
     * set method for day
     *
     * @param day
     */
    public void setDay(int day) {
        if (day > 31) {
            this.day = 1;
        } else {
            this.day = day;
        }
    }

    /**
     * getter method for Year
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * set method for year
     *
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * display date method
     * displays date in month day year format
     */

    public void displayDate() {
        System.out.printf("TODAY IS %d/%d/%d", getMonth(), getDay(), getYear());
    }
}