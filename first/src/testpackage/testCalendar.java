package testpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testCalendar {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("当前时间是："+sdf.format(new Date()));
        System.out.println("当前时间是："+sdf1.format(new Date()));

        Calendar calendar = Calendar.getInstance();
        System.out.println("当前年份："+calendar.get(Calendar.YEAR));
        System.out.println("当前月份："+calendar.get(Calendar.MONTH));
        System.out.println("当前日份："+calendar.get(Calendar.DATE));

        Date time = calendar.getTime();
        System.out.println("当前时间："+time);
        System.out.println("当前时间(yyyy-MM-dd)："+sdf.format(time));
        calendar.add(Calendar.MONTH,-1);
        System.out.println("修改月份后的时间："+calendar.getTime());
        System.out.println("修改月份后的时间(yyyy-MM-dd)："+sdf.format(calendar.getTime()));
        calendar.add(Calendar.MONTH,+2);
        System.out.println("修改月份后的时间："+calendar.getTime());
        System.out.println("修改月份后的时间(yyyy-MM-dd)："+sdf.format(calendar.getTime()));
        System.out.println( calendar.getWeeksInWeekYear());
        System.out.println(calendar.getWeekYear());

    }
}
