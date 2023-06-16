package testpackage;

public class testString {
    public static void main(String[] args) {
        String str="重庆农村商业银行";
        if (str.contains("银行"))
            System.out.println("包含该字段!");
        else
            System.out.println("不包含该字段!");

        if (str.equals("重庆农村商业银行"))
            System.out.println("str的字符串为："+str);

        Integer a = 123;
        System.out.println(a.toString());

        String str2 = "QWERTYUIOP";
        String str3 = "qwertyuiop";
        if (str2.equals(str3))       //会区分大小写
            System.out.println("str2.equals(str3) 成立");
        else
            System.out.println("str2.equals(str3) 不成立");

        if (str2.equalsIgnoreCase(str3))   //会忽略大小写
            System.out.println("str2.equalsIgnoreCase(str3)成立");

        int i=0;
        String sellerPHouseCount = "123.456.789";
        if(sellerPHouseCount.indexOf(".")!= -1 && Integer.parseInt(sellerPHouseCount.split("\\.")[1])>0)
            i = Integer.parseInt(sellerPHouseCount.split("\\.")[0])+1;

        System.out.println(sellerPHouseCount.indexOf(".")); //3
        System.out.println(sellerPHouseCount.split("\\.")[0]); //123
        System.out.println(sellerPHouseCount.split("\\.")[1]); //456
        System.out.println(sellerPHouseCount.split("\\.")[2]); //789
        System.out.println(i);
    }
}
