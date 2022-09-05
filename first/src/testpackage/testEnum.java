package testpackage;

import java.util.Scanner;

public class testEnum {
    public static void main(String[] args) {
        //获取枚举中的某个量
        Size se = Size.SMALL;
        System.out.println("枚举中的量："+se);

        //遍历枚举中的所有量
        System.out.println("枚举中的所有数据为：");
        for(Size se1: Size.values())
            System.out.print(se1+"  ");
        System.out.println(" ");

        //测试枚举中是否存在所输入的量
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LAGRE");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);  //valueOf()方法返回指定字符串的枚举常量
        System.out.println("size="+size);
        System.out.println("abbr="+size.getAbbr());
        if (size == size.EXTRA_LARGE)
            System.out.println("Good job");

    }
}

enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private Size(String abbr) {this.abbr = abbr;}
    public String getAbbr(){return abbr;}
    private String abbr;
}