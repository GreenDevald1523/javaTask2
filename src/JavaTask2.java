import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaTask2 {
    public static void main(String[] args) {
        System.out.println("1 задача");
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 1));

        System.out.println('\n');

        System.out.println("2 задача");
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));

        System.out.println('\n');

        System.out.println("3 задача");
        System.out.println(isAvgWhole(new int[]{1, 3}));
        System.out.println(isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println(isAvgWhole(new int[]{1, 5, 6}));
        System.out.println(isAvgWhole(new int[]{1, 1, 1}));
        System.out.println(isAvgWhole(new int[]{9, 2, 2, 5}));


        System.out.println('\n');

        System.out.println("4 задача");
        System.out.println(cumulativeSum(new int[]{1, 2, 3}));
        System.out.println(cumulativeSum(new int[]{1, -2, 3}));
        System.out.println(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3}));

        System.out.println('\n');

        System.out.println("5 задача");
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));

        System.out.println('\n');

        System.out.println("6 задача");
        System.out.println(Fibonacci(3) );
        System.out.println(Fibonacci(7) );
        System.out.println(Fibonacci(12) );

        System.out.println('\n');

        System.out.println("7 задача");
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));

        System.out.println('\n');

        System.out.println("8 задача");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));

        System.out.println('\n');

        System.out.println("9 задача");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));

        System.out.println('\n');

        System.out.println("10 задача");
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(5));
        System.out.println(boxSeq(6));

    }

    public static String repeat(String word, int num) {
        char[] result = word.toCharArray();
        String fin = "";

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < num; j++) {
                fin += result[i];
            }
        }

        return fin;
    }

    public static int differenceMaxMin(int[] args) {
        int mx = args[0];
        int min = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] > mx) {
                mx = args[i];
            }
            if (args[i] < min) {
                min = args[i];
            }
        }
        return mx - min;
    }

    public static boolean isAvgWhole(int[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
            count++;
        }
        if (sum % count == 0) {
            return true;
        }
        return false;
    }

    public static String cumulativeSum(int[] arr)
    {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            temp[i] = 0;
            for (int j = 0; j <= i; j++)
            {
                temp[i] += arr[j];
            }
        }
        return Arrays.toString(temp);
    }

    public static int getDecimalPlaces(String num) {
        int count = 0;
        if (num.indexOf(".") > 0) {
            for (int i = num.indexOf(".") + 1; i < num.length(); i++) {
                count++;
            }
        }
        return count;
    }

    public static int Fibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        int sum = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean isValid(String val) {
        if (val.length() == 5) {
            try {
                Integer.parseInt(val);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } return false;
    }

    public static boolean isStrangePair(String str1, String str2) {
        if (str1 == "" && str2 == "") {
            return true;
        } else if ((str1.charAt(0) == str2.charAt(str2.length() - 1)) && (str1.charAt(str1.length() - 1) == str2.charAt(0))) {
            return true;
        }
        return false;
    }

    public static boolean isPrefix(String word, String prefix) {
        for (int i = 0; i < prefix.length() - 1; i++) {

            if (word.charAt(i) != prefix.charAt(i)) {

                return false;
            }
        }
        return true;
    }

    public static boolean isSuffix(String word, String suffix) {
        int j = 1;
        for (int i = word.length() - suffix.length() + 1; i < word.length(); i++) {
            if (word.charAt(i) != suffix.charAt(j++)) {
                return false;
            }
        }
        return true;
    }

    public static int boxSeq(int step) {
        int amount = 0;
        {
            for (int i = 1; i <= step; i++) {
                if (i % 2 == 1) {
                    amount += 3;
                } else {
                    amount -= 1;
                }
            }
        }
        return amount;
    }
}