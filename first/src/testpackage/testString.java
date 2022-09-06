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


    }
}
