import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class kidBasicStuff{

    public static boolean findOutIsLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0){
            return true;
        }else if (year % 100 == 0 && year % 400 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static List<Integer> checkLeapYearTillNow(int year){
        int currentYear = 2023;
        List<Integer>allLeapYear = new ArrayList<>();
        for (int i = year; i <= currentYear; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 100 == 0 && i % 400 == 0) {
                allLeapYear.add(i);
        }
    }
        return allLeapYear;
    }

    public static int calculate(int num){
        if (num == 0) {
            return 1;
        }else{
            return num * calculate(num - 1);
        }
    }

    public static int getFibonacciNum(int n){
        int a = 1;
        int b = 1;
        int c = 0;
        if(n == 0) return 0;
        if(n == 1 || n == 0) return 1;
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int findOutGCDInTwoNumbers(int x,int y){
        int gcd = 1;
        if(x == 0 && y == 0) return 0;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void findOutLCMInTwoNumbers(int x,int y){
        int lcm = (x > y)? x : y;
        while (true) {
            if (lcm % x == 0 && lcm  % y == 0) {
                System.out.println(lcm);
                break;
            }
            lcm ++;
        }
    }

    public static boolean checkPalindromeString(String originalString){
        String reverserString = "";
        int strLength = originalString.length();
        for (int i = strLength - 1; i >= 0; i--) {
            reverserString = reverserString + originalString.charAt(i);
        }
        if (originalString.toUpperCase().equals(reverserString.toUpperCase())) {
            return true;
        }else{
            return false;
        }
    }

    public static int findOutArmStrong(int num){
        if (num != 1000) {
            int one = num % 10;
            int two = num / 10 % 10;
            int three = num / 100 % 10;
            if (num == one * one * one + two * two * two + three * three * three) {
                System.out.println(num);
            }
            return findOutArmStrong(num + 1);
        }
        return 0;
    }


    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while (true) {
            if (binary == 0) {
                break;
            }else{
                int temp = binary%10;
                decimal += temp * Math.pow(2, n);
                binary /= 10;
                n ++;
            }
        }
        return decimal;
    }

    public static void main(String[] args) throws ParseException {
        int result = findOutGCDInTwoNumbers(11, 20);
        System.out.println(result);
        findOutLCMInTwoNumbers(120, 72);
        boolean b1 = checkPalindromeString("madam");
        System.out.println(b1);
        findOutArmStrong(1);
        String decimal = Integer.valueOf("23", 8).toString();
        System.out.println(decimal);
        System.out.println(getDecimal(1011));
        String sDate = "12-12-1992";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date d = sdf.parse(sDate);
        System.out.println(d);

        String changeToString = sdf.format(d);
        System.out.println(changeToString);

    }
}