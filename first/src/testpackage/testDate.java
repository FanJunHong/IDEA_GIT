package testpackage;

import java.text.SimpleDateFormat;
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

    }
}
