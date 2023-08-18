package comme;

import java.util.regex.Pattern;
/*
*   ^:行开头
*   ^-:以符号-为开头
    \\d：匹配一个数字字符。\\d等价于[0-9]数字  \d是表示0-9的一个数字。正则表达式在运用到有些编程语言的时候需要转义一下，比如java就需要写成\\d
    +：出现至少1次
    .：任意字符，除换行和回车之外
    ？：出现0或1次
    (.\d+)?：括号里内出现0或1次
    $：行结尾
    合起来就是：
    行开头、至少出现一次数字、(任意字符和至少出现一次数字)出现1次或0次、行结尾
* */
public class zhengzebiaodas {
    public static void main(String[] args) {
        /*
        *
        * */
        //Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
        Pattern pattern = Pattern.compile("^[+-]?[0-9]+(\\.[0-9]+)?$");
        System.out.println(pattern.pattern());
        boolean b = Pattern.matches("\\d+","2223"); //Pattern.matches("^[+-]?[0-9]+(\.[0-9]+)?$",score)等价于pattern.matcher(score).matches()
        System.out.println(b);
        String score = "+15.111111111111";
        if(pattern.matcher(score).matches()){
            System.out.println(score+":true");
        }else {
            System.out.println(score+":false");
        }



        //测试 匹配 123.456 -123.456 123 -123 123.abc -123.abc
        Pattern pattern1 = Pattern.compile("^-?[0-9]+(\\.[0-9]+)?(\\.[a-z]+)?$");
        String testStr ="-123.abc";
        if(pattern1.matcher(testStr).matches()){
            System.out.println(testStr+":true");
        }else {
            System.out.println(testStr+":false");
        }
    }
}

