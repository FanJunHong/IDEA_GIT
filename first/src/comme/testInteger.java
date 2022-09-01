package comme;

public class testInteger {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 1;  //在编译时会翻译成为 Integer b = Integer.valueOf(1);
        Integer c = 1;
        System.out.println(a == b); //true
        System.out.println(c == b); //true
        System.out.println(c == a); //true
        System.out.println(c.equals(b)); //true
        String str = c.toString();
        System.out.println(str);

        String[] str1 ={"89","12","10","18","35"};
        int sum = 0;
        for (int i=0;i<str1.length;i++)
        {
            sum += Integer.parseInt(str1[i]);
        }
        System.out.println(sum);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);
    }
}
