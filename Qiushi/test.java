/**
 * Created by liqiushi on 6/21/14.
 */
public class test {
    public static void main(String[] args) {
        String s = "     ";
        String[] split = s.split("");

        System.out.println(s.length());
        System.out.println(split.length);
        System.out.println(s.trim().length());

        for (String a : split) {
            if (a.equals(""))
                System.out.print("+");
            else
                System.out.print(a);
        }
    }
}
