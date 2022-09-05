package testpackage;

import java.util.Scanner;

public class testEnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LAGRE");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
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