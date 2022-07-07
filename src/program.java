import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class program {

    private final  static String   reg =  "^B";
    private  final static String text = "B2345";
    private static  Pattern pattern;
    private  static Matcher matcher;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean match = true;
        pattern = Pattern.compile(reg);

        System.out.print("Mã SInh viên:  ");
        String text   = input.nextLine();

        match = pattern.matcher(text).lookingAt();
        if (match) {
            text = pattern.matcher(text).replaceFirst("");
            try{
                int sau = Integer.parseInt(text.trim());
                System.out.println("Thành công");
            }catch (Exception ex) {
                System.out.println(ex);
                System.out.println("Mã sinh viên có dạng Bxxxxxxx với x là 1 số nguyên từ 1 đến 9");
            }

        } else {
            System.out.println("Chữ cái đầu phải là B");
        }
    }
}
