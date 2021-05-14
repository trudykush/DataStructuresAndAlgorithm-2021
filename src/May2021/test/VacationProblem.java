package May2021.test;

import sun.util.calendar.CalendarUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class VacationProblem {

    private static Calendar cacheCalendar;

    public static void main(String[] args) throws ParseException {
        cacheCalendar = Calendar.getInstance();
        String x = getFirstMonday(2014, Calendar.APRIL);
        System.out.println(x);

        String y = getLastSunday(Calendar.MAY, 2014);
        System.out.println(y);

        Date date1= null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(x);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(y);

        int result = option1(date1, date2);
        System.out.println("The result ->  " + result);
    }

    public static int option1(Date start, Date end) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(start);

        int weeks = 0;
        while (cal.getTime().before(end)) {
            cal.add(Calendar.WEEK_OF_YEAR, 1);
            weeks++;
        }
        return weeks;
    }

   /* public static int getWeeksBetween(final Date start, final Date end) {
        final Calendar c1 = Calendar.getInstance(Locale.US);
        final Calendar c2 = Calendar.getInstance(Locale.US);

        // Skip time part! Not sure if this is needed, but I wanted clean dates.
        setDateWithNoTime(c1, start);
        setDateWithNoTime(c2, end);

        goToFirstDayOfWeek(c1);
        goToFirstDayOfWeek(c2);

        int weeks = 0;
        while (c1.compareTo(c2) < 0) {
            c1.add(Calendar.WEEK_OF_YEAR, 1);
            weeks++;
        }

        return weeks;
    }*/

    /*public static int goToFirstDayOfWeek(final Calendar calendar) {
        final int firstDayOfWeek = calendar.getFirstDayOfWeek();
        calendar.set(Calendar.DAY_OF_WEEK, firstDayOfWeek);

        return firstDayOfWeek;
    }

    public static void setDateWithNoTime(final Calendar calendar, final Date date) {
        calendar.setTime(date);
        clearTime(calendar);
    }*/

    /*public static void clearTime(final Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }*/

    public static String getFirstMonday(int year, int month) {
        cacheCalendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        cacheCalendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
        cacheCalendar.set(Calendar.MONTH, month);
        cacheCalendar.set(Calendar.YEAR, year);
        int monthAsCountOne = month + 1;
        String x = cacheCalendar.get(Calendar.DATE) +"/"+ monthAsCountOne +"/"+ cacheCalendar.get(Calendar.YEAR);
        System.out.println(x);
        return x;
//        return cacheCalendar.get(Calendar.DATE);
    }

    public static String getLastSunday(int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, Calendar.JUNE, 1);
        int dayOftheWeek = cal.get(Calendar.DAY_OF_WEEK);
        int val = dayOftheWeek == Calendar.SUNDAY ? -7: -(dayOftheWeek-1);
        cal.add(Calendar.DAY_OF_MONTH, val);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println( sdf.format( cal.getTime())  );
        return sdf.format( cal.getTime());
//        return cal.getTime();
    }

    private int getMonthNumber(String month) {
        switch (month) {
            //case Janu
        }
        return -1;
    }

}
