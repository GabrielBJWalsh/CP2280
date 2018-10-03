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
     * @param day
     * @param month
     * @param year
     */
    public Date(int day,int month,int year){
        setDay(day);
        setMonth(month);

    }

}

    /**
     * getter method for month
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
        this.month = month;
    }

    /**
     * getter method for day
     * @return
     */
    public int getDay() {
        return day;
    }

    /**
     * set method for day
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * getter method for Year
     * @return
     */
    public int getYear() {
        return year;
    }

    /**
     * set method for year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }
