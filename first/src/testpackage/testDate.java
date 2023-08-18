package testpackage;

import netscape.javascript.JSObject;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
public class testDate {

    public static void main(String[] args) {
        String str1 = "2022-01-18";
        String str2 = "2022-9-17";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = sdf3.parse(str1);
            Date date2 = sdf3.parse(str2);
            double time1 = (date2.getTime()-date1.getTime()) /(1000*60*60*24);
            System.out.println(time1);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        try {
            String date = sdf3.format(new Date());
            Date date1 = sdf3.parse(date);
            Date date2 = sdf3.parse(str2);
            long time1 = date2.getTime()-date1.getTime();
            System.out.println(time1/(1000*60*60*24));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        int a= Integer.parseInt(String.valueOf(864L));
        System.out.println(a);
        double b = Double.parseDouble(String.valueOf(Integer.parseInt(String.valueOf(864L))));
        System.out.println(b);

        try {
            String str4 = "2022-10";
            SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
            Date date4 = sdf4.parse(str4);
            Calendar now = Calendar.getInstance();
            now.setTime(date4);
            System.out.println("now="+now.getTime());
            now.add(Calendar.MONTH, -12);
            System.out.println("now="+now.getTime()); //当前时间减去12个月后的时间
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        if(!Arrays.asList("4","5","6").contains("1"))
        {
            System.out.println("该值不在Arrays内");
        }
        else {
            System.out.println("该值在Arrays内");
        }

        try {
            SimpleDateFormat sdf99 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            SimpleDateFormat sdf100 = new SimpleDateFormat("HHmmssSSS");
            String date98 = sdf99.format(new Date());
            String date99 = sdf100.format(new Date());
            System.out.println("date98:"+date98);
            System.out.println("date99:"+date99);
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
